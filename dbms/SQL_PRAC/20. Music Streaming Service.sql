CREATE DATABASE MusicStreaming;
USE MusicStreaming;

CREATE TABLE User (
    UserID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100) UNIQUE,
    SubscriptionType ENUM('Free', 'Premium', 'Family'),
    JoinDate DATE
);

CREATE TABLE Artist (
    ArtistID INT PRIMARY KEY,
    Name VARCHAR(100),
    Genre VARCHAR(50),
    Country VARCHAR(50)
);

CREATE TABLE Album (
    AlbumID INT PRIMARY KEY,
    Title VARCHAR(100),
    ArtistID INT,
    ReleaseDate DATE,
    Genre VARCHAR(50),
    FOREIGN KEY (ArtistID) REFERENCES Artist(ArtistID) ON DELETE CASCADE
);

CREATE TABLE Song (
    SongID INT PRIMARY KEY,
    Title VARCHAR(100),
    AlbumID INT,
    Duration TIME,
    PlayCount INT DEFAULT 0,
    FOREIGN KEY (AlbumID) REFERENCES Album(AlbumID) ON DELETE CASCADE
);

CREATE TABLE Playlist (
    PlaylistID INT PRIMARY KEY,
    Name VARCHAR(100),
    UserID INT,
    CreatedDate DATE,
    FOREIGN KEY (UserID) REFERENCES User(UserID) ON DELETE CASCADE
);

CREATE TABLE PlaylistSongs (
    PlaylistID INT,
    SongID INT,
    AddedDate DATE,
    PRIMARY KEY (PlaylistID, SongID),
    FOREIGN KEY (PlaylistID) REFERENCES Playlist(PlaylistID) ON DELETE CASCADE,
    FOREIGN KEY (SongID) REFERENCES Song(SongID) ON DELETE CASCADE
);

INSERT INTO User VALUES
(1, 'Alice Johnson', 'alice@example.com', 'Premium', '2024-01-15'),
(2, 'Bob Smith', 'bob@example.com', 'Free', '2023-12-10'),
(3, 'Charlie Brown', 'charlie@example.com', 'Family', '2022-11-25');

INSERT INTO Artist VALUES
(1, 'The Weeknd', 'R&B', 'Canada'),
(2, 'Taylor Swift', 'Pop', 'USA'),
(3, 'Drake', 'Hip-Hop', 'Canada');

INSERT INTO Album VALUES
(1, 'After Hours', 1, '2020-03-20', 'R&B'),
(2, 'Midnights', 2, '2022-10-21', 'Pop'),
(3, 'Scorpion', 3, '2018-06-29', 'Hip-Hop');

INSERT INTO Song VALUES
(1, 'Blinding Lights', 1, '00:03:20', 5000000),
(2, 'Anti-Hero', 2, '00:03:45', 3000000),
(3, 'God’s Plan', 3, '00:04:00', 4500000);

INSERT INTO Playlist VALUES
(1, 'Workout Jams', 1, '2024-03-01'),
(2, 'Chill Vibes', 2, '2024-02-15'),
(3, 'Party Mix', 3, '2024-03-10');

INSERT INTO PlaylistSongs VALUES
(1, 1, '2024-03-02'),
(1, 2, '2024-03-02'),
(2, 3, '2024-02-16');

SELECT Title, PlayCount
FROM Song
ORDER BY PlayCount DESC
LIMIT 5;

CREATE TABLE UserFollowsArtist (
    UserID INT,
    ArtistID INT,
    PRIMARY KEY (UserID, ArtistID),
    FOREIGN KEY (UserID) REFERENCES User(UserID) ON DELETE CASCADE,
    FOREIGN KEY (ArtistID) REFERENCES Artist(ArtistID) ON DELETE CASCADE
);

INSERT INTO UserFollowsArtist VALUES
(1, 1), (2, 1), (3, 1),  -- The Weeknd has 3 followers
(1, 2), (3, 2),          -- Taylor Swift has 2 followers
(2, 3);                  -- Drake has 1 follower

SELECT a.Name, COUNT(ufa.UserID) AS FollowerCount
FROM Artist a
JOIN UserFollowsArtist ufa ON a.ArtistID = ufa.ArtistID
GROUP BY a.ArtistID, a.Name
ORDER BY FollowerCount DESC
LIMIT 3;

SELECT * 
FROM Playlist
WHERE CreatedDate >= CURDATE() - INTERVAL 1 MONTH;

SELECT a.Title AS Album, SUM(s.PlayCount) AS TotalPlays
FROM Album a
JOIN Song s ON a.AlbumID = s.AlbumID
GROUP BY a.AlbumID, a.Title;

SELECT u.UserID, u.Name, COUNT(p.PlaylistID) AS PlaylistCount
FROM User u
JOIN Playlist p ON u.UserID = p.UserID
GROUP BY u.UserID, u.Name
ORDER BY PlaylistCount DESC
LIMIT 5;


