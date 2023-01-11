package ru.tsarev.hrinterviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tsarev.hrinterviews.entity.AbstractEntity;

public interface AbstractRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {
}
