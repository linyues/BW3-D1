package src.main.java.com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    private DataService dataService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Employee> getEmployeeList() {
        return dataService.getEmployeeList();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postEmployee(@RequestBody Employee employee) {
        return dataService.addEmployee(employee);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable Integer id) {
        return dataService.getEmployeeByName(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
        return dataService.updateEmployee(id,employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable Integer id) {
        return dataService.deleteEmployee(id);
    }
}


