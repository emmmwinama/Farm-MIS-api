package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tech.emmmwinama.groproapi.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
    Page<Task> findByName(@Param("name") String name, Pageable pageable);

    Page<Task> findByNameAndCategory(@Param("name") String name, @Param("category") String category, Pageable pageable);
}
