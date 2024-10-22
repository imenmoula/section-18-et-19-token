package com.imen.patient.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.imen.patient.dto.PatientDTO;
import com.imen.patient.entities.Patient;
import com.imen.patient.service.PatientService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class PatientRestController {
	
	@Autowired
	PatientService patientservice;
	@RequestMapping(value="/patByName/{nom}",method = RequestMethod.GET)
	public List<Patient> findByNomPatientContains(@PathVariable("nom") String nom) {
	return patientservice.findByNomPatientContains(nom);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<PatientDTO> getAllPatients() {
	return patientservice.getAllPatients();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public PatientDTO getPatientById(@PathVariable("id") Long id) {
	return patientservice.getPatient(id);
	}
	

	@RequestMapping(method = RequestMethod.POST)
    public PatientDTO createPatient(@RequestBody PatientDTO patientDTO) {
        return patientservice.savePatient(patientDTO);
    }

	@RequestMapping(method = RequestMethod.PUT)
    public PatientDTO updatePatient(@RequestBody PatientDTO patientDTO) {
        return patientservice.updatePatient(patientDTO);
    }
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletePatient(@PathVariable("id") Long id)
	{
		patientservice.deletePatientById(id);
	}
	
	@RequestMapping(value="/patdoct/{idDoct}",method = RequestMethod.GET)
	public List<Patient> PatientsByDoctId(@PathVariable("idDoct") Long idDoct) {
	return patientservice.findByDoctorIdDoct(idDoct);
	}
	

}
