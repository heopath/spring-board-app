package ko.co.sboard.springboardapp.service;

import ko.co.sboard.springboardapp.dao.ArticleDAO;
import ko.co.sboard.springboardapp.dao.FileDAO;
import ko.co.sboard.springboardapp.dto.ArticleDTO;
import ko.co.sboard.springboardapp.dto.FileDTO;
import ko.co.sboard.springboardapp.repository.ArticleRepository;
import ko.co.sboard.springboardapp.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class FileService {
    private final FileDAO dao;
    private final FileRepository repository;

    public FileDTO get(int fno){
        return null;
    }
    public List<FileDTO> getAll(){
        return null;
    }
    public void register(FileDTO dto){

    }
    public void modify(FileDTO dto){
        
    }
    public void remove(int fno){

    }

}
