package com.example.test1.repository;

import com.example.test1.entity.A1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface A1Repository extends JpaRepository<A1, Long> {
    List<A1> findAllByOrderByModifiedAtDesc();
}
