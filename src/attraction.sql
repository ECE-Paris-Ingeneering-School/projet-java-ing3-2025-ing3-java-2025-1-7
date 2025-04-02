CREATE TABLE User (
                      id_user INT PRIMARY KEY AUTO_INCREMENT,
                      nom VARCHAR(50),
                      prenom VARCHAR(50),
                      email VARCHAR(100) UNIQUE,
                      tel VARCHAR(20),
                      mdp VARCHAR(255),
                      role ENUM('client', 'admin') NOT NULL
);

CREATE TABLE Attraction (
                            id_attraction INT PRIMARY KEY AUTO_INCREMENT,
                            nom VARCHAR(100),
                            type VARCHAR(50),
                            capacite INT,
                            duree TIME,
                            statut ENUM('active', 'inactive') DEFAULT 'active'
);

CREATE TABLE Reservation (
                             id_reservation INT PRIMARY KEY AUTO_INCREMENT,
                             id_user INT,
                             id_attraction INT,
                             date_reservation DATE,
                             statut ENUM('en_attente', 'confirmee', 'annulee') DEFAULT 'en_attente',
                             FOREIGN KEY (id_user) REFERENCES User(id_user),
                             FOREIGN KEY (id_attraction) REFERENCES Attraction(id_attraction)
);

CREATE TABLE Billet (
                        id_billet INT PRIMARY KEY AUTO_INCREMENT,
                        id_reservation INT,
                        statut ENUM('valide', 'utilise', 'expire') DEFAULT 'valide',
                        FOREIGN KEY (id_reservation) REFERENCES Reservation(id_reservation)
);

CREATE TABLE Paiement (
                          id_paiement INT PRIMARY KEY AUTO_INCREMENT,
                          id_reservation INT,
                          montant DECIMAL(10,2),
                          statut ENUM('en_attente', 'effectue', 'refuse') DEFAULT 'en_attente',
                          date_paiement DATE,
                          FOREIGN KEY (id_reservation) REFERENCES Reservation(id_reservation)
);

CREATE TABLE Historique (
                            id_historique INT PRIMARY KEY AUTO_INCREMENT,
                            id_user INT,
                            id_reservation INT,
                            date_visite DATE,
                            FOREIGN KEY (id_user) REFERENCES User(id_user),
                            FOREIGN KEY (id_reservation) REFERENCES Reservation(id_reservation)
);

CREATE TABLE Reduction (
                           id_reduction INT PRIMARY KEY AUTO_INCREMENT,
                           id_user INT,
                           pourcentage DECIMAL(5,2),
                           raison VARCHAR(100),
                           FOREIGN KEY (id_user) REFERENCES User(id_user)
);
