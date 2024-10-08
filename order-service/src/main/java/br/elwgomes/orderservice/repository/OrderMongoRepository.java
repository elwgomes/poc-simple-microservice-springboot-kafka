package br.elwgomes.orderservice.repository;

import br.com.elwgomes.base.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMongoRepository extends MongoRepository<Order, String> {
}
