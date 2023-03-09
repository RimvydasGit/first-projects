package lt.codeacademy.shop.controllers;

import lt.codeacademy.shop.dto.InscriptionDto;
import lt.codeacademy.shop.dto.ReceiptDto;
import lt.codeacademy.shop.entities.Product;
import lt.codeacademy.shop.entities.Receipt;
import lt.codeacademy.shop.entities.Row;
import lt.codeacademy.shop.repositories.ReceiptRepository;
import lt.codeacademy.shop.services.ProductServices;
import lt.codeacademy.shop.services.ReceiptServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    ReceiptRepository receiptRepository;
    @Autowired
    ProductServices productServices;
    @Autowired
    ReceiptServices receiptServices;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productServices.getAllProducts();
    }
    @GetMapping("/receipt")
    public Receipt getReceipt(){
       return receiptRepository.findById(1l).get();
    }
    @GetMapping("/receipts")
    public List<ReceiptDto> getReceiptsDto(){
        return receiptServices.getAll();
    }
    @GetMapping("/dto")
    public  ReceiptDto getEmptyDto(){

        return productServices.getNewReceiptDto();
    }
}
