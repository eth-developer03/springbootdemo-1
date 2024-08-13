package project.second.test2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.second.test2.EmployeeEntity;
import project.second.test2.Repository.EmpRepository;
import project.second.test2.model.Employee;
@Service
public class EmpServiceImp implements EmpService{
    @Autowired
   private EmpRepository employeeRepository;
    List<Employee> emp=new ArrayList<>();
   
    @Override
    public String createEmployee(Employee employee) {
        EmployeeEntity employeeEntity=new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepository.save(employeeEntity);
         emp.add(employee);
         return "saved successfully";
    }

    @Override
    public List<Employee> readEmployees() {
        List<EmployeeEntity> nlist=employeeRepository.findAll();
        List<Employee> employees=new ArrayList<>();
        for(EmployeeEntity employeeEntity:nlist){
            Employee emp=new Employee();
            emp.setName(employeeEntity.getName());
            emp.setEmail(employeeEntity.getEmail());
            employees.add(emp);
        }
        return employees;
        
    }

    @Override
    public boolean deleteEmployee(Long id) {
        for (Employee employee : emp) {
            
            if (employee.getId() ==id) {

                emp.remove(employee);
                return true; 
            }
        }
        return false; 
    }

       
    
     
}
