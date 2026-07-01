package kr.co.sboard.dao;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class ArticleDAOTest {

    @Autowired
    private ArticleDAO dao;

    @Test
    void insert() {
    }

    @Test
    void select() {
    }

    @Test
    void selectAll() {
       // List<ArticleDAO> daoList = dao.selectAll();

      //  log.info(daoList);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}