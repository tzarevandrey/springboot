package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.tsarev.hrinterviews.enums.InterviewStatus;
import jakarta.validation.constraints.NotNull;
import java.util.*;

@Getter
@Setter
@Entity
public class Interview extends AbstractEntity {

    @NotNull
    private Date date;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private InterviewStatus interviewStatus = InterviewStatus.PLANNED;

    private String comments;

    @ManyToOne
    @JoinColumn
    @NotNull
    private Candidate candidate;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "interviews")
    private List<Interviewer> interviewers;

    @ManyToOne
    @JoinColumn
    @NotNull
    private Vacancy vacancy;
}
