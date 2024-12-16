package fr.insa.mas.Help.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/volontaires")
public class VolontaireController {

    private List<Volontaire> volontaires = new ArrayList<>(); 

    @PostMapping("/add")
    public String addVolontaire(
            @RequestParam("nom") String nom,
            @RequestParam("prenom") String prenom,
            @RequestParam("aAntecedentsJudiciaires") boolean aAntecedentsJudiciaires,
            @RequestParam("age") int age
    ) {
        Volontaire nouveauVolontaire = new Volontaire(nom, prenom, aAntecedentsJudiciaires, age);
        
        if (aAntecedentsJudiciaires || age < 18) {
            return "Le volontaire n'est pas accepté pour les raisons spécifiées.";
        }

        volontaires.add(nouveauVolontaire);
        return "Le volontaire a été accepté.";
    }

    @GetMapping("/all")
    public List<Volontaire> getAllVolontaires() {
        // Retourne tous les volontaires présents dans votre liste
        return volontaires;
    }

   
}
