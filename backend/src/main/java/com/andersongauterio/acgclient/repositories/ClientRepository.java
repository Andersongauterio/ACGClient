package com.andersongauterio.acgclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andersongauterio.acgclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
