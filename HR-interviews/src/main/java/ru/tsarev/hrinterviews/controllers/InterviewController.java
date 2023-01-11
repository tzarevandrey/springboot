package ru.tsarev.hrinterviews.controllers;

import org.springframework.web.bind.annotation.*;
import ru.tsarev.hrinterviews.entity.Interview;
import ru.tsarev.hrinterviews.services.impl.AbstractServiceImpl;

@RestController
@RequestMapping("/api/v1/interviews/")
public class InterviewController extends AbstractController<Interview> {
    public InterviewController(AbstractServiceImpl<Interview> serviceImpl) {
        super(serviceImpl);
    }
}
