CREATE TABLE IF NOT EXISTS member (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    lastname TEXT NOT NULL,
    firstname TEXT NOT NULL,
    birthday DATE,
    gender varchar(6) CHECK ( gender IN ('MALE', 'FEMALE', 'DIVERS') ),
    address TEXT,
    license BOOLEAN,
    status varchar(6) CHECK ( status IN ('ACTIVE', 'PASSIVE') ) default 'PASSIVE',
    is_active BOOLEAN,
    has_insurance BOOLEAN
);

CREATE TABLE IF NOT EXISTS practice_plan (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_member INTEGER,
    weekday TEXT NOT NULL,
    datetime DATETIME,
    FOREIGN KEY (id_member) REFERENCES member(id)
);

CREATE TABLE IF NOT EXISTS tournament_type (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    bow_sort varchar(8) CHECK ( bow_sort IN ('COMPOUND', 'LONGBOW', 'RECURVE') ),
    gender varchar(6) CHECK ( gender IN ('MALE', 'FEMALE', 'DIVERS') ),
    age_group varchar(6) CHECK ( age_group IN ('JUNIOR', 'SENIOR', 'OPEN') )
);

CREATE TABLE IF NOT EXISTS tournament (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT,
    address TEXT,
    max_attendees INT,
    date DATE
);

CREATE TABLE IF NOT EXISTS tournament_attendees (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_tournament_type INTEGER,
    id_member INTEGER,
    id_tournament INTEGER,
    place INT,
    FOREIGN KEY (id_tournament_type) REFERENCES tournament_type(id),
    FOREIGN KEY (id_member) REFERENCES member(id),
    FOREIGN KEY (id_tournament) REFERENCES tournament(id)
);