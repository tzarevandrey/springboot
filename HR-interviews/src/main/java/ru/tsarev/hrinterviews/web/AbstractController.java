package ru.tsarev.hrinterviews.web;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.tsarev.hrinterviews.entity.AbstractEntity;
import ru.tsarev.hrinterviews.repository.AbstractRepository;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@RestController
public abstract class AbstractController<T extends AbstractEntity> {
    private final AbstractRepository<T> repository;

    @GetMapping
    public List<T> getAll() {
        return repository.findAll();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<T> getOne(@PathVariable("id") @Valid Long id) {
        Optional<T> res =  repository.findById(id);
        if (res.isPresent()) {
            return new ResponseEntity<>(res.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<T> addOne(@RequestBody @Valid T item) {
        if (item == null) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        repository.save(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<T> updateOne(@RequestBody @Valid T item) {
        if (item == null) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        repository.save(item);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<T> deleteOne(@PathVariable("id") @Valid Long id) {
        Optional<T> res =  repository.findById(id);
        if (res.isPresent()) {
            repository.delete(res.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
