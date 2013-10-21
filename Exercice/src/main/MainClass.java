/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import tache.*;

/**
 *
 * @author modamod
 */
public class MainClass {
    public static void main(String args[]){
        Ingenieur ing1 = new Ingenieur("web","CVP", "09144734", "Errhmani", "Modhaffer");
        Ingenieur ing2 = new Ingenieur("Chef de projet", "Contrat", "09457622",
                "Foulen", "Fouleni");
        Tache t1, t2, t3, t4;
        t1 = new Tache(0,12,"Developpment");
        t2 = new Tache(1,2,"Analyse");
        t3 = new Tache(2,1,"Conception");
        t4 = new Tache(3,5,"Test");
        
        ing1.ajouterTache(t2);
        ing1.ajouterTache(t1);
        ing2.ajouterTache(t3);
        ing2.ajouterTache(t4);
        
        System.out.println(ing1.toString());
        System.out.println(ing2.toString());
        System.out.println(Ingenieur.getNbrPersonne());
    }
}
