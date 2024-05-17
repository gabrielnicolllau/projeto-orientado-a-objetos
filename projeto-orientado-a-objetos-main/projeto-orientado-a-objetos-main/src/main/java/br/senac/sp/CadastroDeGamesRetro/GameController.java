package br.senac.sp.CadastroDeGamesRetro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Game")
public class GameController {

    @Autowired
    GameRepository repository;

    @GetMapping
    public String index(Model model) {

        List<Game> games = repository.findAll();

        // Passando uma lista de jogos do banco de dados
        model.addAttribute("games", games);

        return "cadastro-games-retro/index";

    }
}