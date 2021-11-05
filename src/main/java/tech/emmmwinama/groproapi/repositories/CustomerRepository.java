package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
