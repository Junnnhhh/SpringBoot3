package me.limjunhuyk.springbootdeveloper.repository;

import me.limjunhuyk.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
