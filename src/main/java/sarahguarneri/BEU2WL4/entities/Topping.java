package sarahguarneri.BEU2WL4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Toppings")
@Getter
@Setter
@ToString
public class Topping extends IMenu{

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;
}
