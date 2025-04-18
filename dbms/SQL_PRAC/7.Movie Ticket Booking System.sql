CREATE DATABASE MovieBookingSystem;
USE MovieBookingSystem;

CREATE TABLE Movie (
    MovieID INT PRIMARY KEY,
    Title VARCHAR(255),
    Genre VARCHAR(100),
    Duration INT,  -- Duration in minutes
    Rating DECIMAL(3, 1)
);

CREATE TABLE Theatre (
    TheatreID INT PRIMARY KEY,
    Name VARCHAR(255),
    Location VARCHAR(255),
    Capacity INT
);

CREATE TABLE Showtime (
    ShowtimeID INT PRIMARY KEY,
    MovieID INT,
    TheatreID INT,
    ShowDate DATE,
    AvailableSeats INT,
    FOREIGN KEY (MovieID) REFERENCES Movie(MovieID),
    FOREIGN KEY (TheatreID) REFERENCES Theatre(TheatreID)
);

CREATE TABLE Booking (
    BookingID INT PRIMARY KEY,
    ShowtimeID INT,
    UserID INT,
    TicketsBooked INT,
    BookingDate DATE,
    FOREIGN KEY (ShowtimeID) REFERENCES Showtime(ShowtimeID)
);

-- Inserting Movies
INSERT INTO Movie (MovieID, Title, Genre, Duration, Rating) VALUES
(1, 'Avengers: Endgame', 'Action', 181, 8.4),
(2, 'The Lion King', 'Animation', 118, 7.0),
(3, 'Titanic', 'Romance', 195, 7.8);

-- Inserting Theatres
INSERT INTO Theatre (TheatreID, Name, Location, Capacity) VALUES
(1, 'Cineplex 1', 'Downtown', 200),
(2, 'Cineplex 2', 'Mall Area', 150);

-- Inserting Showtimes
INSERT INTO Showtime (ShowtimeID, MovieID, TheatreID, ShowDate, AvailableSeats) VALUES
(1, 1, 1, '2025-04-01', 100),
(2, 2, 1, '2025-04-02', 150),
(3, 3, 2, '2025-04-03', 50);

-- Inserting Bookings
INSERT INTO Booking (BookingID, ShowtimeID, UserID, TicketsBooked, BookingDate) VALUES
(1, 1, 101, 2, '2025-03-28'),
(2, 2, 102, 3, '2025-03-29'),
(3, 3, 103, 1, '2025-03-30');

SELECT m.Title, m.Genre, m.Duration, m.Rating
FROM Movie m
JOIN Showtime s ON m.MovieID = s.MovieID
WHERE s.TheatreID = 1;  -- Replace with the desired TheatreID

SELECT m.Title, SUM(b.TicketsBooked) AS TotalTicketsBooked
FROM Movie m
JOIN Showtime s ON m.MovieID = s.MovieID
JOIN Booking b ON s.ShowtimeID = b.ShowtimeID
WHERE b.BookingDate >= CURDATE() - INTERVAL 1 MONTH
GROUP BY m.MovieID
ORDER BY TotalTicketsBooked DESC
LIMIT 1;

SELECT s.ShowtimeID, m.Title, s.ShowDate, s.AvailableSeats
FROM Showtime s
JOIN Movie m ON s.MovieID = m.MovieID
WHERE s.AvailableSeats > 0;

SELECT t.Name, SUM(b.TicketsBooked) AS TotalBookings
FROM Theatre t
JOIN Showtime s ON t.TheatreID = s.TheatreID
JOIN Booking b ON s.ShowtimeID = b.ShowtimeID
GROUP BY t.TheatreID
ORDER BY TotalBookings DESC
LIMIT 1;

SELECT b.BookingID, m.Title, b.TicketsBooked, b.BookingDate
FROM Booking b
JOIN Showtime s ON b.ShowtimeID = s.ShowtimeID
JOIN Movie m ON s.MovieID = m.MovieID
WHERE b.BookingDate >= CURDATE() - INTERVAL 3 MONTH
LIMIT 0, 2000;

