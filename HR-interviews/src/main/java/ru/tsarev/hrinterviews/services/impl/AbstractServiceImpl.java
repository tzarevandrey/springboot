package ru.tsarev.hrinterviews.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tsarev.hrinterviews.entity.AbstractEntity;
import ru.tsarev.hrinterviews.repository.AbstractRepository;
import ru.tsarev.hrinterviews.services.AbstractService;

import java.util.List;
import java.util.Optional;

@Service
public class AbstractServiceImpl<T extends AbstractEntity> implements AbstractService<T> {

    private final AbstractRepository<T> repository;

    @Autowired
    public AbstractServiceImpl(AbstractRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public Optional<T> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void save(T value) {
        repository.save(value);
    }

    @Override
    public void delete(Long id) {
        repository.findById(id).ifPresent(repository::delete);
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }
}
