package com.imen.patient.dto;

import java.util.Date;

import com.imen.patient.entities.Doctor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDTO {
	private Long idPatient;
    private String nomPatient ;
    private String prenomPatient;
    private String phonePatient;
    private String MaladiePatient; 
    private Date dateCreation;
    private String nomDoct;
	private Doctor doctor;

}
