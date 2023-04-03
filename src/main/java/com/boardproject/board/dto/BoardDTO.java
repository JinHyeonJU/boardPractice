package com.boardproject.board.dto;

import com.boardproject.board.entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

//DTO(Data Transfer Object) 데이터 전송할때 사용하는 객체
//save.html의 객체명이랑 dto변수명이랑 동일해야함
@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

    //윈도우+insert로 자동생성
    public BoardDTO(Long id, String boardWriter, String boardTitle, int boardHits, LocalDateTime boardCreatedTime) {
        this.id = id;
        this.boardWriter = boardWriter;
        this.boardTitle = boardTitle;
        this.boardHits = boardHits;
        this.boardCreatedTime = boardCreatedTime;
    }

    public static BoardDTO toBoardDTO(BoardEntity boardEntity) {
         BoardDTO boardDTO = new BoardDTO();
         boardDTO.setId(boardEntity.getId());
         boardDTO.setBoardWriter(boardEntity.getBoardWrite());
         boardDTO.setBoardPass(boardEntity.getBoardPass());
         boardDTO.setBoardTitle(boardEntity.getBoardTitle());
         boardDTO.setBoardContents(boardEntity.getBoardContents());
         boardDTO.setBoardHits(boardEntity.getBoardHits());
         boardDTO.setBoardCreatedTime(boardEntity.getCreatedTime());
         boardDTO.setBoardUpdatedTime(boardEntity.getUpdatedTime());
         return boardDTO;
    }
}
