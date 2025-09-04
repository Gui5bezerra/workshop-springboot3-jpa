package com.guilhermesb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermesb.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
