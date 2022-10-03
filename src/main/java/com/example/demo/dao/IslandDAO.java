package com.example.demo.dao;

import com.example.demo.Entity.Island;

import java.util.List;
import java.util.Optional;

public interface IslandDAO {

    List<Island> findAll();

    boolean create(Island island);

    Optional<Island> findById(long idParam);

    boolean delete(long id);

    boolean edit(Island islandToEdit);
}
