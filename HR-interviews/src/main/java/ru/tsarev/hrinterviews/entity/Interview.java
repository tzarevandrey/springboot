package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.tsarev.hrinterviews.enums.InterviewStatus;

import java.util.*;

@Getter
@Setter
@Entity
@Table(name = "Interview")
public class Interview extends AbstractEntity {
    private Date date;
    private InterviewStatus interviewStatus;
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "interviews")
    private List<Interviewer> interviewers = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "vacancy_id")
    private Vacancy vacancy;
    private String comments;
}
