package org.example.seccion2.model.Method;

public class Person {
    //viven dentro de una clase
    //void: no devuelve nada

    private String middleName = "Chistopher";
    // es estatica, pertenecen a todas las instancias del objeto -> pertenece a la clase, es una constante y nunca cambiara
    // podemos llamarla en un metodo estatico ya que es una variable estatica, no es necesario instanciarla
    public static Double PI = 3.14;

    // inicializacion static
    public  static  int [] nums = initNums();

    // ------ podemos utilizar otro enfoque para incializar este array estatico-----------

/*    static {
        nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
        nums[4] = 3;
    }*/

    // ----------------

    // inicializacion static
    public static int [] initNums(){
            // inicializamos array
           int [] nums = new int[5];
            // seteamos elementos
            nums[0] = 3;
            nums[1] = 3;
            nums[2] = 3;
            nums[4] = 3;

            return  nums;
    }




    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);

    }
    public int add(int number1, int number2) {
        int suma = number1 + number2;
        return suma;

    }

    // deblaramos un metodo que permite una matriz de Strings, ya que no sabemos cuantos strings vamos a recibir
    // se llama VAR ARGS -> ARGUMENTOS VARIABLES
    public void test(String[] words){
        // do something claver with words

    }

    // SIEMPRE EL VAR ARGS TIENE QUE SER EL ULTIMO ARGUMENTO
    public void test2(int number1,int number2, String... words){
        // do something claver

        for (int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

    }
    public  static void  sayHello2(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("My groovy message");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(2,3));
        //creamos una array de strings
        String [] words = new String[] {"one","two","three"};
        p1.test(words);

        p1.test2(1,2,"one","two","three");

    }

    public static void main2(String[] args) {
        // al ser un metodo static no necesitamos instanciar la clase para utilizarlo
        sayHello2();

    }
}
