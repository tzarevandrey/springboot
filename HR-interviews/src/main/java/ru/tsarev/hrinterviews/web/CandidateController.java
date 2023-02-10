package ru.tsarev.hrinterviews.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tsarev.hrinterviews.entity.Candidate;
import ru.tsarev.hrinterviews.repository.CandidateRepository;

@RequestMapping(value = "/api/v1/candidates")
@RestController
public class CandidateController extends AbstractController<Candidate> {

    @Autowired
    public CandidateController(CandidateRepository repository) {
        super(repository);
    }

}
