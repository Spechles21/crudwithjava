package com.example.CrudApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Book {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@Column()
private String title;

@Column()
private String body;

@Column()
private Integer isbn;

@Column()
private String authorName;

}