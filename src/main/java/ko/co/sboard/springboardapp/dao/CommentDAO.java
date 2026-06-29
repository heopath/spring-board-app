package ko.co.sboard.springboardapp.dao;

import ko.co.sboard.springboardapp.dto.ArticleDTO;
import ko.co.sboard.springboardapp.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDAO {

    public void insert(CommentDTO dto);

    public CommentDTO select(int cno);

    public List<CommentDTO> selectAll();

    public void update(CommentDTO dto);

    public void delete(int cno);

}