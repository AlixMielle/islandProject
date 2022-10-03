package com.example.demo.Entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private long id;

    @Column(name="name")
    private String name;


    @ManyToMany
    @JoinTable(name="country_island",
            joinColumns=
            @JoinColumn(name="island_id", referencedColumnName="id"),
            inverseJoinColumns=
            @JoinColumn(name="country-id", referencedColumnName="id"))

    private Collection<Island> islands;

    public Country() {
    }


    public Country(String name) {
        this.name = name;
    }

    public Country(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
