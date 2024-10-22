package com.imen.patient.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Patient {
	  
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idPatient;
    private String nomPatient ;
    private String prenomPatient;
    private String phonePatient;
    private String MaladiePatient; 
    private Date dateCreation;
    
    @ManyToOne
    private Doctor doctor;

	
	public Patient() {
		super();
	}
	public Patient(String nomPatient, String prenomPatient, String phonePatient, String maladiePatient,
			Date dateCreation) {
		super();
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.phonePatient = phonePatient;
		this.MaladiePatient = maladiePatient;
		this.dateCreation = dateCreation;
	}
	
	
	public Long getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(Long idPatient) {
		this.idPatient = idPatient;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public String getPrenomPatient() {
		return prenomPatient;
	}
	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}
	public String getPhonePatient() {
		return phonePatient;
	}
	public void setPhonePatient(String phonePatient) {
		this.phonePatient = phonePatient;
	}
	public String getMaladiePatient() {
		return MaladiePatient;
	}
	public void setMaladiePatient(String maladiePatient) {
		MaladiePatient = maladiePatient;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
				+ ", phonePatient=" + phonePatient + ", MaladiePatient=" + MaladiePatient + ", dateCreation="
				+ dateCreation + "]";
	}
	  
    

}
