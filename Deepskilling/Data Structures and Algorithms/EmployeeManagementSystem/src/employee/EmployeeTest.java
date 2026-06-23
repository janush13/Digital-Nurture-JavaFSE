package employee;



public class EmployeeTest {


public static void main(String[] args){



    EmployeeManagement system =
        new EmployeeManagement(5);



    system.addEmployee(
        new Employee(
            101,
            "Arun",
            "Developer",
            50000
        )
    );



    system.addEmployee(
        new Employee(
            102,
            "Kumar",
            "Tester",
            40000
        )
    );



    system.addEmployee(
        new Employee(
            103,
            "Priya",
            "Manager",
            70000
        )
    );





    System.out.println(
        "\nAll Employees:"
    );


    system.displayEmployees();





    System.out.println(
        "\nSearch:"
    );


    Employee result =
        system.searchEmployee(102);



    result.display();





    system.deleteEmployee(101);




    System.out.println(
        "\nAfter Delete:"
    );


    system.displayEmployees();


}

}