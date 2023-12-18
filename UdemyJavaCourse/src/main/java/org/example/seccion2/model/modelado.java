package org.example.seccion2.model;

import java.time.LocalDate;

public class modelado {
    public static void main(String[] args) {

        Person tom = new Person("Tomas","Smith",LocalDate.of(1984,6,15));
        Person janet = new Person("Janet","Jackson",LocalDate.of(1985,12,3));

        tom.setSpouce(janet);

        Dog fido = new Dog("fido",LocalDate.of(2018,1,1));
        fido.bark();
        tom.setPet(fido);


        System.out.println(tom);

    }
}
