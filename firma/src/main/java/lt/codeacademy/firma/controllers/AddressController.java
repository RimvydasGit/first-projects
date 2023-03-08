package lt.codeacademy.firma.controllers;

import lt.codeacademy.firma.entities.Address;
import lt.codeacademy.firma.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("/address/h")
    public String hello(){
        return "Hello Address";
    }
    @GetMapping("/address")
    public Iterable<Address> allBooks(){
        return addressService.findAll();
    }
}
