package codebailey.seung.springbootdeveloper.dto;


import codebailey.seung.springbootdeveloper.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor  // 기본 생성자 추가
@Getter
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity() { // 생성자를 사용해 객체 생성 | toEntity 는 빌터 패턴을 사용해 dto를 엔티티로 만들어주는 메서드
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
