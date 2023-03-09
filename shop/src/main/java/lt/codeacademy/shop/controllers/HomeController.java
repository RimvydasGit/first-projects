package lt.codeacademy.shop.controllers;

import lt.codeacademy.shop.dto.ReceiptDto;
import lt.codeacademy.shop.services.ProductServices;
import lt.codeacademy.shop.services.ReceiptServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    ProductServices productServices;
    @Autowired
    ReceiptServices receiptServices;
    @GetMapping("/add-receipt")
    public String getAddReceipt(ReceiptDto receiptDto, Model model){
        model.addAttribute("receipt", productServices.getNewReceiptDto());
        return "add-receipt";
    }
    @PostMapping("/submit-receipt")
    public String submitReceipt(ReceiptDto receiptDto){
            System.out.println(receiptDto);
            receiptServices.saveReceipt(receiptDto);
        return "redirect:/api/receipts";
    }
//    @GetMapping("/receipts")
//    public String getReceipts(Model model){
//        model.addAttribute("receipts",r)
//    }
}
