package com.gdsc.onlineforum.dto.request;

import com.gdsc.onlineforum.domain.Post;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostUpdateRequestDto {

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .build();
    }
}