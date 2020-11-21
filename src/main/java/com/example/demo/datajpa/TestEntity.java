package com.example.demo.datajpa;

import javax.persistence.*;

/**
 * description: TestEntity
 * date: 11/20/20 4:19 PM
 * author: fourwood
 */
@Entity
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
