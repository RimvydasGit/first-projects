package lt.codeacademy.shop.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity(name = "receipt_row")
public class Row {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    Product product;
    int amount;

    public Row() {
    }

    @Override
    public String toString() {
        return "Row{" +
                "id=" + id +
                ", product=" + product +
                ", amount=" + amount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Row(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Row(Long id, Product product, int amount) {
        this.id = id;
        this.product = product;
        this.amount = amount;
    }

    public double getSum() {
        return product.price * amount;
    }
}
