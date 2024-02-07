-- Erstelle die Datenbank "Bullseye"
CREATE DATABASE IF NOT EXISTS Bullseye;

-- Erstelle die Tabelle "Mitglied"
CREATE TABLE IF NOT EXISTS member (
    id INT AUTO_INCREMENT PRIMARY KEY,
    lastname VARCHAR(255) NOT NULL,
    prename VARCHAR(255) NOT NULL,
    birthday DATE,
    gender VARCHAR(10),
    licence BOOLEAN,
    is_active BOOLEAN,
    address TEXT,
    has_insurance BOOLEAN
);

-- Erstelle die Tabelle "Trainingsplan"
CREATE TABLE IF NOT EXISTS practice_plan (
    id INT AUTO_INCREMENT PRIMARY KEY,
    weekday ENUM('Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday') NOT NULL,
    datetime DATETIME,
    FOREIGN KEY (id_member) REFERENCES member(id)
);

-- Erstelle die Tabelle "Turnierklasse"
CREATE TABLE IF NOT EXISTS tournament_type (
    id INT AUTO_INCREMENT PRIMARY KEY,
    bow_sort VARCHAR(255),
    gender VARCHAR(10),
    age_group VARCHAR(10)
);

-- Erstelle die Tabelle "Turnier"
CREATE TABLE IF NOT EXISTS tournament (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    address VARCHAR(255),
    max_attendees INT,
    date DATE
);

-- Erstelle die Tabelle "Turnierteilnehmer"
CREATE TABLE IF NOT EXISTS tournament_attendees (
    FOREIGN KEY (id_tournament_type) REFERENCES tournament_type(id),
    FOREIGN KEY (id_member) REFERENCES member(id),
    FOREIGN KEY (id_tournament) REFERENCES tournament(id),
    place INT
);