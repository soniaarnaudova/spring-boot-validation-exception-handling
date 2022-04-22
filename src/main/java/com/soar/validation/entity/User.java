package com.soar.validation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long userId;
    private String name;
    private String email;
    private int age;
    private String mobile;
    private String gender;
    private String nationality;
}
