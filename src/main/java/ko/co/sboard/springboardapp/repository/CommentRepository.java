package ko.co.sboard.springboardapp.repository;

import ko.co.sboard.springboardapp.entity.Article;
import ko.co.sboard.springboardapp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
