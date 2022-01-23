package com.mss.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCrud extends JpaRepository<MssEmployee,Integer> {

}
