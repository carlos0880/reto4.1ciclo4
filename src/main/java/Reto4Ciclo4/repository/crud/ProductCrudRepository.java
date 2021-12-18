package Reto4Ciclo4.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import Reto4Ciclo4.model.Product;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
}
