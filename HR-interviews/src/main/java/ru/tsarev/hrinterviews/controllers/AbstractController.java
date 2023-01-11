package ru.tsarev.hrinterviews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.tsarev.hrinterviews.entity.AbstractEntity;
import ru.tsarev.hrinterviews.services.impl.AbstractServiceImpl;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public abstract class AbstractController<T extends AbstractEntity> {
    private final AbstractServiceImpl<T> serviceImpl;

    @Autowired
    public AbstractController(AbstractServiceImpl<T> serviceImpl){
        this.serviceImpl = serviceImpl;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> getItem(@PathVariable("id") Long itemId) {

        if (itemId == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Optional<T> item = this.serviceImpl.getById(itemId);

        return item.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<T> saveItem(@RequestBody @Valid T item){
        HttpHeaders headers = new HttpHeaders();

        if (item == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.serviceImpl.save(item);
        return new ResponseEntity<>(item, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> updateItem(@RequestBody @Valid T item){
        HttpHeaders headers = new HttpHeaders();

        if (item == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.serviceImpl.save(item);
        return new ResponseEntity<>(item, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> deleteItem(@PathVariable("id") Long id){
        if (id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Optional<T> item = serviceImpl.getById(id);

        if (item.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.serviceImpl.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<T>> getAllItems(){
        List<T> items = this.serviceImpl.getAll();

        if (items.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
