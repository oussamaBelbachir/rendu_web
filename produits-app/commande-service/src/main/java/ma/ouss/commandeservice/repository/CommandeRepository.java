package ma.ouss.commandeservice.repository;

import ma.ouss.commandeservice.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
