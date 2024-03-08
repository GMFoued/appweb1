package net.devinfoplus.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.devinfoplus.spring.model.Client;

public interface ClientRepository extends JpaRepository <Client,Long> {

}
