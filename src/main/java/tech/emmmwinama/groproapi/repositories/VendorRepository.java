package tech.emmmwinama.groproapi.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.groproapi.models.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
}
