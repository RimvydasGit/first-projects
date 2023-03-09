package lt.codeacademy.shop.services;

import lt.codeacademy.shop.dto.InscriptionDto;
import lt.codeacademy.shop.dto.ReceiptDto;
import lt.codeacademy.shop.entities.Product;
import lt.codeacademy.shop.entities.Row;
import lt.codeacademy.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public ReceiptDto getNewReceiptDto() {
        ReceiptDto dto = new ReceiptDto();
        List<InscriptionDto> inscriptions = getAllProducts()
                .stream()
                .map(p -> new Row(p, 0))
                .map(e -> new InscriptionDto(e))
                .toList();
        dto.setInscriptions(inscriptions);
        return dto;
    }

}
