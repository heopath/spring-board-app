package ko.co.sboard.springboardapp.service;

import ko.co.sboard.springboardapp.dao.ArticleDAO;
import ko.co.sboard.springboardapp.dao.UserDAO;
import ko.co.sboard.springboardapp.dto.ArticleDTO;
import ko.co.sboard.springboardapp.dto.UserDTO;
import ko.co.sboard.springboardapp.repository.ArticleRepository;
import ko.co.sboard.springboardapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserDAO dao;
    private final UserRepository repository;

    public UserDTO get(int userid){
        return null;
    }
    public List<UserDTO> getAll(){
        return null;
    }
    public void register(UserDTO dto){

    }
    public void modify(UserDTO dto){
        
    }
    public void remove(int userid){

    }

}
