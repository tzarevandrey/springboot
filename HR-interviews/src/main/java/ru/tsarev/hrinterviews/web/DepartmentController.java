package ru.tsarev.hrinterviews.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tsarev.hrinterviews.entity.Department;
import ru.tsarev.hrinterviews.repository.DepartmentRepository;

@RequestMapping(value = "/api/v1/departments")
@RestController
public class DepartmentController extends AbstractController<Department>{

    @Autowired
    public DepartmentController(DepartmentRepository repository) {
        super(repository);
    }
}
