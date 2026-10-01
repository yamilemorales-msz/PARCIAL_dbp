package org.lab.campuseats.repository;

import org.lab.campuseats.model.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {

    boolean existsByNameIgnoreCase(String name);

    Page<Store> findByOwnerId(Long ownerId, Pageable pageable);
}
