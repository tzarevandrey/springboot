package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@Entity
public class Department extends AbstractEntity {

    @NotBlank
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Position> positions;
}
