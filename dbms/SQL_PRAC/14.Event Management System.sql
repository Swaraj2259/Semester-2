CREATE DATABASE EventManagement;
USE EventManagement;

CREATE TABLE Organizer (
    OrganizerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Contact VARCHAR(15),
    Email VARCHAR(100)
);

CREATE TABLE Event (
    EventID INT PRIMARY KEY,
    Name VARCHAR(100),
    Date DATE,
    Location VARCHAR(255),
    Capacity INT,
    OrganizerID INT,
    FOREIGN KEY (OrganizerID) REFERENCES Organizer(OrganizerID)
);

CREATE TABLE Attendee (
    AttendeeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    Phone VARCHAR(15),
    EventID INT,
    FOREIGN KEY (EventID) REFERENCES Event(EventID)
);

-- Insert sample organizers
INSERT INTO Organizer (OrganizerID, Name, Contact, Email)
VALUES
(1, 'John Doe', '1234567890', 'john@example.com'),
(2, 'Jane Smith', '0987654321', 'jane@example.com'),
(3, 'Alice Johnson', '1122334455', 'alice@example.com');

-- Insert sample events
INSERT INTO Event (EventID, Name, Date, Location, Capacity, OrganizerID)
VALUES
(1, 'Tech Conference', '2024-05-15', 'New York', 200, 1),
(2, 'Music Fest', '2024-04-20', 'Los Angeles', 500, 2),
(3, 'Startup Meetup', '2024-06-10', 'San Francisco', 150, 1),
(4, 'Art Exhibition', '2024-04-05', 'Miami', 300, 3),
(5, 'Business Summit', '2024-07-22', 'Chicago', 250, 2);

-- Insert sample attendees
INSERT INTO Attendee (AttendeeID, Name, Email, Phone, EventID)
VALUES
(1, 'Emily Brown', 'emily@example.com', '1112223333', 1),
(2, 'Michael Wilson', 'michael@example.com', '4445556666', 2),
(3, 'Sarah Johnson', 'sarah@example.com', '7778889999', 3),
(4, 'David Lee', 'david@example.com', '0001112222', 1),
(5, 'Emma Davis', 'emma@example.com', '3334445555', 2),
(6, 'Chris Martin', 'chris@example.com', '6667778888', 2);

SELECT * FROM Event
WHERE Date >= CURDATE();

SELECT EventID, COUNT(*) AS TotalAttendees
FROM Attendee
GROUP BY EventID
ORDER BY TotalAttendees DESC
LIMIT 1;

SELECT OrganizerID, COUNT(*) AS TotalEvents
FROM Event
GROUP BY OrganizerID
HAVING TotalEvents > 3;

SELECT * FROM Attendee
WHERE EventID = 1;

SELECT e.EventID, e.Name, e.Capacity - IFNULL(a.AttendeeCount, 0) AS AvailableSeats
FROM Event e
LEFT JOIN (
    SELECT EventID, COUNT(*) AS AttendeeCount
    FROM Attendee
    GROUP BY EventID
) a ON e.EventID = a.EventID
WHERE e.Capacity > IFNULL(a.AttendeeCount, 0);
