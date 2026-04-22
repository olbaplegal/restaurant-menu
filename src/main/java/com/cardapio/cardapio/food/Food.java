package com.cardapio.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")

// in runtime lombok will generate the nexts boiler plaites
@Getter // make a get for all the atributes
@NoArgsConstructor // declare a constructor that receive not enven one the arguments
@AllArgsConstructor // declare a constructor that receive all the arguments
@EqualsAndHashCode(of = "id") // indicate that the id is the object's indentificator
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
