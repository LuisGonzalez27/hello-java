package org.lessons.java;
public class StampaSaluto{
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        //BONUS
        //creo due oggetti diversi, con due istanze diverse pero della stessa classe Persona
        Persona persona1 = new Persona("Luca", "Rossi", 25 , "Blu");
        Persona persona2 = new Persona("Silvia", "Ferrari", 27 , "Rosso");

        System.out.println(persona1.nome + " " + persona1.cognome);
        System.out.println(persona2.nome + " " + persona2.cognome);


    }
}