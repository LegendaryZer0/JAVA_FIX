package ru.ivmiit.mvc.MyProject.dao;

import ru.ivmiit.mvc.MyProject.Model.Area;

import java.util.List;
import java.util.Optional;

public class AreaDaoJdbcTemplateImpl implements AreasDao {
    @Override
    public Optional<Area> find(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Area model) {

    }

    @Override
    public void update(Area model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Area> findAll() {
        return null;
    }
}
