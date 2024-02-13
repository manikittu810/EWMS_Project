package com.finalProject.finalProject.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerDataRepository extends JpaRepository<FarmerData,Integer> {
}
