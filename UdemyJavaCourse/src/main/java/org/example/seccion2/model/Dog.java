package org.example.seccion2.model;

import java.time.LocalDate;

//heredamos los atributos de PET
public class Dog extends Pet{


    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }

    public Dog() {
    }

    public void bark(){
        System.out.println("Ruff Ruff");
    }
}
