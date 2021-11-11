package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tech.emmmwinama.groproapi.models.Crop;

import java.util.List;

public interface CropRepository extends CrudRepository<Crop, Long> {
    List<Crop> findByName(@Param("name") String name);
}
