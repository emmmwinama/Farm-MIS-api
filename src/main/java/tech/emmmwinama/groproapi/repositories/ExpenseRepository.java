package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
