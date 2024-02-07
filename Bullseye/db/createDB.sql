-- Erstelle die Datenbank "ArcheryClub"
CREATE DATABASE IF NOT EXISTS ArcheryClub;

-- Erstelle die Tabelle "Mitglied"
CREATE TABLE IF NOT EXISTS member (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    lastname VARCHAR(255) NOT NULL,
    prename VARCHAR(255) NOT NULL,
    bithdate DATE,
    gender VARCHAR(10),
    licence BOOLEAN,
    is_activ BOOLEAN,
    adress TEXT,
    has_insurance BOOLEAN
);

-- Erstelle die Tabelle "Trainingsplan"
CREATE TABLE IF NOT EXISTS practiceplan (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    weekday ENUM('Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday') NOT NULL,
    clocktime TIME,
    FOREIGN KEY (ID_member) REFERENCES member(ID)
);

-- Erstelle die Tabelle "Turnierklasse"
CREATE TABLE IF NOT EXISTS tournamenttype (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    bowsort VARCHAR(255),
    gender VARCHAR(10),
    agegroup VARCHAR(10)
);

-- Erstelle die Tabelle "Turnier"
CREATE TABLE IF NOT EXISTS tournament (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    adress VARCHAR(255),
    maxparticipants INT,
    date DATE
);

-- Erstelle die Tabelle "Turnierteilnehmer"
CREATE TABLE IF NOT EXISTS tournamentParticipants (
    FOREIGN KEY (ID_tournamenttype) REFERENCES tournamenttype(ID),
    FOREIGN KEY (ID_member) REFERENCES member(ID),
    FOREIGN KEY (ID_tournament) REFERENCES tournament(ID),
    place INT
);