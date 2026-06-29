package ko.co.sboard.springboardapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import ko.co.sboard.springboardapp.dto.TermsDTO;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Terms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;
    private String basic;
    private String privacy;

    public TermsDTO toDTO(){
        return TermsDTO.builder()
                .no(no)
                .basic(basic)
                .privacy(privacy)
                .build();
    }
}
