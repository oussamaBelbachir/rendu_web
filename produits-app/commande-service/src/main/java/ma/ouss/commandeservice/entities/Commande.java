package ma.ouss.commandeservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString @Builder
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate orderDate;
}
