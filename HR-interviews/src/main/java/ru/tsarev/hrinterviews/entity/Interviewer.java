package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Interviewer")
public class Interviewer extends AbstractEntity {
    private String name;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "interviewers")
    private List<Interview> interviews = new ArrayList<>();
}
