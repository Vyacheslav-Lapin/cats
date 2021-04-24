package ru.ubrr.java.courses.cats.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.ubrr.java.courses.cats.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
