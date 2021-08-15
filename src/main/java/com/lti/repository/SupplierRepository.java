package com.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
