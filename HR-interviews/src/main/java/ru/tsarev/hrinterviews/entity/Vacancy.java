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
public class Vacancy extends AbstractEntity {

    @ManyToOne
    @JoinColumn
    @NotNull
    private Position position;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacancy")
    private List<Interview> interviews;

    @NotBlank
    private String competencies;
}
