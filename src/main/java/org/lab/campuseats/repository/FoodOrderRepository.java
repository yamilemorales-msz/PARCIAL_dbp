package org.lab.campuseats.repository;

import org.lab.campuseats.model.FoodOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {

    Page<FoodOrder> findByUserId(Long userId, Pageable pageable);

    Page<FoodOrder> findByUserIdAndStatusIn(Long userId, Collection<String> statuses, Pageable pageable);

    Page<FoodOrder> findByStoreId(Long storeId, Pageable pageable);

    Page<FoodOrder> findByStoreIdAndStatus(Long storeId, String status, Pageable pageable);
}
