package ru.tsarev.hrinterviews.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tsarev.hrinterviews.entity.Vacancy;
import ru.tsarev.hrinterviews.repository.VacancyRepository;

@RequestMapping(value = "/api/v1/vacancies")
@RestController
public class VacancyController extends AbstractController<Vacancy>{

    @Autowired
    public VacancyController(VacancyRepository repository) {
        super(repository);
    }
}
