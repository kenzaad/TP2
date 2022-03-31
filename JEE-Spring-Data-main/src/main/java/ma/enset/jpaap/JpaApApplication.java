package ma.enset.jpaap;

import ma.enset.jpaap.entites.Patient;
import ma.enset.jpaap.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaApApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* for (int i=0; i<100; i++){
            patientRepository.save(new Patient(null,"hicham",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));

        }*/

        patientRepository.save(new Patient(null,"hicham",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"assia",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"hajar",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"ghita",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"ayoub",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"salma",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"hassan",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"asmaa",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"anass",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));
        patientRepository.save(new Patient(null,"hamza",new Date(),Math.random()>0.5?true:false,(int)(Math.random()*100)));

        Page<Patient> patients =patientRepository.findAll(PageRequest.of(0,3));
        System.out.println("Total Pages :"+patients.getTotalPages());
        System.out.println("Total Elements :"+patients.getTotalElements());
        System.out.println("Num Page :"+patients.getNumber());
        List<Patient> content = patients.getContent();
        /*Page<Patient> byMalade = patientRepository.findByMalade(true,PageRequest.of(0,5));
        List<Patient> patientList = patientRepository.chercherPatients("%a%",100);*/
        content.forEach(p->{
            System.out.println("==========================");
            System.out.println(p.getId());
            System.out.println(p.getNom());
            System.out.println(p.getScore());
            System.out.println(p.getDateNaissance());
            System.out.println(p.isMalade());
        });
        System.out.println("*****************************");
       /* Patient patient =patientRepository.findById(1L).orElse(null);
        if(patient !=null){
            System.out.println(patient.getNom());
            System.out.println(patient.isMalade());
        }
        patient.setScore(900);
        patientRepository.save(patient);

        patientRepository.deleteById(3L);*/
    }
}
