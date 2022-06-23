package com.rmcf.cocah.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmcf.cocah.DAO.CoachDAO;
import com.rmcf.cocah.json.CoachDetails;

@Service
public class CoachService {

	@Autowired
	private CoachDAO coachDao;
	
	public List<CoachDetails> getCoachDetails() {
		
		return (List<CoachDetails>) coachDao.findAll();
	}

	public CoachDetails addCoach(CoachDetails coach) {
		return coachDao.save(coach);
	}
}
