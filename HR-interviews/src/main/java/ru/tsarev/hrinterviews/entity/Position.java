package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Position")
public class Position extends AbstractEntity {
    private String name;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "position")
    private List<Interviewer> interviewers = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "position")
    private List<Vacancy> vacancies = new ArrayList<>();
}
