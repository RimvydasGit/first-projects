package lt.codeacademy.shop.services;

import lt.codeacademy.shop.dto.InscriptionDto;
import lt.codeacademy.shop.dto.ReceiptDto;
import lt.codeacademy.shop.entities.Product;
import lt.codeacademy.shop.entities.Receipt;
import lt.codeacademy.shop.entities.Row;
import lt.codeacademy.shop.repositories.ProductRepository;
import lt.codeacademy.shop.repositories.ReceiptRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReceiptServices {
    Logger logger = LoggerFactory.getLogger(ReceiptServices.class);
    @Autowired
    ReceiptRepository receiptRepository;
    @Autowired
    ProductRepository productRepository;

    public List<ReceiptDto> getAll() {


    List<Receipt> oldReceipts = receiptRepository.findAll();
    return oldReceipts.stream()
            .map(k-> new ReceiptDto(k))
            .toList();
}
    public void saveReceipt(ReceiptDto receiptDto){
        logger.info(receiptDto.toString());
      List<Row> rows = new ArrayList<>();
        for (InscriptionDto inscriptionDto: receiptDto.getInscriptions()){
            if (inscriptionDto.getAmount()<=0)
                continue;
            Product product = productRepository.findById(inscriptionDto.getId()).get();
            Row row = new Row(product, inscriptionDto.getAmount());
            rows.add(row);
        }
        Receipt receipt = new Receipt(rows);
        receiptRepository.save(receipt);
    }
}
