package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
public class Position extends AbstractEntity {

    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn
    @NotNull
    private Department department;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "position")
    private List<Interviewer> interviewers;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "position")
    private List<Vacancy> vacancies;
}
