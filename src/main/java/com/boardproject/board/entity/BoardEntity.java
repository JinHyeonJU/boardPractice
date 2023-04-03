package com.boardproject.board.entity;

import com.boardproject.board.dto.BoardDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//DB의 테이블 역할을 하는 클래스
//service와 repository에서만 사용
//BaseEntity상속
@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity extends BaseEntity{
    @Id //pk컬럼으로 지정, 필수
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(length = 20, nullable = false) //일반컬럼, 크기20, not null
    private String boardWrite;

    @Column //default : 크기 255, null가능
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500, nullable = false)
    private String boardContents;

    @Column
    private int boardHits;

    //DTO -> Entity 변환 작업
    public static BoardEntity toSaveEntity(BoardDTO boardDTO) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWrite(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContents(boardDTO.getBoardContents());
        boardEntity.setBoardHits(0);
        return boardEntity;
    }
}
