package com.example.SpringAngularMariaDBTemplate.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="example_table")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString
public class Example extends BaseEntity{

    private String name;
}
