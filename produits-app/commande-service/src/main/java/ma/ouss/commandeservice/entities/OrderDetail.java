package ma.ouss.commandeservice.entities;
import jakarta.persistence.*;
import lombok.*;
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private int quantity;
}
