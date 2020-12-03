package services;

import entities.Status;

public interface StatusService {

    void save(Status status);

    void update(Status status);

    Status getById(int id);

    void delete(Status status);
}
