package com.registration.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.app.model.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
