package org.example.seccion2.visibilityOfMethods.pack2;

public class ClassB {


    public  void publicMethod(){
        System.out.println("This is the public method of classB");

        // podemos llamar al metodo privado aca y podremos verlo en la clase a
        privateMethod();
    }

    // este metodo solo esta disponible en la clase b
    private void privateMethod(){
        System.out.println("This is the private method of classB");
    }

    protected void protectedMethod(){
        System.out.println("This is the protected method of classB");
    }

    //PackageProtectedMethod

    // La diferencia con el protected de arriba, este metodo no estara disponible para las subclases que hereden de esta clase y se encuentren en otro paquete
    void packageProtected(){
        System.out.println("This is the packageprotected method of classB");
    }




}
