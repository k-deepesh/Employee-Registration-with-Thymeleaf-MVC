package practhyme.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import practhyme.Model.Employee;

@Controller
public class EmployeeController{

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("userForm", new Employee());
        return "HomePage";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("userForm") Employee employee, Model model) {
        model.addAttribute("employee", employee);
        model.addAttribute("message", "Form submitted successfully");
        return "Process";
    }
}
