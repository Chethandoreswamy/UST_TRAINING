package com.ust.productRecommandation.Repository;

import com.ust.productRecommandation.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    List<Laptop> findByPriceLessThanEqualAndRamGreaterThanEqualAndScreenSizeGreaterThanEqualAndProcessorIn(
            BigDecimal maxPrice, int minRam, int minScreenSize, List<String> processors);

    List<Laptop> findByPriceLessThanEqualAndRamGreaterThanEqualAndStorageTypeAndWeightLessThanEqual(
            BigDecimal maxPrice, int minRam, String storageType, double maxWeight);

    List<Laptop> findByPriceLessThanEqualAndRamGreaterThanEqualAndScreenSizeGreaterThanEqualAndWeightLessThanEqual(
            BigDecimal maxPrice, int minRam, int minScreenSize, double maxWeight);
}
