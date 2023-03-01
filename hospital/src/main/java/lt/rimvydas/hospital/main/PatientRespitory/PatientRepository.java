package lt.rimvydas.hospital.main.PatientRespitory;

import lt.rimvydas.hospital.main.entities.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

}