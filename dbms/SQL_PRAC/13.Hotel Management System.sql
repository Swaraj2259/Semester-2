CREATE DATABASE HotelManagement;
USE HotelManagement;

CREATE TABLE Hotel (
    HotelID INT PRIMARY KEY,
    Name VARCHAR(100),
    Location VARCHAR(255),
    Rating DECIMAL(2,1),
    RoomsAvailable INT
);

CREATE TABLE Guest (
    GuestID INT PRIMARY KEY,
    Name VARCHAR(100),
    Contact VARCHAR(15),
    Email VARCHAR(100),
    CheckInDate DATE,
    CheckOutDate DATE
);

CREATE TABLE Booking (
    BookingID INT PRIMARY KEY,
    HotelID INT,
    GuestID INT,
    RoomNumber INT,
    BookingDate DATE,
    Status VARCHAR(20),
    FOREIGN KEY (HotelID) REFERENCES Hotel(HotelID),
    FOREIGN KEY (GuestID) REFERENCES Guest(GuestID)
);

-- Insert sample hotels
INSERT INTO Hotel (HotelID, Name, Location, Rating, RoomsAvailable)
VALUES
(1, 'Grand Palace', 'New York', 4.5, 10),
(2, 'Ocean View', 'Miami', 4.8, 5),
(3, 'Mountain Retreat', 'Denver', 4.2, 8),
(4, 'City Lights Hotel', 'Los Angeles', 4.6, 3),
(5, 'Desert Oasis', 'Las Vegas', 4.7, 7);

-- Insert sample guests
INSERT INTO Guest (GuestID, Name, Contact, Email, CheckInDate, CheckOutDate)
VALUES
(1, 'Alice Johnson', '1234567890', 'alice@example.com', '2024-03-10', '2024-03-15'),
(2, 'Bob Smith', '0987654321', 'bob@example.com', '2024-03-12', '2024-03-18'),
(3, 'Charlie Brown', '1122334455', 'charlie@example.com', '2024-03-14', '2024-03-19'),
(4, 'David Wilson', '5566778899', 'david@example.com', '2024-03-16', '2024-03-21'),
(5, 'Emma Davis', '6677889900', 'emma@example.com', '2024-03-18', '2024-03-23');

-- Insert sample bookings
INSERT INTO Booking (BookingID, HotelID, GuestID, RoomNumber, BookingDate, Status)
VALUES
(1, 1, 1, 101, '2024-03-01', 'Confirmed'),
(2, 2, 2, 202, '2024-03-02', 'Confirmed'),
(3, 3, 3, 303, '2024-03-03', 'Checked In'),
(4, 4, 4, 404, '2024-03-04', 'Confirmed'),
(5, 5, 5, 505, '2024-03-05', 'Checked Out'),
(6, 1, 1, 102, '2024-03-06', 'Confirmed');

SELECT * FROM Hotel
WHERE Rating = (SELECT MAX(Rating) FROM Hotel);

SELECT GuestID, COUNT(*) AS BookingCount
FROM Booking
GROUP BY GuestID
HAVING BookingCount > 1;

SELECT RoomsAvailable FROM Hotel
WHERE HotelID = 1;

SELECT HotelID, COUNT(*) AS TotalBookings
FROM Booking
GROUP BY HotelID;

SELECT * FROM Booking
WHERE BookingDate >= CURDATE() - INTERVAL 1 MONTH;

