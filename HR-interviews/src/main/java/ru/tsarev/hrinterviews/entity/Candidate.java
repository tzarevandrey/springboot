package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.tsarev.hrinterviews.enums.CandidateStatus;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Candidate")
public class Candidate extends AbstractEntity {
    private String name;
    private CandidateStatus candidateStatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "candidate")
    private List<Interview> interviews = new ArrayList<>();
}
