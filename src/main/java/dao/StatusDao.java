package dao;

import entities.Status;

public interface StatusDao {

    void save(Status status);

    void update(Status status);

    Status getById(int id);

    void delete(Status status);
}
