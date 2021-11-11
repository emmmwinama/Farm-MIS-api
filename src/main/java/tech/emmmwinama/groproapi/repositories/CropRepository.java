package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tech.emmmwinama.groproapi.models.Crop;

public interface CropRepository extends CrudRepository<Crop, Long> {
<<<<<<< HEAD
    Page<Crop> findByName(@Param("name") String name, Pageable pageable);
=======
<<<<<<< HEAD
    List<Crop> findByName(String name);
=======
    List<Crop> findByName(@Param("name") String name);
>>>>>>> 157e320cca9a4d3514ccadc9dff3eb50a43f636c
>>>>>>> b69b3e895dbeb3c667bb410d4261660e75889ae4
}
