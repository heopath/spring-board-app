package ko.co.sboard.springboardapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import ko.co.sboard.springboardapp.dto.FileDTO;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fno;
    private int ano;
    private String ofanme;
    private String sfanme;
    private int download;
    @CreationTimestamp
    private LocalDateTime wdate;

    public FileDTO toDTO(){
        return FileDTO.builder()
                .fno(fno)
                .ano(ano)
                .ofanme(ofanme)
                .sfanme(sfanme)
                .download(download)
                .wdate(wdate.toString())
                .build();
    }
}
