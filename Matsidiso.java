 Matsidiso.Java
 java.util.Scanner;

Scanner scanner = new Scanner(System.in);
             
 Employee employee = new Employee();
               
 System.out.print("Enter Employee ID: ");
 employee.setEmployeeId(scanner.nextInt()); 
 System.out.print("Enter First Name: ");
 employee.setFirstName(scanner.nextLine());
        
 System.out.print("Enter Last Name: ");
 employee.setLastName(scanner.nextLine());
              
  System.out.println(employee);
        
  scanner.close();
    }
}