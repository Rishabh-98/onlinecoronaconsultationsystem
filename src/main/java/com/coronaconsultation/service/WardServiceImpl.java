package com.coronaconsultation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coronaconsultation.entities.Ward;
import com.coronaconsultation.repository.WardRepository;
import com.coronaconsultation.exception.WardException;

@Service
public class WardServiceImpl implements IWardService {
	
	@Autowired
	private WardRepository wardRepository;

	@Override
	public Ward createWard(Ward ward) {
		
		wardRepository.save(ward);
		
		return ward;
	}

	@Override
	public boolean updateWard(Ward ward) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ward findById(int id) {
		// TODO Auto-generated method stub
		if(!wardRepository.existsById(id)) {
			throw new WardException("Ward Not Found");
		}
		
		Ward e =  wardRepository.findById(id).get();
		return e;
		
		
	}

}
