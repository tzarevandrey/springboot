package ru.tsarev.hrinterviews.services;

import org.springframework.stereotype.Service;
import ru.tsarev.hrinterviews.entity.AbstractEntity;

import java.util.List;
import java.util.Optional;

@Service
public interface AbstractService<T extends AbstractEntity> {
    Optional<T> getById(Long id);
    void save(T value);
    void delete(Long id);
    List<T> getAll();
}
