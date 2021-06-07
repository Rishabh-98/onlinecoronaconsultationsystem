package com.coronaconsultation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coronaconsultation.entities.WardReport;

@Repository
public interface WardReportRepository extends JpaRepository<WardReport, Integer> {

}
