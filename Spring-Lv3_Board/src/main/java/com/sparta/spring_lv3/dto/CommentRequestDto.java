package com.sparta.spring_lv3.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto {
    private Long boardId;   // 보통 FE에서 받아옴
    private String contents;
}
