package ko.co.sboard.springboardapp.service;

import ko.co.sboard.springboardapp.dao.ArticleDAO;
import ko.co.sboard.springboardapp.dao.CommentDAO;
import ko.co.sboard.springboardapp.dto.ArticleDTO;
import ko.co.sboard.springboardapp.dto.CommentDTO;
import ko.co.sboard.springboardapp.entity.Comment;
import ko.co.sboard.springboardapp.repository.ArticleRepository;
import ko.co.sboard.springboardapp.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class CommnetService {
    private final CommentDAO dao;
    private final CommentRepository repository;

    public CommentDTO get(int cno){
        return null;
    }
    public List<CommentDTO> getAll(){
        return null;
    }
    public void register(CommentDTO dto){

    }
    public void modify(CommentDTO dto){
        
    }
    public void remove(int cno){

    }

}
