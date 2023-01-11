package ru.tsarev.hrinterviews.controllers;

import org.springframework.web.bind.annotation.*;
import ru.tsarev.hrinterviews.entity.Vacancy;
import ru.tsarev.hrinterviews.services.impl.AbstractServiceImpl;

@RestController
@RequestMapping("/api/v1/vacancies/")
public class VacancyController extends AbstractController<Vacancy> {
    public VacancyController(AbstractServiceImpl<Vacancy> serviceImpl) {
        super(serviceImpl);
    }
}
