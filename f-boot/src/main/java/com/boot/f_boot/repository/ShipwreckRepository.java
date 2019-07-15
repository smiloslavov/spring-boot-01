package com.boot.f_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.f_boot.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
