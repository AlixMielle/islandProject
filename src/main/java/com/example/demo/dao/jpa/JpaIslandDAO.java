package com.example.demo.dao.jpa;

import com.example.demo.dao.IslandDAO;
import com.example.demo.model.Island;

import java.util.List;
import java.util.Optional;

public class JpaIslandDAO implements IslandDAO {
    @Override
    public List<Island> findAll() {
        return null;
    }

    @Override
    public boolean create(Island island) {
        return false;
    }

    @Override
    public Optional<Island> findById(long idParam) {
        return Optional.empty();
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public boolean edit(Island islandToEdit) {
        return false;
    }
}
