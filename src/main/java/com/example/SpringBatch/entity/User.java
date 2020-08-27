package com.example.SpringBatch.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    private Integer id;
    private String name;
    private String dept;
    private Integer salary;
}
