package clone;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {

        // employee has a address!

//        shallow copy
//        Deep copy
//        copy constructor
//        Cloneable
//        Marker interface


        Address address = new Address("Dehradun", "Uttarakhand", "India");
        Employee employee = new Employee(1,"Mohit", address);



        Employee clone = (Employee) employee.clone();
        System.out.println(clone.getAddress() == employee.getAddress());

        Address employeeAddress = employee.getAddress();
        employeeAddress.setCity("Delhi");
        employee.setAddress(employeeAddress);


        System.out.println("orginal " + employee);
        System.out.println("cloned " +clone);

        System.out.println(employee == clone);

    }
}
