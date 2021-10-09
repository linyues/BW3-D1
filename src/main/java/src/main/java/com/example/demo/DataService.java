package src.main.java.com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService implements IDataService{
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee getEmployeeByName(Integer id) {
        return employeeDao.getEmployeeByName(id);
    }
    @Override
    public List<Employee> getEmployeeList() {
        return employeeDao.getEmployeeList();
    }

    @Override
    public String addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }

    @Override
    public String updateEmployee(Integer id, Employee employee) {
        return employeeDao.updateEmployee(id,employee);
    }



    @Override
    public String deleteEmployee(Integer id) {
        return employeeDao.deleteEmployee(id);
    }
}
