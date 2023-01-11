package ru.tsarev.hrinterviews.controllers;

import org.springframework.web.bind.annotation.*;
import ru.tsarev.hrinterviews.entity.Candidate;
import ru.tsarev.hrinterviews.services.impl.AbstractServiceImpl;

@RestController
@RequestMapping("/api/v1/candidates/")
public class CandidateController extends AbstractController<Candidate> {
    public CandidateController(AbstractServiceImpl<Candidate> serviceImpl) {
        super(serviceImpl);
    }
}
