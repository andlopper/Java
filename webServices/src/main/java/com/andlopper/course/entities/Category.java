package com.andlopper.course.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity //Instruindo JPA como converter os objetos para modelo relacional
@Table(name = "tb_category") //Renomeando o nome "user" para evitar conflito no H2
public class Category implements Serializable {
    @Id //Indicando que "Id" é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement
    private Long id;
    private String name;
//    @JsonIgnore //Evitar loop na consulta
//    @OneToMany(mappedBy = "client") //Atributo mapeado por este nome da classe Order
//    private List<Order> orders = new ArrayList<>();

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category user = (Category) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
