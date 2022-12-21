package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import ru.tsarev.hrinterviews.enums.CandidateStatus;


import java.util.List;

@Getter
@Setter
@Entity
public class Candidate extends AbstractEntity {

    @NotBlank
    private String name;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private CandidateStatus candidateStatus = CandidateStatus.READY;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "candidate")
    private List<Interview> interviews;
}
