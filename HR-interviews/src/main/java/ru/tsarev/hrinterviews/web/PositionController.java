package ru.tsarev.hrinterviews.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.tsarev.hrinterviews.entity.Position;
import ru.tsarev.hrinterviews.repository.PositionRepository;

@RequestMapping(value = "/api/v1/positions")
public class PositionController extends AbstractController<Position>{

    @Autowired
    public PositionController(PositionRepository repository) {
        super(repository);
    }
}
