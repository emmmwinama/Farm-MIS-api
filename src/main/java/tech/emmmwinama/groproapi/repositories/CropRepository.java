package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Crop;

public interface CropRepository extends CrudRepository<Crop, Long> {
}
