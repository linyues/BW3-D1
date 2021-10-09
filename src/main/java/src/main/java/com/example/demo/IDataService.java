package src.main.java.com.example.demo;

import java.util.List;

public interface IDataService {
    Employee getEmployeeByName(Integer id);
    List<Employee> getEmployeeList();
    String addEmployee(Employee employee);
    String updateEmployee(Integer id,Employee employee);
    String deleteEmployee(Integer id);
}
