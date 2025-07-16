package org.example.ProxyDesignPattern;

interface EmployeeDao {
    public void create(String client, Employee obj) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public Employee get(String client, int employeeId) throws Exception;
}

//concrete class implementing interface
class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client, Employee obj) {
        // create new row in db
        System.out.println("created new row in db");
    }

    @Override
    public void delete(String client, int employeeId) {
        //delete a row
        System.out.println("deleted employee with id : " + employeeId);
    }
    @Override
    public Employee get(String client, int employeeId) {
        System.out.println("fetching employee from db");
        return new Employee(employeeId);
    }
}

class EmployeeDaoProxy implements EmployeeDao {

    /*
    Proxy has an object of Implementation class : Has a relationship
    Porxy is a relationship with EmployeeDao
     */
    EmployeeDao employeeDaoObj;
    EmployeeDaoProxy() {
        this.employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, Employee obj) throws Exception {
        if (client == "ADMIN") {
            employeeDaoObj.create(client, obj);
        } else {
            throw new Exception("Access denied");
        }
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client == "ADMIN") {
            employeeDaoObj.delete(client, employeeId);
        } else {
            throw new Exception("Access denied");
        }
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if (client == "ADMIN") {
            return employeeDaoObj.get(client, employeeId);
        } else {
            throw new Exception("Access denied");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN", new Employee());
            System.out.println("operation successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Employee {
    int id;
    public Employee() {

    }
    public Employee(int id) {
        this.id = id;
    }
}
