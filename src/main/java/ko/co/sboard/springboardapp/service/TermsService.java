package ko.co.sboard.springboardapp.service;

import ko.co.sboard.springboardapp.dao.ArticleDAO;
import ko.co.sboard.springboardapp.dao.TermsDAO;
import ko.co.sboard.springboardapp.dto.ArticleDTO;
import ko.co.sboard.springboardapp.dto.TermsDTO;
import ko.co.sboard.springboardapp.repository.ArticleRepository;
import ko.co.sboard.springboardapp.repository.TermsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class TermsService {
    private final TermsDAO dao;
    private final TermsRepository repository;

    public TermsDTO get(int no){
        return null;
    }
    public List<TermsDTO> getAll(){
        return null;
    }
    public void register(TermsDTO dto){

    }
    public void modify(TermsDTO dto){
        
    }
    public void remove(int no){

    }

}
