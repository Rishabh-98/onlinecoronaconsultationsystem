package com.coronaconsultation.service;

import com.coronaconsultation.entities.WardReport;

public interface IWardReportService {
	

	public boolean createWardReport(WardReport wardreport) ;
	
	public boolean updateWardReport(WardReport wardreport);
	
	public WardReport findById(int id);

}
