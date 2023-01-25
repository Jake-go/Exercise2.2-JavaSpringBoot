package ca.sheridancollege.gollej.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.gollej.beans.Player;
import ca.sheridancollege.gollej.repository.PlayerRepository;
import lombok.AllArgsConstructor;

//Author: Jacob Golle
//Student Number: 991 429 916
//Date: Jan 20, 2023
@Controller
@AllArgsConstructor
public class PlayerController {

    // Initialize the repo
    private PlayerRepository playerRepo;

    // Navigate to the root directory
    @GetMapping("/")
    public String loadRoot() {
        return "index.html";
    }

    // Navigate to the add player page
    @GetMapping("/addPlayer")
    public String loadAddPlayerPage(Model model) {
        model.addAttribute("player", new Player());
        return "addPlayer.html";
    }

    // Navigate to the page that views the existing players
    @GetMapping("/players")
    public String loadPlayersPage(Model model) {
        model.addAttribute("player", new Player());
        model.addAttribute("players", playerRepo.findAll());
        return "players.html";
    }

    // Process the form action on my add game page
    @PostMapping("/playerAdded")
    public String processNewPlayer(@ModelAttribute Player player) {
        // add the player to the repo
        System.out.println("Player Added: " + player);
        playerRepo.save(player);
        // redirect to the add player page
        return "redirect:/addPlayer"; // 302 Status
    }

}
