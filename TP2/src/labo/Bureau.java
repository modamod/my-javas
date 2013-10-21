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
public class Bureau {
    
    final int NBR_CHERCHEURS_MAX = 5;
    static int nbrBureau;
    private int codeBureau;
    String nomBureau;
    int nbr_cherch;
    Chercheur[] listeChercheur = new Chercheur[NBR_CHERCHEURS_MAX];

    public Bureau(String nomBureau) {
        this.nomBureau = nomBureau;
        this.codeBureau = nbrBureau;
        nbrBureau += 1;
    }

    public int getCodeBureau() {
        return codeBureau;
    }

    
    public int getNbrBureau() {
        return nbrBureau;
    }

    public String getNomBureau() {
        return nomBureau;
    }

    public Chercheur[] getListeChercheur() {
        return listeChercheur;
    }

    public void setNomBureau(String nomBureau) {
        this.nomBureau = nomBureau;
    }

    public void setListeChercheur(Chercheur[] listeChercheur) {
        this.listeChercheur = listeChercheur;
    }
    public int trouverChercheur(int id){
        for(int i = 0; i < this.nbr_cherch; i++){
            if (listeChercheur[i].getNumOrdinatuer() == id)
                return i;
        }
        return -1; //Valeur qui indique que le chercheur n'existe pas dans ce bureau
    }
    public void insererChercheur(Chercheur cher){
        System.out.println("en cours d'ajout d'un chercheur dans le bureau...");
        if (this.nbr_cherch >= NBR_CHERCHEURS_MAX){
            System.err.println("Le nombre max des chercheurs dans ce Bureau est "
                    + "attaint");
        }else{
            listeChercheur[nbr_cherch] = cher;
            this.nbr_cherch++;
            System.out.println("L'ajout a ete effectue avec succes.");
        }
    }
    public void supprimerChercheur(int id){
        System.out.println("en cours de suppression d'un chercheur d'un bureau...");
        int index = trouverChercheur(id);
        if (index == -1){
            System.err.println("le chercheur n'existe pas dans ce bureau");
            System.exit(-1);
        }
        if (index == nbr_cherch - 1){
            this.listeChercheur[index] = null;
        }else{
            listeChercheur[index] = listeChercheur[nbr_cherch - 1];
            listeChercheur[nbr_cherch - 1] = null;
            nbr_cherch--;
            System.out.println("Suppression effectue avec succes");
        }
        
    }

    public int getNbr_cherch() {
        return nbr_cherch;
    }
    
    @Override
    public String toString() {
        String str = "Bureau{" + "codeBureau=" + codeBureau + ", nomBureau=" + nomBureau + ", nbr_cherch=" + nbr_cherch + "listeChercheur= {";
        for(int i = 0; i < this.nbr_cherch; i++){
            str += "\n" + listeChercheur[i].toString();
        }
        str += " }\n" + "}";
        return str;
    }
}
