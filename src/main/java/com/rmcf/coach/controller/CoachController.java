package com.rmcf.coach.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmcf.cocah.json.CoachDetails;
import com.rmcf.cocah.service.CoachService;

@RestController
@RequestMapping("/coach")
public class CoachController {
	
	private static final Logger log= LoggerFactory.getLogger(CoachController.class);

	@Autowired
	private CoachService coachService;

	@GetMapping("/all")
	public List<CoachDetails> getCoachDetails() {
		log.info("Inside getCoachdetails method of "+this.getClass());
		return coachService.getCoachDetails();
	}
	
	@PostMapping("/add")
	public CoachDetails addCoach(@RequestBody CoachDetails coach) {
		log.info("Inside addCoachDetails method of ");
		return coachService.addCoach(coach);
	}
}
