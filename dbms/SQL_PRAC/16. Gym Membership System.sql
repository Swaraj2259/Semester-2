CREATE DATABASE GymManagement;
USE GymManagement;

CREATE TABLE Member (
    MemberID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Email VARCHAR(100) UNIQUE,
    Phone VARCHAR(15),
    MembershipType VARCHAR(50),
    JoinDate DATE
);

CREATE TABLE Trainer (
    TrainerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Specialization VARCHAR(100),
    Contact VARCHAR(15),
    Availability VARCHAR(50)
);

CREATE TABLE WorkoutSession (
    SessionID INT PRIMARY KEY,
    TrainerID INT,
    MemberID INT,
    Date DATE,
    Duration INT,
    Type VARCHAR(100),
    FOREIGN KEY (TrainerID) REFERENCES Trainer(TrainerID),
    FOREIGN KEY (MemberID) REFERENCES Member(MemberID)
);

CREATE TABLE Payment (
    PaymentID INT PRIMARY KEY,
    MemberID INT,
    Amount DECIMAL(10,2),
    Date DATE,
    Status VARCHAR(20),
    FOREIGN KEY (MemberID) REFERENCES Member(MemberID)
);

INSERT INTO Member VALUES 
(1, 'John Doe', 25, 'john@example.com', '1234567890', 'Active', '2024-01-15'),
(2, 'Jane Smith', 30, 'jane@example.com', '0987654321', 'Inactive', '2023-09-10'),
(3, 'Alice Johnson', 27, 'alice@example.com', '1122334455', 'Active', '2024-02-01');

INSERT INTO Trainer VALUES 
(1, 'Mike Tyson', 'Weight Training', '5551234567', '9 AM - 5 PM'),
(2, 'Sarah Connor', 'Cardio', '5559876543', '10 AM - 6 PM');

INSERT INTO WorkoutSession VALUES 
(1, 1, 1, '2024-03-01', 60, 'Weight Training'),
(2, 2, 3, '2024-03-02', 45, 'Cardio');

INSERT INTO Payment (MemberID, Amount, Date, Status)
VALUES 
(1, 5000, '2024-03-01', 'Completed'),
(2, 4500, '2024-02-15', 'Pending'),
(3, 6000, '2024-03-05', 'Completed');

SELECT * FROM Member WHERE MembershipType = 'Active';
SELECT * FROM Trainer WHERE Specialization = 'Weight Training';
SELECT SUM(Amount) AS TotalRevenue FROM Payment WHERE Status = 'Completed';

SELECT * FROM Member 
WHERE MemberID NOT IN (
    SELECT DISTINCT MemberID FROM WorkoutSession 
    WHERE Date >= CURDATE() - INTERVAL 30 DAY
);

SELECT Type, COUNT(*) AS Frequency 
FROM WorkoutSession 
GROUP BY Type 
ORDER BY Frequency DESC 
LIMIT 1;


