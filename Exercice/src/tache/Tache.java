package tache;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author modamod
 */
public class Tache {
    private int idTache;
    private int dure;
    private String libelle;

    public Tache() {
    }

    public Tache(int idTache, int dure, String libelle) {
        this.idTache = idTache;
        this.dure = dure;
        this.libelle = libelle;
    }

    public int getIdTache() {
        return idTache;
    }

    public void setIdTache(int idTache) {
        this.idTache = idTache;
    }

    public int getDure() {
        return dure;
    }

    public void setDure(int dure) {
        this.dure = dure;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public static boolean comparerTache(Tache t1, Tache t2){
        return t1.getIdTache() == t2.getIdTache();
    }

    @Override
    public String toString() {
        return "Tache{" + "idTache=" + idTache + ", dure=" + dure + ", libelle=" + libelle + '}';
    }
    
    
    
}
