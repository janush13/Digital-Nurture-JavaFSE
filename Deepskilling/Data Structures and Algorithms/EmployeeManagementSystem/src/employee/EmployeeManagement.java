package employee;



public class EmployeeManagement {


    private Employee[] employees;

    private int count;



    public EmployeeManagement(int size){


        employees = new Employee[size];

        count = 0;

    }





    // Add Employee

    public void addEmployee(Employee employee){


        if(count < employees.length){


            employees[count] = employee;

            count++;

            System.out.println(
                "Employee Added"
            );


        }
        else{


            System.out.println(
                "Array is Full"
            );

        }

    }







    // Search Employee

    public Employee searchEmployee(int id){



        for(int i=0;i<count;i++){


            if(employees[i].getEmployeeId()==id){

                return employees[i];

            }

        }


        return null;

    }








    // Traverse Employees

    public void displayEmployees(){



        for(int i=0;i<count;i++){


            employees[i].display();


        }

    }








    // Delete Employee

    public void deleteEmployee(int id){



        for(int i=0;i<count;i++){



            if(employees[i].getEmployeeId()==id){



                for(int j=i;j<count-1;j++){


                    employees[j] =
                    employees[j+1];


                }



                count--;


                System.out.println(
                    "Employee Deleted"
                );


                return;


            }


        }


        System.out.println(
            "Employee Not Found"
        );


    }



}