package ru.tsarev.hrinterviews.controllers;

import org.springframework.web.bind.annotation.*;
import ru.tsarev.hrinterviews.entity.Department;
import ru.tsarev.hrinterviews.services.impl.AbstractServiceImpl;

@RestController
@RequestMapping("/api/v1/departments/")
public class DepartmentController extends AbstractController<Department> {
    public DepartmentController(AbstractServiceImpl<Department> serviceImpl) {
        super(serviceImpl);
    }
}
