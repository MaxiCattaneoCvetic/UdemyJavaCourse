package org.example.seccion2.visibilityOfMethods.pack2;

public class OtherClass {


    public void method1(){
        ClassB classB = new ClassB();
        // aca tampoco podemos acceder al metodo privado de la clase B

        // podemos acceder al metodo protegido ya que se encuentra en el mismo paquete, La CLASE a no podra acceder
        classB.protectedMethod();

        //la diferencia es que si una clase extiende de la clase main y se encuentra en otro paquete no podra usarlo
        classB.packageProtected();

    }




}
