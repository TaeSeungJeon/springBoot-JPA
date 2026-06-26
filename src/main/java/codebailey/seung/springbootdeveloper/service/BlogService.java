package codebailey.seung.springbootdeveloper.service;


import codebailey.seung.springbootdeveloper.domain.Article;
import codebailey.seung.springbootdeveloper.dto.AddArticleRequest;
import codebailey.seung.springbootdeveloper.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // db 저장되어있는 글 모두 가져오는 findAll() 메서드 추가
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    // JPA에서 제공하는 findById() 메서드로 id를 받아 Entity를 조회하고 없으면 IllegalArgumentException 예외 발생
    public Article findById(Long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Article not found" + id));
    }

    public void delete(Long id) {
        blogRepository.deleteById(id);
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
