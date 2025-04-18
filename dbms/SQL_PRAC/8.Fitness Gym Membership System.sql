CREATE DATABASE FitnessGym;
USE FitnessGym;
CREATE TABLE Member (
    MemberID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    Phone VARCHAR(15),
    MembershipType VARCHAR(50),
    JoinDate DATE
);

CREATE TABLE Trainer (
    TrainerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Specialization VARCHAR(100),
    Availability VARCHAR(50),
    Contact VARCHAR(15)
);

CREATE TABLE WorkoutSession (
    SessionID INT PRIMARY KEY,
    MemberID INT,
    TrainerID INT,
    Date DATE,
    Duration INT,
    Type VARCHAR(50),
    FOREIGN KEY (MemberID) REFERENCES Member(MemberID),
    FOREIGN KEY (TrainerID) REFERENCES Trainer(TrainerID)
);

-- Inserting sample members
INSERT INTO Member (MemberID, Name, Email, Phone, MembershipType, JoinDate)
VALUES
(1, 'John Doe', 'john@example.com', '1234567890', 'Gold', '2024-09-10'),
(2, 'Jane Smith', 'jane@example.com', '0987654321', 'Silver', '2024-11-15'),
(3, 'Alice Johnson', 'alice@example.com', '1122334455', 'Platinum', '2024-02-01');

-- Inserting sample trainers
INSERT INTO Trainer (TrainerID, Name, Specialization, Availability, Contact)
VALUES
(1, 'Mark Lee', 'Strength Training', 'Mon-Fri 9am-5pm', '5566778899'),
(2, 'Sara Davis', 'Cardio', 'Mon-Fri 8am-6pm', '6677889900'),
(3, 'Tom Brown', 'Yoga', 'Mon-Fri 7am-4pm', '7788990011');

-- Inserting sample workout sessions
INSERT INTO WorkoutSession (SessionID, MemberID, TrainerID, Date, Duration, Type)
VALUES
(1, 1, 1, '2024-09-15', 60, 'Strength Training'),
(2, 1, 2, '2024-09-18', 45, 'Cardio'),
(3, 2, 3, '2024-11-20', 30, 'Yoga'),
(4, 3, 1, '2024-02-10', 75, 'Strength Training'),
(5, 3, 2, '2024-02-12', 50, 'Cardio');

SELECT * FROM Member
WHERE JoinDate >= CURDATE() - INTERVAL 6 MONTH;

SELECT TrainerID, COUNT(*) AS SessionCount
FROM WorkoutSession
WHERE Date >= CURDATE() - INTERVAL 7 DAY
GROUP BY TrainerID
HAVING COUNT(*) > 5;

SELECT Type, COUNT(*) AS SessionCount
FROM WorkoutSession
GROUP BY Type
ORDER BY SessionCount DESC
LIMIT 1;

SELECT MemberID, COUNT(*) AS SessionCount
FROM WorkoutSession
GROUP BY MemberID
ORDER BY SessionCount DESC
LIMIT 1;

SELECT * FROM Trainer
WHERE Specialization = 'Strength Training';



