package com.imen.patient.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imen.patient.entities.Doctor;
import com.imen.patient.entities.Patient;
import com.imen.patient.repos.DoctorRepository;

@RestController
@RequestMapping("/api/doct")
@CrossOrigin("*")

public class DoctorRestController {
	
	@Autowired
	DoctorRepository doctorRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Doctor> getAllDoctors()
	{
	return doctorRepository.findAll();
	}
	@RequestMapping(value="/{idDoct}",method = RequestMethod.GET)
	public Doctor getDoctorById(@PathVariable("idDoct") Long idDoct) {
	return doctorRepository.findById(idDoct).get();
	}

	
	
}
