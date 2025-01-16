package com.ilyass.microserviceproduitsspringcloudconfig.dao;

import com.ilyass.microserviceproduitsspringcloudconfig.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
}
