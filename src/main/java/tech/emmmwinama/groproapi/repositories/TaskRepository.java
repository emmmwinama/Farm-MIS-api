package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
