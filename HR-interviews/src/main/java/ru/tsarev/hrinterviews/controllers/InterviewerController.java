package ru.tsarev.hrinterviews.controllers;

import org.springframework.web.bind.annotation.*;
import ru.tsarev.hrinterviews.entity.Interviewer;
import ru.tsarev.hrinterviews.services.impl.AbstractServiceImpl;

@RestController
@RequestMapping("/api/v1/interviewers/")
public class InterviewerController extends AbstractController<Interviewer> {
    public InterviewerController(AbstractServiceImpl<Interviewer> serviceImpl) {
        super(serviceImpl);
    }
}
