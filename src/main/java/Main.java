import entities.Account;
import entities.Client;
import entities.Status;
import services.*;

public class Main {
    public static void main(String[] args) {
//        Client client = new Client(0, "exampleNEW", "exampleNEW@gmail.com", 380997776699L, "My name is exampleNEW", 36);
        ClientService service = new ClientServiceImpl();

        Client clientByPhone = service.getByPhone(380977778821L);
        System.out.println(clientByPhone.toString());

//        service.save(client);

//        service.update(client);

//        service.delete(client);
//
//        Client clientById = service.getById(1);
//        System.out.println(clientById.toString());
//
//        Account account = new Account(11,36, "123456789", 150000.15);
//        AccountService service = new AccountServiceImpl();
//        service.delete(account);
//
//        Status status = new Status("EXAMPLE", "TEXT FOR EXAMPLE");
//        StatusService service = new StatusServiceImpl();
//        service.delete(status);
    }
}
