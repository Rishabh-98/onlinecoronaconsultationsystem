package com.coronaconsultation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coronaconsultation.entities.WardReport;
import com.coronaconsultation.exception.WardReportException;
import com.coronaconsultation.service.WardReportServiceImpl;

@RestController

@RequestMapping("/api/wardreport/")
public class WardReportController {

	@Autowired
	private WardReportServiceImpl wardreportserviceimpl;

	@PostMapping("/")
	public boolean createWardReport(@RequestBody WardReport wardreport) {

		wardreportserviceimpl.createWardReport(wardreport);
		return true;
	}

	@PostMapping("/v1/")
	public ResponseEntity<Boolean> createWardReportV1(@RequestBody WardReport wardreport) {

		wardreportserviceimpl.createWardReport(wardreport);
		return new ResponseEntity<>(true, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public WardReport findById(@PathVariable int id) throws WardReportException {
		WardReport wardreport = wardreportserviceimpl.findById(id);
		return wardreport;
	}

	@GetMapping("/v1/{id}")
	public ResponseEntity<WardReport> findByIdV1(@PathVariable int id) {
		WardReport wardreport = wardreportserviceimpl.findById(id);

		return new ResponseEntity<WardReport>(wardreport, HttpStatus.OK);
	}

}