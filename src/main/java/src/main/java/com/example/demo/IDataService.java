package src.main.java.com.example.demo;

import java.util.List;

public interface IDataService {
    Employee getEmployeeByName(Integer id);
    List<Employee> getEmployee();
    String addEmployee(Employee employee);
    String updateEmployee(Integer id,Employee employee);
    String deleteEmploee(Integer id);

}
