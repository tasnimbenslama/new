/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service_formation;

/**
 *
 * @author TASNIM
 */
 

 public class formation {
    private int idF;
    private String titre; 
    private String description;
    private String niveau;
    private String date_creation;
    private int prix;
    private String enseignant;

    public int getIdF() {
        return idF;
    }

    public String getTitre() {
        return titre;
    }
    public String getEnseignant() {
        return enseignant;
    }

    public String getDescription() {
        return description;
    }

    public formation(int idF, String titre, String description, String niveau, String date_creation, int prix) {
        this.idF = idF;
        this.titre = titre;
        this.description = description;
        this.niveau = niveau;
        this.date_creation = date_creation;
        this.prix = prix;
    }

    public String getNiveau() {
        return niveau;
    }

    public formation(int idF, String titre, String description, String niveau, String date_creation, int prix, String enseignant) {
        this.idF = idF;
        this.titre = titre;
        this.description = description;
        this.niveau = niveau;
        this.date_creation = date_creation;
        this.prix = prix;
        this.enseignant = enseignant;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public int getPrix() {
        return prix;
    }

    public void setIdF(int idF) {
        this.idF = idF;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Formation{" + "idF=" + idF + ", titre=" + titre + ", description=" + description + ", niveau=" + niveau + ", date_creation=" + date_creation + ", prix=" + prix + '}';
    }

    public formation(String titre, String description, String niveau, String date_creation, int prix,String enseignant) {
        this.titre = titre;
        this.description = description;
        this.niveau = niveau;
        this.date_creation = date_creation;
        this.prix = prix;
    }
    
        
           
    
}