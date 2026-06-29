package ko.co.sboard.springboardapp.repository;

import ko.co.sboard.springboardapp.entity.Article;
import ko.co.sboard.springboardapp.entity.Terms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermsRepository extends JpaRepository<Terms, Integer> {
}
