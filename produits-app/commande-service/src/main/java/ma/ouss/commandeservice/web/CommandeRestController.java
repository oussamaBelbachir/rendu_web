package ma.ouss.commandeservice.web;

import ma.ouss.commandeservice.entities.Commande;
import ma.ouss.commandeservice.repository.CommandeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class CommandeRestController {
    private CommandeRepository commandeRepository;

    public CommandeRestController(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @GetMapping("/commandes")
    public List<Commande> commandeListList(){
        return commandeRepository.findAll();
    }

    @GetMapping("/commandes/{id}")
    public Commande commande(@PathVariable Long id){
        return commandeRepository.findById(id).orElse(null);
    }
}
