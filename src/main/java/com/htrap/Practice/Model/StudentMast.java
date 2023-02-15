package com.htrap.Practice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "StudentMast")
public class StudentMast {

    @Id
    Integer studentId;

    @Column(name = "StudentName")
    String StudentName;

    @Column(name = "Email")
    String email;

    @Column(name = "Age")
    Integer age;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "stud_class_id")
    StudClass studClass;
}
