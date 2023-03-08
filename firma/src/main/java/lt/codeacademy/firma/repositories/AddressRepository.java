package lt.codeacademy.firma.repositories;

import lt.codeacademy.firma.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepository extends JpaRepository<Address, Long> {
}
