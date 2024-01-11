package sarahguarneri.BEU2WL4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Menu")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Menu extends IMenu{
    @OneToMany(mappedBy = "menu")
    List<Pizza> pizzas = new ArrayList<>();
    @OneToMany(mappedBy = "menu")
    List<Drink> drinks = new ArrayList<>();
//    List<Topping> toppings = new ArrayList<>();

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

//    public void addTopping(Topping topping){
//        toppings.add(topping);
//    }

    public void addDrink(Drink drink){
        drinks.add(drink);
    }
}
