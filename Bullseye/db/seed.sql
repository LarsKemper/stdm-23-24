INSERT INTO member (id, lastname, prename, birthday, gender, license, is_active, address, has_insurance)
VALUES
(1, 'Mustermann', 'Max', '1990-01-01', 'M', TRUE, TRUE, 'Musterstraße 1, Musterstadt', TRUE),
(2, 'Musterfrau', 'Maria', '1995-03-15', 'W', FALSE, TRUE, 'Beispielweg 2, Beispielstadt', FALSE),
(689, 'Grab', 'Manuel', '2003-05-04', 'M', FALSE, TRUE, 'Hundeweg 69, Dummmhausen', FALSE),
(16, 'Peterson', 'Peter', '1999-04-17', 'M', TRUE, TRUE, 'Poststraße 100, Berlin', TRUE), 
(2000, 'Gausse', 'Gundula', '1978-12-30', 'W', FALSE, FALSE, 'Stauffenbergstraße 1, Afrika', FALSE),
(77, 'Eber', 'Hans', '1985-07-07', 'M', TRUE, TRUE, 'Zur Alten Wanne 10, Aua', TRUE);

INSERT INTO practice_plan (weekday, datetime, id_member)
VALUES
('Monday' , '15:30:00', 1),
('Monday','16:30:00', 2),
('Tuesday','20:30:00', 689),
('Wednesday','17:30:00', 77),
('Wednesday','19:00:00', 2000),
('Thursday','20:00:00', 16);

INSERT INTO tournament_type (id, bow_sort, gender, age_group)
VALUES
(1, 'compound', 'M', 'senior'),
(2, 'longbow', 'W', 'junior'),
(3, 'recurve', 'W', 'open'),
(4, 'compound', 'D', 'senior');

INSERT INTO tournament (id, title, address, max_attendees, date)
VALUES
(1, 'Senior World Championship 2024 Compound Bow Male', 'Gut Insel 41, Muenster', 100, '2024-06-06'),
(2, 'Junior World Championship 2024 longbow Female', 'Gut Insel 41, Muenster', 100, '2024-06-07'),
(3, 'Open Masters 2025 Recurve Bow Female', 'Brinkstrasse 13, Osnabrueck', 64, '2025-04-15'),
(4, 'Double Masters 2025 Compound Bow', 'Brinkstrasse 13, Osnabrueck', 32, '2025-04-16');

