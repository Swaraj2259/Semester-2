CREATE DATABASE SportsTournament;
USE SportsTournament;

CREATE TABLE Team (
    TeamID INT PRIMARY KEY,
    Name VARCHAR(100),
    Coach VARCHAR(100),
    City VARCHAR(100),
    Ranking INT
);

CREATE TABLE Player (
    PlayerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    TeamID INT,
    Position VARCHAR(50),
    GoalsScored INT,
    FOREIGN KEY (TeamID) REFERENCES Team(TeamID)
);

CREATE TABLE Matches (
    MatchID INT PRIMARY KEY,
    Team1ID INT,
    Team2ID INT,
    MatchDate DATE,  -- Renamed 'Date' to 'MatchDate' (to avoid conflicts with SQL keywords)
    Venue VARCHAR(100),
    ScoreTeam1 INT,
    ScoreTeam2 INT,
    FOREIGN KEY (Team1ID) REFERENCES Team(TeamID) ON DELETE CASCADE,
    FOREIGN KEY (Team2ID) REFERENCES Team(TeamID) ON DELETE CASCADE
);

CREATE TABLE Referee (
    RefereeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Experience INT,
    Contact VARCHAR(15)
);

INSERT INTO Team VALUES 
(1, 'Team A', 'John Doe', 'New York', 1),
(2, 'Team B', 'Jane Smith', 'Los Angeles', 2),
(3, 'Team C', 'Mark Johnson', 'Chicago', 3);

INSERT INTO Player VALUES 
(1, 'Player 1', 25, 1, 'Forward', 10),
(2, 'Player 2', 30, 1, 'Midfielder', 8),
(3, 'Player 3', 22, 2, 'Defender', 12),
(4, 'Player 4', 28, 2, 'Forward', 15),
(5, 'Player 5', 24, 3, 'Goalkeeper', 5);

INSERT INTO Matches (MatchID, Team1ID, Team2ID, MatchDate, Venue, ScoreTeam1, ScoreTeam2) 
VALUES 
(1, 1, 2, '2024-03-01', 'Stadium A', 2, 1), 
(2, 2, 3, '2024-03-02', 'Stadium B', 1, 2), 
(3, 1, 3, '2024-03-03', 'Stadium C', 3, 2);


INSERT INTO Referee VALUES 
(1, 'Referee 1', 12, '5551234567'),
(2, 'Referee 2', 8, '5559876543'),
(3, 'Referee 3', 15, '5551122334');

SELECT * FROM Team 
ORDER BY Ranking ASC 
LIMIT 5;

SELECT Name, MAX(GoalsScored) AS MostGoals
FROM Player;

SELECT * FROM Matches  
WHERE MatchDate >= CURDATE() - INTERVAL 7 DAY;

SELECT * FROM Referee 
WHERE Experience > 10;

SELECT Team1ID AS Team, COUNT(*) AS Wins 
FROM Matches 
WHERE ScoreTeam1 > ScoreTeam2 
GROUP BY Team1ID 
HAVING COUNT(*) > 5 

UNION 

SELECT Team2ID AS Team, COUNT(*) AS Wins 
FROM Matches 
WHERE ScoreTeam2 > ScoreTeam1 
GROUP BY Team2ID 
HAVING COUNT(*) > 5;
