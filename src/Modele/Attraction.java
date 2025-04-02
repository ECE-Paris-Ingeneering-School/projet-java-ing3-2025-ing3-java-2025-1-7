package Modele;

public class Attraction {
    public enum StatutAttraction {
        ACTIF,
        INACTIF
    }

    private int idAttraction;    // Clé primaire
    private String nom;
    private String type;
    private int capacite;
    private String duree;
    private StatutAttraction statut; // Utilisation de l'enum StatutAttraction pour le statut

    // Constructeur
    public Attraction(int idAttraction, String nom, String type, int capacite, String duree, StatutAttraction statut) {
        this.idAttraction = idAttraction;
        this.nom = nom;
        this.type = type;
        this.capacite = capacite;
        this.duree = duree;
        this.statut = statut;
    }

    // Getters et setters
    public int getIdAttraction() {
        return idAttraction;}

    public void setIdAttraction(int idAttraction) {
        this.idAttraction = idAttraction;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public StatutAttraction getStatut() {
        return statut;
    }

    public void setStatut(StatutAttraction statut) {
        this.statut = statut;
    }
}
