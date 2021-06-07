package com.coronaconsultation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coronaconsultation.entities.Ward;

@Repository
public interface WardRepository extends JpaRepository<Ward, Integer> {

}
