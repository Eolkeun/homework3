package com.example.test1.service;

import com.example.test1.dto.A1RequestDto;
import com.example.test1.entity.A1;
import com.example.test1.repository.A1Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class A1Service {
    private final A1Repository a1Repository;

    @Transactional
    public Long update(long id, A1RequestDto requestDto) {
        A1 a1 = a1Repository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        a1.update(requestDto);
        return a1.getId();
    }


    @Transactional
    public List<A1RequestDto> GetAllA1(){
        List<A1> A1All_list = a1Repository.findAllByOrderByModifiedAtDesc();
        List<A1RequestDto> GetAllA1_list = new ArrayList<>();

        for (A1 a1 : A1All_list){
            A1RequestDto getAllResponseDto = new A1RequestDto(a1);
            GetAllA1_list.add(getAllResponseDto);
        }
        return GetAllA1_list;
    }


}
