package Modele;
import java.util.Date;

public class Reservation {
    public enum StatutReservation{
        ATTENTE,
        CONFIRMEE,
        ANNULEE
    }

    private int idReservation;    // Clé primaire
    private User user;            // Clé étrangère vers User
    private Attraction attraction; // Clé étrangère vers Attraction
    private Date dateReservation;
    private StatutReservation statut;  // Utilisation de l'enum StatutReservation

    // Constructeur
    public Reservation(int idReservation, User user, Attraction attraction, Date dateReservation, StatutReservation statut) {
        this.idReservation = idReservation;
        this.user = user;
        this.attraction = attraction;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    // Getters et setters
    public int getIdReservation() {return idReservation;}
    public User getUser() {return user;}
    public Attraction getAttraction() {return attraction;}
    public Date getDateReservation() {return dateReservation;}
    public StatutReservation getStatut() {return statut;}

    public void setStatut(StatutReservation statut) {
        this.statut = statut;
    }
}
