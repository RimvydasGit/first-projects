package lt.codeacademy.shop.dto;

import lt.codeacademy.shop.entities.Receipt;


import java.util.ArrayList;
import java.util.List;

public class ReceiptDto {
    Long id;
    List<InscriptionDto> inscriptions;
    double pvm;
    double sum;
    public ReceiptDto(){
    }
    public ReceiptDto(Receipt receipt){
        this.id = receipt.getId();
        this.inscriptions = new ArrayList<>();
//        for(Row el : receipt.getRows()){
//            inscriptions.add(new InscriptionDto(el));
//        }
        this.inscriptions = receipt.getRows()
                .stream()
                .map(e-> new InscriptionDto(e))
                .toList();
        this.sum = inscriptions.stream()
                .mapToDouble(e-> e.getSum())
                .sum();
        this.pvm = sum * 0.21f;
    }

    @Override
    public String toString() {
        String answer = "";
           answer = "ReceiptDto [ id = " + id +", inscriptions = " + inscriptions.toString() +
                " , pvm= " + pvm +
                " , sum= " + sum;
          return answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<InscriptionDto> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<InscriptionDto> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public double getPvm() {
        return pvm;
    }

    public void setPvm(double pvm) {
        this.pvm = pvm;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
