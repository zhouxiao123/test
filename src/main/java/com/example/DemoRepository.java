package com.example;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/2/14.
 */
public interface DemoRepository extends JpaRepository<TestList,Integer> {


    public List<TestList> findByName(String name);

    
}
