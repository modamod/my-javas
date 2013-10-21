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
public class Laboratoire {
    private String nom;
    private final int NBR_BUREAUX_MAX = 5;
    private String specialite;
    private int nbr_bureaux;
    private Bureau[] listeBureau = new Bureau[NBR_BUREAUX_MAX];

    public Laboratoire(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public Laboratoire() {
    }

    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public void ajouterBureau(Bureau bureau){
        System.out.println("en cours d'ajout d'un bureau dans un labo...");
        if (nbr_bureaux >= NBR_BUREAUX_MAX){
            System.err.println("Echec! On peut plus ajouter des bureaux dans ce labo");
            System.exit(-1);
        }
        listeBureau[nbr_bureaux - 1] = bureau;
        nbr_bureaux++;
        System.out.println("L'ajout du bureau dans le labo a ete effectue avec success.");
    }
    public int chercherMinBureau(){
        int res = 0;
        for (int i = 0; i < nbr_bureaux ; i++){
            if (listeBureau[res].getNbr_cherch() < listeBureau[i].getNbr_cherch()){
                res = i;
            }
        }
        return res;
    }
}
