package ru.tsarev.sbtest.entity;

import org.springframework.beans.factory.annotation.Autowired;
import ru.tsarev.sbtest.enums.CandidateStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @Autowired
    private CandidateStatus candidateStatus;

    public Candidate(){
    }

    public Candidate(String name, CandidateStatus candidateStatus) {
        this.name = name;
        this.candidateStatus = candidateStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CandidateStatus getCandidateStatus() {
        return candidateStatus;
    }

    public void setCandidateStatus(CandidateStatus candidateStatus) {
        this.candidateStatus = candidateStatus;
    }
}
