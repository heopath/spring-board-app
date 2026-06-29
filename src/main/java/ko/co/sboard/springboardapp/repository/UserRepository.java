package ko.co.sboard.springboardapp.repository;

import ko.co.sboard.springboardapp.entity.Article;
import ko.co.sboard.springboardapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
