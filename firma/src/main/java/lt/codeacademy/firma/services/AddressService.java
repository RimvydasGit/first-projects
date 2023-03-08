package lt.codeacademy.firma.services;

import lt.codeacademy.firma.entities.Address;
import lt.codeacademy.firma.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public Iterable<Address> findAll() {
        return  addressRepository.findAll();
    }

    public void saveAll(List<Address> list) {

        addressRepository.saveAll(list);
    }

    public void save(Address address) {
        addressRepository.save(address);
    }
}
