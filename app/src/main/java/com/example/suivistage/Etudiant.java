package com.example.suivistage;

import java.util.Date;

public class Etudiant {
    protected String id;
    protected String nom;
    protected String prenom;
    protected String classe;
    protected Date annee;


    //constructeur paramétré
    public Etudiant (String id, String nom, String prenom, String classe, Date annee){
        super();
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.classe=classe;
        this.annee=annee;
    }


    //Les accesseurs et les mutateurs
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom=nom;
    }

    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }

    public String getClasse(){
        return classe;
    }
    public void setClasse(String classe){
        this.classe=classe;
    }

    public Date getAnnee(){
        return annee;
    }
    public void setAnnee(Date annee){
        this.annee=annee;
    }

}
