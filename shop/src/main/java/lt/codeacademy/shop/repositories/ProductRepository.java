package lt.codeacademy.shop.repositories;

import lt.codeacademy.shop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


//@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
