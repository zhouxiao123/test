package com.example;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/2/14.
 */
public interface DemoRepository extends JpaRepository<TestList,Integer> {


    public TestList findById(Integer id);

    public List<TestList> findAll();

    public TestList findOne(Integer id);

    public List<TestList> findByEmail(String email);
}
