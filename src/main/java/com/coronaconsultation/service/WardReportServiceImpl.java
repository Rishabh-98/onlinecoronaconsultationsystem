package com.coronaconsultation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coronaconsultation.entities.WardReport;
import com.coronaconsultation.repository.WardReportRepository;
import com.coronaconsultation.exception.WardReportException;
import com.coronaconsultation.service.IWardReportService;
@Service
public class WardReportServiceImpl implements IWardReportService {
	
	@Autowired
	private WardReportRepository wardreportrepository;

	@Override
	public boolean createWardReport(WardReport wardreport) {
		// TODO Auto-generated method stub
		wardreportrepository.save(wardreport);
		
		return false;
	}

	@Override
	public boolean updateWardReport(WardReport wardreport) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public WardReport findById(int id) {
		// TODO Auto-generated method stub
		if(!wardreportrepository.existsById(id)) {
			throw new WardReportException("Ward Report Not Found");
		}
		
		WardReport e =  wardreportrepository.findById(id).get();
		return e;
	}

}
