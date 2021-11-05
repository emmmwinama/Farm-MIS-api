package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Field;

public interface FieldRepository extends CrudRepository<Field, Long> {
}
