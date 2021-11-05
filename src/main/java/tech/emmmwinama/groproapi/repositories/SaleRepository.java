package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Sale;

public interface SaleRepository extends CrudRepository<Sale, Long> {
}
