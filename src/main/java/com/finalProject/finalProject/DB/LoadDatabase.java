package com.finalProject.finalProject.DB;

import com.finalProject.finalProject.data.FarmerData;
import com.finalProject.finalProject.data.FarmerDataRepository;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(FarmerDataRepository repository) {
        return args -> {
            //Read Data from  a csv file
            List<FarmerData> farmerData = readFarmerDataromCSV("farmers.csv");
            farmerData.sort(Comparator.comparingInt(FarmerData::getFarmerArea));
        };
    }

    private List<FarmerData> readFarmerDataromCSV(String fileName) {
        try (Reader reader = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(fileName)))) {
            if (reader == null) {
                throw new RuntimeException("The file " + fileName + " was not found in classpath");
            }
            return new CsvToBeanBuilder<FarmerData>(reader)
                    .withType(FarmerData.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    .parse();
        } catch (Exception e) {
            throw new RuntimeException("Failed to read farmer data from CSV file : " + fileName, e);
        }
    }

}
