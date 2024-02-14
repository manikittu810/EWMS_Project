package com.finalProject.finalProject.data;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FarmerDataRepository extends JpaRepository<FarmerData,Integer> {
//    List<FarmerData> findAll(Sort sort);
}
