package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Expense_item;

public interface ExpenseItemRepository extends CrudRepository<Expense_item, Long> {
}
