package ru.tsarev.hrinterviews.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Department")
public class Department extends AbstractEntity {
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Position> positions = new ArrayList<>();
}
