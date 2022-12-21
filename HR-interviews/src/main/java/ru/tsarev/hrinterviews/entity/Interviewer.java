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
public class Interviewer extends AbstractEntity {

    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn
    @NotNull
    private Position position;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "interviewers")
    private List<Interview> interviews;
}
