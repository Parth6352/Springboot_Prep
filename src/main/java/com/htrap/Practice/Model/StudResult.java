package com.htrap.Practice.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(SubId.class)
public class StudResult {
    @Id
    Integer studentId;
    @Id
    Integer subjectId;

    @Column(name = "ObtainedMarks")
    Float obtainedMarks;
}
