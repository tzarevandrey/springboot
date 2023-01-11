package ru.tsarev.hrinterviews.controllers;

import org.springframework.web.bind.annotation.*;
import ru.tsarev.hrinterviews.entity.Position;
import ru.tsarev.hrinterviews.services.impl.AbstractServiceImpl;

@RestController
@RequestMapping("/api/v1/positions/")
public class PositionController extends AbstractController<Position> {
    public PositionController(AbstractServiceImpl<Position> serviceImpl) {
        super(serviceImpl);
    }
}
