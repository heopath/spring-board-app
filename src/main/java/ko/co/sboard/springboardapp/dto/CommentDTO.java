package ko.co.sboard.springboardapp.dto;

import ko.co.sboard.springboardapp.entity.Comment;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDTO {
    private int cno;
    private int parent;
    private String content;
    private String writer;
    private String regip;
    private String wdate;

    public Comment toEntity() {
        return Comment.builder()
                .cno(cno)
                .parent(parent)
                .content(content)
                .writer(writer)
                .regip(regip)
                .wdate(LocalDateTime.parse(wdate))
                .build();
    }
}
