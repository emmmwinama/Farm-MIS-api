package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Inventory_item;

public interface InventoryItemsRepository extends CrudRepository<Inventory_item, Long> {
}
