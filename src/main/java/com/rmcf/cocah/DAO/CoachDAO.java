package com.rmcf.cocah.DAO;

import org.springframework.data.repository.CrudRepository;

import com.rmcf.cocah.json.CoachDetails;

public interface CoachDAO extends CrudRepository<CoachDetails,Integer> {


}
