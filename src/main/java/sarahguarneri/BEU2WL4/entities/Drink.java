package sarahguarneri.BEU2WL4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Drink")
@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor
public class Drink extends IMenu{

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
