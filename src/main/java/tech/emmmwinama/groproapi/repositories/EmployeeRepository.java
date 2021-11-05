package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
