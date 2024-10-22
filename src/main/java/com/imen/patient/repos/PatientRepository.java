package com.imen.patient.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.imen.patient.entities.Doctor;
import com.imen.patient.entities.Patient;
@RepositoryRestResource(path = "rest")
public interface PatientRepository extends JpaRepository<Patient, Long> {
  
	List<Patient> findByNomPatient(String nom);
	 List<Patient> findByNomPatientContains(String nom);
	 
	 /*@Query("select p from patient p where p.nomPatient like %?1 and p.prenomPatient> ?2")
	 List<Patient> findByNomPrenom(String nom, String prenom);
	*/
	 @Query("select p from Patient p where p.nomPatient like %:nom and p.prenomPatient = :prenom")
	 List<Patient> findByNomPrenom(@Param("nom") String nom, @Param("prenom") String prenom);
	 
	 @Query("select p from Patient p where p.doctor = ?1")
	 List<Patient> findByDoctor (Doctor doctor);
	 List<Patient> findByDoctorIdDoct(Long id);
	 List<Patient> findByOrderByNomPatientAsc();
	 
	 @Query("SELECT p FROM Patient p ORDER BY p.nomPatient ASC, p.MaladiePatient DESC")
	 List<Patient> trierPatientsNomMaladie();



}

