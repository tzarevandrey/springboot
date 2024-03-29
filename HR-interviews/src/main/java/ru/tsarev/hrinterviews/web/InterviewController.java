package ru.tsarev.hrinterviews.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tsarev.hrinterviews.entity.Interview;
import ru.tsarev.hrinterviews.repository.InterviewRepository;

@RequestMapping(value = "/api/v1/interviews")
@RestController
public class InterviewController extends AbstractController<Interview>{

    @Autowired
    public InterviewController(InterviewRepository repository) {
        super(repository);
    }
}
