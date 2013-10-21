package labo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author modamod
 */
public class Chercheur extends Laboratoire {
    
    private String nom;
    private String poste;
    private int numOrdinatuer;
    private int numBureau;

    public Chercheur(String nom, String poste, int numOrdinatuer, int numBureau) {
        this.nom = nom;
        this.poste = poste;
        this.numOrdinatuer = numOrdinatuer;
        this.numBureau = numBureau;
    }

    public Chercheur() {
        
    }

    public String getNom() {
        return nom;
    }

    public String getPoste() {
        return poste;
    }

    public int getNumOrdinatuer() {
        return numOrdinatuer;
    }

    public int getNumBureau() {
        return numBureau;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void setNumOrdinatuer(int numOrdinatuer) {
        this.numOrdinatuer = numOrdinatuer;
    }

    public void setNumBureau(int numBureau) {
        this.numBureau = numBureau;
    }
    
    public static boolean comparerChercheur(Chercheur ch1, Chercheur ch2){
        return ch1.getNumOrdinatuer() == ch2.getNumOrdinatuer();
    }
    
    @Override
    public String toString() {
        return "Chercheur{" + "nom=" + nom + ", poste=" + poste + ", numOrdinatuer=" + numOrdinatuer + ", numBureau=" + numBureau + '}';
    }
    
    
}