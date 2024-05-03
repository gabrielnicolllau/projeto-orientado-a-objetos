package br.senac.sp.cadastroDeCelular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("task")
public class TashController {

    @GetMapping
    public String index() {
        
        // Nome da pagina ser exibida
        return "task/index";



    }
}
