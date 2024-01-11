package sarahguarneri.BEU2WL4.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pizza")
public class Pizza extends IMenu{
    @OneToMany(mappedBy = "pizza")
    private List<Topping> toppings = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    public Pizza() {
        toppings = new ArrayList<>();
        Topping tomato = new Topping();
        tomato.setName("tomato");
        tomato.setKcal(40);
        tomato.setPrice(0.50);
        toppings.add(tomato);
        Topping cheese = new Topping();
        cheese.setName("cheese");
        cheese.setPrice(0.6);
        cheese.setKcal(300);
        toppings.add(cheese);
        setName("Pizza Margherita");
        setPrice(4.99);
        setKcal(1104);
    }

    public void addTopping(Topping t){
        toppings.add(t);
    }
}
