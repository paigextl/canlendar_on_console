package unitTest;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staffs = new Employee[3];
        staffs[0] = new Employee("barry", 50000);
        staffs[1] = new Employee("harry", 60000);
        staffs[2] = new Employee("marry", 70000);

        for(Employee e : staffs) {
            e.setId();
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",id="+e.getId());
        }

        int nextIdNow = Employee.getNextId();
        System.out.println("nextId now is:"+nextIdNow);
    }
}