package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Inventory_category;

public interface InventoryCategoryRepository extends CrudRepository<Inventory_category, Long> {
}
