package codebailey.seung.springbootdeveloper.repository;

import codebailey.seung.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
