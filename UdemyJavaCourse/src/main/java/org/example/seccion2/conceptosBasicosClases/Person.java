package org.example.seccion2.conceptosBasicosClases;

import org.example.seccion2.conceptosBasicosClases.business.Company;

public class Person {
    // when the type  are orange > are primitives
    // when the type are blank > are Obj
    private String firstName = "Jerry";
    private int age;
    private long id;
    private char middleInitial = 'J'; // just one character
    private byte myByte;
    private Company company;
    private NewsAgency newsAgency;

    //constante
    // todas las constantes se deben escribir con mayuscula
    private final double PI = 3.14;
    private final String MY_BIG_CONSTANT = "Hi, this is my constant message";


    public void myTestMethod(){
        // var es solamente para variables locales
        var age = 21;
        var name = "Jake";


    }






}
