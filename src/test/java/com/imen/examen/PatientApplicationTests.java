package com.imen.examen;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.imen.patient.PatientApplication;
import com.imen.patient.entities.Doctor;
import com.imen.patient.entities.Patient;
import com.imen.patient.repos.PatientRepository;

@SpringBootTest(classes = PatientApplication.class) // Spécifie explicitement la classe de configuration
class PatientApplicationTests {

    @Autowired
    private PatientRepository patientrepository;

    @Test
    public void testCreatePatient() {
        Patient pat = new Patient("Moula", "imen", "1111", "Maladie 1", new Date());
        patientrepository.save(pat);
    }
    
    
    public void testFindPatient()
    {
    Patient p = patientrepository.findById(1L).get();
    System.out.println(p);
    }
    /*@Test
    public void testUpdatePatient()
    {
    Patient p = patientrepository.findById(1L).get();
    p.setMaladiePatient("Maladie 2");
    patientrepository.save(p);
    }*/
    
    @Test
    public void testDeletePatient()
    {
    	patientrepository.deleteById(1L);;
    }


		@Test
		public void testListerTousPatients()
		{
				List<Patient> pat = patientrepository.findAll();
				for (Patient p : pat)
				{
				System.out.println(p);
				}
		}
		
		@Test
		public void testfindByNomPatient()
		{
		List<Patient> pat = patientrepository.findByNomPatient("imen");
		for (Patient p : pat)
			{
			System.out.println(p);
			}
		}
		@Test
		public void testfindByNomPatientContains()
		{
		List<Patient> pat=patientrepository.findByNomPatientContains("imen");
		for (Patient p : pat)
			{
			System.out.println(p);
			} 
		}
		
		@Test
		public void testfindByNomPrenom()
		{
		List<Patient> pat = patientrepository.findByNomPrenom("moula", "imen");
		for (Patient p : pat)
		{
		System.out.println(p);
		}
		}
		
		@Test
		public void testfindByDoctor()
		{
		Doctor doct = new Doctor();
		doct.setIdDoct(1L);
		List<Patient> pat = patientrepository.findByDoctor(doct);
		for (Patient p : pat)
		{
		System.out.println(p);
		}
		}
		
		@Test
		public void findByDoctorIdDoct()
		{
		List<Patient> pat = patientrepository.findByDoctorIdDoct(1L);
		for (Patient p : pat)
		{
		System.out.println(p);
		}
		 }
		@Test
		public void testfindByOrderByNomPatientAsc()
		{
		List<Patient> pat =patientrepository.findByOrderByNomPatientAsc();
		for (Patient p : pat)
		{
		System.out.println(p);
		}
		}
		
		@Test
		public void testTrierPatientsNomMaladie() {
		    List<Patient> patients = patientrepository.trierPatientsNomMaladie();
		    for (Patient p : patients) {
		        System.out.println(p);
		    }
		}

		

}

