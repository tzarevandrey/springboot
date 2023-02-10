package ru.tsarev.hrinterviews.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.tsarev.hrinterviews.entity.Interviewer;
import ru.tsarev.hrinterviews.repository.InterviewerRepository;

@RequestMapping(value = "/api/v1/interviewers")
public class InterviewerController extends AbstractController<Interviewer>{

    @Autowired
    public InterviewerController(InterviewerRepository repository) {
        super(repository);
    }
}
