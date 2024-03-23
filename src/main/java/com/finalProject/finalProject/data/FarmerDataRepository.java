package com.finalProject.finalProject.data;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FarmerDataRepository extends JpaRepository<FarmerData,Long> {
    Optional<FarmerData> findByFarmerName(String farmerName);
}
