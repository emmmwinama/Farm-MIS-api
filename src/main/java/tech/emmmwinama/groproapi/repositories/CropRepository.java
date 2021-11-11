package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tech.emmmwinama.groproapi.models.Crop;

import java.util.List;

public interface CropRepository extends CrudRepository<Crop, Long> {
<<<<<<< HEAD
    List<Crop> findByName(String name);
=======
    List<Crop> findByName(@Param("name") String name);
>>>>>>> 157e320cca9a4d3514ccadc9dff3eb50a43f636c
}
