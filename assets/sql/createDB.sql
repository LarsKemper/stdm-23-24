-- Erstelle die Datenbank "ArcheryClub"
CREATE DATABASE IF NOT EXISTS ArcheryClub;

-- Erstelle die Tabelle "Mitglied"
CREATE TABLE IF NOT EXISTS Mitglied (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nachname VARCHAR(255) NOT NULL,
    Vorname VARCHAR(255) NOT NULL,
    Geburtsdatum DATE,
    Geschlecht VARCHAR(10),
    Trainerschein BOOLEAN,
    ist_aktiv BOOLEAN,
    Anschrift TEXT,
    hat_Haftpflicht BOOLEAN
);

-- Erstelle die Tabelle "Trainingsplan"
CREATE TABLE IF NOT EXISTS Trainingsplan (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Wochentag ENUM('Montag', 'Dienstag', 'Mittwoch', 'Donnerstag', 'Freitag', 'Samstag', 'Sonntag') NOT NULL,
    Uhrzeit TIME,
    FOREIGN KEY (ID_Mitglied) REFERENCES Mitlgied(ID_Mitglied)
);

-- Erstelle die Tabelle "Turnierklasse"
CREATE TABLE IF NOT EXISTS Turnierklasse (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    bogenart VARCHAR(255),
    Geschlecht VARCHAR(10),
    altersgruppe VARCHAR(10)
);

-- Erstelle die Tabelle "Turnier"
CREATE TABLE IF NOT EXISTS Turnier (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    bezeichnung VARCHAR(255),
    adresse VARCHAR(255),
    maxTeilnehmer INT,
    datum DATE
);

-- Erstelle die Tabelle "Turnierteilnehmer"
CREATE TABLE IF NOT EXISTS Turnierteilnehmer (
    FOREIGN KEY (ID_turnierklasse) REFERENCES Turnierklasse(ID),
    FOREIGN KEY (ID_Mitglied) REFERENCES Mitglied(ID),
    FOREIGN KEY (ID_Turnier) REFERENCES Turnier(ID),
    platzierung INT
);