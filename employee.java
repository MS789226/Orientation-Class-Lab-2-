 Employee.java


 class Employee {
   
    private int employeeId;
    private String firstName;
    private String lastName;

    
      getEmployeeId() {
        return employeeId;
    }

     setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

  
     String getFirstName() {
        return firstName;
    }

     setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
     String getLastName() {
        return lastName;
    }

      setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    
     String toString() {
        return "Employee ID: " + employeeId + ", Name: " + firstName + " " + lastName;
    }
}
