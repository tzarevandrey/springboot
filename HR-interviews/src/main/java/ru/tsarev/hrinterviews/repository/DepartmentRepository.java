package ru.tsarev.hrinterviews.repository;

import org.springframework.data.repository.CrudRepository;
import ru.tsarev.hrinterviews.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
