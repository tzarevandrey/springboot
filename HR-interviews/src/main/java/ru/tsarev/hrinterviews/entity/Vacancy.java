package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Vacancy")
public class Vacancy extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacancy")
    private List<Interview> interviews = new ArrayList<>();

    private String competencies;
}
