package ru.tsarev.hrinterviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tsarev.hrinterviews.entity.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
