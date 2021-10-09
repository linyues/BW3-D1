package src.main.java.com.example.demo;
//EmployeeDao.java


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDao implements IEmployeeDao{
    public EmployeeDao(){}
    private static Map<Integer,Employee> employees = new HashMap<>();
    static {
        Employee e0 = new Employee(0, "小明", 20, "男");
        Employee e1 = new Employee(1, "小红", 19, "女");
        Employee e2 = new Employee(2, "小智", 15, "男");
        Employee e3 = new Employee(3, "小刚", 16, "男");
        Employee e4 = new Employee(4, "小霞", 15, "女");
        employees.put(e0.getId(), e0);
        employees.put(e1.getId(), e1);
        employees.put(e2.getId(), e2);
        employees.put(e3.getId(), e3);
        employees.put(e4.getId(), e4);
    }


    @Override
    public Employee getEmployeeByName(Integer id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> getEmployeeList() {
        List<Employee> employeelist =new ArrayList<>(employees.values());
        return employeelist;
    }

    @Override
    public String addEmployee(Employee employee) {
        employees.put(employee.getId(),employee);
        return "success";
    }

    @Override
    public String updateEmployee(Integer id, Employee employee) {
        employees.get(id).setName(employee.getName());
        employees.get(id).setAge(employee.getAge());
        employees.get(id).setGender(employee.getGender());
        return "success";
    }

    @Override
    public String deleteEmployee(Integer id) {
        employees.remove(id);
        return "success";
    }
}


