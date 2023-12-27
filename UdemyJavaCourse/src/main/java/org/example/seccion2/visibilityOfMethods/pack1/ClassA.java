package org.example.seccion2.visibilityOfMethods.pack1;

import org.example.seccion2.visibilityOfMethods.pack2.ClassB;

public class ClassA {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.publicMethod();
        // No podemos llamar al metodo privado directamente, pero podemos utilizarlo dentro de metodo publico que es accesible en la clase B

    }
}
