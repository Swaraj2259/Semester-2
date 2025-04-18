CREATE DATABASE AirlineDB;
USE AirlineDB;

CREATE TABLE Flight (
    FlightID INT PRIMARY KEY AUTO_INCREMENT,
    Airline VARCHAR(255) NOT NULL,
    Source VARCHAR(100) NOT NULL,
    Destination VARCHAR(100) NOT NULL,
    DepartureTime DATETIME NOT NULL,
    ArrivalTime DATETIME NOT NULL,
    AvailableSeats INT CHECK (AvailableSeats >= 0)
);

CREATE TABLE Passenger (
    PassengerID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Email VARCHAR(255) UNIQUE,
    Phone VARCHAR(15) UNIQUE,
    PassportNumber VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE Booking (
    BookingID INT PRIMARY KEY AUTO_INCREMENT,
    PassengerID INT,
    FlightID INT,
    SeatNumber VARCHAR(10) NOT NULL,
    BookingDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    Status ENUM('Confirmed', 'Cancelled') DEFAULT 'Confirmed',
    FOREIGN KEY (PassengerID) REFERENCES Passenger(PassengerID) ON DELETE CASCADE,
    FOREIGN KEY (FlightID) REFERENCES Flight(FlightID) ON DELETE CASCADE
);

INSERT INTO Flight (Airline, Source, Destination, DepartureTime, ArrivalTime, AvailableSeats) VALUES
('Delta Airlines', 'New York', 'Los Angeles', '2025-04-01 08:00:00', '2025-04-01 11:00:00', 5),
('American Airlines', 'New York', 'Los Angeles', '2025-04-02 10:30:00', '2025-04-02 13:30:00', 2),
('United Airlines', 'Chicago', 'Miami', '2025-04-01 15:00:00', '2025-04-01 18:00:00', 3);

INSERT INTO Passenger (Name, Email, Phone, PassportNumber) VALUES
('Alice Johnson', 'alice@example.com', '9876543210', 'P1234567'),
('Bob Smith', 'bob@example.com', '9123456789', 'P9876543'),
('Charlie Brown', 'charlie@example.com', '9234567890', 'P4567891'),
('David Lee', 'david@example.com', '9012345678', 'P6543219');

INSERT INTO Booking (PassengerID, FlightID, SeatNumber, BookingDate, Status) VALUES
(1, 1, '12A', '2025-03-30 14:00:00', 'Confirmed'),
(2, 1, '14B', '2025-03-30 15:30:00', 'Confirmed'),
(3, 2, '10C', '2025-03-31 09:00:00', 'Confirmed'),
(1, 2, '11D', '2025-03-31 09:30:00', 'Confirmed'),
(4, 3, '8E', '2025-03-31 16:45:00', 'Confirmed');

SELECT FlightID, Airline, DepartureTime, ArrivalTime, AvailableSeats
FROM Flight
WHERE Source = 'New York' AND Destination = 'Los Angeles' AND AvailableSeats > 0;

SELECT p.PassengerID, p.Name, COUNT(b.BookingID) AS TotalBookings
FROM Passenger p
JOIN Booking b ON p.PassengerID = b.PassengerID
GROUP BY p.PassengerID, p.Name
HAVING TotalBookings > 3;

SELECT FlightID, Airline, Source, Destination, DepartureTime, ArrivalTime
FROM Flight
WHERE DepartureTime BETWEEN NOW() AND DATE_ADD(NOW(), INTERVAL 24 HOUR);

SELECT f.FlightID, f.Airline, f.Source, f.Destination, COUNT(b.BookingID) AS TotalBookings
FROM Flight f
LEFT JOIN Booking b ON f.FlightID = b.FlightID
GROUP BY f.FlightID, f.Airline, f.Source, f.Destination;

SELECT f.FlightID, f.Airline, f.Source, f.Destination
FROM Flight f
WHERE f.AvailableSeats = 0;






