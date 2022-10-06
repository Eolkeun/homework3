package com.example.test1.entity;

import com.example.test1.dto.A1RequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor  // 기본 생성자를 만들어준다
@Getter  // get 함수를 일괄적으로 만들어준다
@Entity  // DB 테이블 역할을 한다

public class A1 extends A1Timestamped {

    @Id  //ID가 자동으로 생성 및 증가한다
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(nullable = false)  // 반드시 값을 가지도록 한다
    private String home;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private  String pw;
    @Column(nullable = false)
    private String comment;

    public A1(String home, String name, String pw, String comment) {
        this.home = home;
        this.name = name;
        this.pw = pw;
        this.comment = comment;
    }

    public A1(A1RequestDto a1RequestDto) {
        this.home = a1RequestDto.getHome();
        this.name = a1RequestDto.getName();
        this.comment = a1RequestDto.getComment();
    }
    public void update(A1RequestDto requestDto) {
        this.comment = requestDto.getComment();
    }
}
