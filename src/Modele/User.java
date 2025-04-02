package Modele;

public class User {
    public enum Role {
        CLIENT,
        ADMIN
    }

    private int userId;
    private String userNom;
    private String userPrenom;
    private String userEmail;
    private int userTel;
    private String userPassword;
    private Role role;

    public User(int userId, String userNom, String userPrenom, String userEmail, int userTel, String userPassword) {
        this.userId = userId;
        this.userNom = userNom;
        this.userPrenom = userPrenom;
        this.userEmail = userEmail;
        this.userTel = userTel;
        this.userPassword = userPassword;
        this.role = role;
    }

    // Getters
    public int getUserId() { return userId; }
    public String getUserNom() { return userNom; }
    public String getUserPrenom() { return userPrenom; }
    public String getUserEmail() { return userEmail; }
    public int getUserTel() { return userTel; }
    public String getUserPassword() { return userPassword; }
    public Role getRole() { return role; }

    // Setters
    public void setUserId(int userId) { this.userId = userId; }
    public void setUserNom(String userNom) { this.userNom = userNom; }
    public void setUserPrenom(String userPrenom) { this.userPrenom = userPrenom; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    public void setUserTel(int userTel) { this.userTel = userTel; }
    public void setUserPassword(String userPassword) { this.userPassword = userPassword; }
    public void setRole(Role role) { this.role = role; }
}
