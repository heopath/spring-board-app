package ko.co.sboard.springboardapp.repository;

import ko.co.sboard.springboardapp.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
