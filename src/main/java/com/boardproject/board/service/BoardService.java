package com.boardproject.board.service;

import com.boardproject.board.dto.BoardDTO;
import com.boardproject.board.entity.BoardEntity;
import com.boardproject.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// DTO => Entity(Entity class)
// Entity => DTO(DTO Class)로 변환
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository; //Entity타입을 받음
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
