package com.boardproject.board.entity;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
//시간 정보를 다루는 클래스
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp //생성시 시간
    @Column(updatable = false) //수정시에는 관여x
    private LocalDateTime createdTime;

    @UpdateTimestamp //업데이트 발생시 시간
    @Column(insertable = false) //생성시에는 관여x
    private LocalDateTime updatedTime;
}
