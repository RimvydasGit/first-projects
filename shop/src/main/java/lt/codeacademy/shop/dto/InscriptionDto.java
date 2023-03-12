package lt.codeacademy.shop.dto;

import lt.codeacademy.shop.entities.Row;

public class InscriptionDto {
    Long id;
    String name;
    double price;
    int amount;
    double sum;

    public InscriptionDto() {
    }
    public InscriptionDto(Row row){
        this.id = row.getProduct().getId();
        this.name = row.getProduct().getName();
        this.price = row.getProduct().getPrice();
        this.amount = row.getAmount();
        this.sum = row.getSum();
    }

    @Override
    public String toString() {
        return "InscriptionDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", sum=" + sum +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
