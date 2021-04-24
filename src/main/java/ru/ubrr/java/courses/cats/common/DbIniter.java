package ru.ubrr.java.courses.cats.common;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.ubrr.java.courses.cats.dao.CatRepository;
import ru.ubrr.java.courses.cats.model.Cat;

@Component
@RequiredArgsConstructor
public class DbIniter implements CommandLineRunner {

  CatRepository catRepository;

  @Override
  public void run(String... __) {
    for (val catName : "Мурзик, Барсик, Матроскин".split(", "))
      catRepository.save(new Cat(catName));
  }
}
