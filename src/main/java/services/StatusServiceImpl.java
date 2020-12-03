package services;

import dao.StatusDao;
import dao.StatusDaoImpl;
import entities.Status;

public class StatusServiceImpl implements StatusService {

    @Override
    public void save(Status status) {
        if (status == null) {
            System.out.println("client is empty");
            return;
        }

        StatusDao statusDao = new StatusDaoImpl();
        statusDao.save(status);
    }

    @Override
    public void update(Status status) {
        if (status == null) {
            System.out.println("client is empty");
            return;
        }

        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }

    @Override
    public Status getById(int id) {
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }

    @Override
    public void delete(Status status) {
        if (status == null) {
            System.out.println("client is empty");
            return;
        }

        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(status);
    }
}
