package lt.codeacademy.shop.repositories;

import lt.codeacademy.shop.entities.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;


//@Repository
public interface ReceiptRepository extends JpaRepository<Receipt,Long> {
}
