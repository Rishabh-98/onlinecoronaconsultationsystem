package com.coronaconsultation.service;

import com.coronaconsultation.entities.Ward;

public interface IWardService {
	
	public Ward createWard(Ward ward) ;
	
	public boolean updateWard(Ward ward);
	
	public Ward findById(int id);

}
