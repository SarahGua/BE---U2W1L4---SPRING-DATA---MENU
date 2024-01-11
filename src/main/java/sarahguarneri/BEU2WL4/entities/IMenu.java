package sarahguarneri.BEU2WL4.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "IMenu")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class IMenu {
    @Id
    @GeneratedValue
    private UUID id;
    private int kcal;
    private double price;
    private String name;
}
