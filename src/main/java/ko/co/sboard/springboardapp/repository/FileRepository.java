package ko.co.sboard.springboardapp.repository;

import ko.co.sboard.springboardapp.entity.Article;
import ko.co.sboard.springboardapp.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Integer> {
}
