package lt.codeacademy.shop.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToMany
    @Cascade({CascadeType.SAVE_UPDATE,
            CascadeType.MERGE,
            CascadeType.PERSIST})
    @JoinColumn(name = "receipt_row_id")
   List<Row> rows = new ArrayList<>();

    public Receipt() {
    }

    public Receipt(Long id, List<Row> rows) {
        this.id = id;
        this.rows = rows;
    }

    public Receipt(List<Row> rows) {
        this.rows = rows;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> products) {
        this.rows = new ArrayList<>(products);
    }
    public void addRow(Row row) {
            this.rows.add(row);
}
    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", products=" + rows +
                '}';
    }
}
