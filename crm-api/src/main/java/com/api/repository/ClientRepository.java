package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long>{

}
