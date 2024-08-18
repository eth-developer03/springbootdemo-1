package project.second.test2.service;
import java.util.List;

import project.second.test2.model.Employee;
public interface EmpService {
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id,Employee employee);

    public Employee readEmployee(Long id);

}
