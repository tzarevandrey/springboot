package ru.tsarev.hrinterviews.repository;

import org.springframework.stereotype.Repository;
import ru.tsarev.hrinterviews.entity.Candidate;

@Repository
public interface CandidateRepository extends AbstractRepository<Candidate> {
}
