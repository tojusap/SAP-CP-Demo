package com.example.demo.datajpa;

import com.example.demo.datajpa.TestEntity;
import org.springframework.data.repository.CrudRepository;
/**
 * description: TestRep
 * date: 11/20/20 4:38 PM
 * author: fourwood
 */
public interface TestRep extends CrudRepository<TestEntity, Integer> {

}
