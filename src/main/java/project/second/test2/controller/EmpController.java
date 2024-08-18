package project.second.test2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.second.test2.model.Employee;
import project.second.test2.service.EmpService;


@RestController
public class EmpController {
    // List<Employee> emp=new ArrayList<>();
    
    // EmpService employeeService = new EmpServiceImp();
    //Dependency Injection
    // @Autowired // to show dependency injection , it is not compulsory but it is used for good practice using below line in constructor
    private EmpService employeeService; // ioc container makes object

    @Autowired
    public EmpController(EmpService employeeService) {
        this.employeeService = employeeService; // Dependency is injected by the IoC container
    }


    @GetMapping("emp")
    public List<Employee> getAllEmp() {
       return employeeService.readEmployees();
        }

        @GetMapping("emp/{id}")
        public Employee getEmp(@PathVariable long id) {
           return employeeService.readEmployee(id);
            }
   @PostMapping("emp")
   public String createEmployee(@RequestBody Employee employee) {
       return (employeeService.createEmployee(employee));    
   }

   @DeleteMapping("emp/{id}")
   public String deleteEmployee(@PathVariable Long id) {
    if(employeeService.deleteEmployee(id)){
        return "Employee deleted successfully";
    }
    else{
        return "NO DELETION";
    }
}

@PutMapping("emp/{id}")
public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
    //TODO: process PUT request
    
    return employeeService.updateEmployee(id, employee);
}

   

}
