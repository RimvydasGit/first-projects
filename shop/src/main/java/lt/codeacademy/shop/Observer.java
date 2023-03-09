package lt.codeacademy.shop;

import lt.codeacademy.shop.entities.Product;
import lt.codeacademy.shop.entities.Receipt;
import lt.codeacademy.shop.entities.Row;
import lt.codeacademy.shop.repositories.ProductRepository;
import lt.codeacademy.shop.repositories.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;


import java.util.List;

@Configuration
public class Observer {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ReceiptRepository receiptRepository;
    @EventListener
    public void refreshedEventHandler(ContextRefreshedEvent event) {
        if (productRepository.findAll().isEmpty()) {
            seedProductsDummyData();
            seedTestReceipt();
        }
    }

    private void seedProductsDummyData() {
        System.out.println("Hello products dummy data");
        List<Product> products = List.of(
        new Product("Milk 1L 3.2%",0.8d),
        new Product("Coffee caps Jacobs Classic, 10 x 5.2 g",3.14d),
        new Product("Grapes green seedless  500g",1.99d),
        new Product("Peer Conference  1kg",1.78d),
        new Product("Chicken file  1kg",2.99d),
        new Product("Cream 30%  400g",1.99d)
        );
        productRepository.saveAll(products);
    }
    private void seedTestReceipt(){
        Receipt receipt = new Receipt();
        receipt.addRow( new Row(productRepository.findById(1L).get(),2));
        receipt.addRow( new Row(productRepository.findById(3L).get(),1));
        receipt.addRow( new Row(productRepository.findById(5L).get(),2));
        receipt.addRow( new Row(productRepository.findById(6L).get(),1));
        receiptRepository.save(receipt);

    }

}
