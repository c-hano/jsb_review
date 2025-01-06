package com.example.ssb2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createTime;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    //mappedBy = "question" : 종속 클래스 Answer에서 연결된 fr 의 값을 question으로 설정
    //casecade = CascadeType.REMOVE : Question이 지워지면 연결된 Answer도 지워진다.
    private List<Answer> answerList;

}
