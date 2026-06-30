package kr.co.sboard;

import org.mybatis.spring.annotation.MapperScan; // 💡 패키지 임포트 주의!
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBoardAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoardAppApplication.class, args);
    }

}