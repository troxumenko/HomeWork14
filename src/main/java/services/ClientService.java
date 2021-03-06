package services;

import entities.Client;

public interface ClientService {

    void save(Client client);

    void update(Client client);

    Client getById(int id);

    void delete(Client client);

    Client getByPhone(long phone);
}
