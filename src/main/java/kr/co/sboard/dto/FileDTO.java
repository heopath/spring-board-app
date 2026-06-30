package kr.co.sboard.dto;

import kr.co.sboard.entity.File;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileDTO {
    private int fno;
    private int ano;
    private String ofanme;
    private String sfanme;
    private int download;
    private String wdate;

    public File toEntity(){
        return File.builder()
                .fno(fno)
                .ano(ano)
                .ofanme(ofanme)
                .sfanme(sfanme)
                .download(download)
                .build();
    }
}
