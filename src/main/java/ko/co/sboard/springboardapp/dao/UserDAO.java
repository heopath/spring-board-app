package ko.co.sboard.springboardapp.dao;

import ko.co.sboard.springboardapp.dto.ArticleDTO;
import ko.co.sboard.springboardapp.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {

    public void insert(UserDTO dto);

    public ArticleDTO select(int userid);

    public List<UserDTO> selectAll();

    public void update(UserDTO dto);

    public void delete(int userid);

}