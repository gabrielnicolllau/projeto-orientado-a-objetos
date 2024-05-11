package br.senac.sp.cadastroDeCelular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("task")
public class TaskController {

    @Autowired
    TaskRepository repository;

    @GetMapping
    public String index(Model model) {

        List<Task> tasks = repository.findAll();

        model.addAttribute("tasks", tasks);

        return "task/index";

    }

    @PostMapping("/delete/{id}")
    public String destroy(@PathVariable Long id) {

        repository.deleteById(id);

        return "redirect:/task";

    }

    @GetMapping("/new")
    public String form(Task task) {
        return "task/new";
    }

    @PostMapping
    public String create(@Valid Task task, BindingResult result) {
        if (result.hasErrors()) return "task/new";
        
        repository.save(task);
        return "redirect:/task";

    }
}
