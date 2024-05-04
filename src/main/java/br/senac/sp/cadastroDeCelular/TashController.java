package br.senac.sp.cadastroDeCelular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("task")
public class TashController {

    @Autowired
    TaskRepository repository;

    @GetMapping
    public String index(Model model) {

        List<Task> tasks = repository.findAll();
       // var tasks = repository.findAll(); // findAll retorna uma lista de tarefas

        // Passando uma lista de tarefas do banco de dados
        model.addAttribute("tasks", tasks);

        return "task/index";

    }
}
