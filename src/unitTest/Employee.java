package unitTest;

import java.util.concurrent.ExecutionException;

public class Employee {
    public Employee(String n, double s) {
        name = n;
        salary =s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }

    public static void main(String[] args) {
        Employee e = new Employee("harry", 500000);
        e.setId();
        System.out.println(e.getName()+ " " + e.getSalary() +" "+e.getId());
    }

    private String name;
    private double salary;
    private int id;
    private static int nextId = 1;
}