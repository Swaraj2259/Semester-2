CREATE DATABASE HospitalManagement;
USE HospitalManagement;

CREATE TABLE Doctor (
    DoctorID INT PRIMARY KEY,
    Name VARCHAR(100),
    Specialization VARCHAR(100),
    Phone VARCHAR(15),
    Email VARCHAR(100) UNIQUE
);

CREATE TABLE Patient (
    PatientID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Phone VARCHAR(15),
    Address TEXT,
    Disease VARCHAR(100)
);

CREATE TABLE Appointment (
    AppointmentID INT PRIMARY KEY,
    PatientID INT,
    DoctorID INT,
    Date DATE,
    Time TIME,
    Status ENUM('Scheduled', 'Completed', 'Cancelled'),
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID) ON DELETE CASCADE,
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID) ON DELETE CASCADE
);

INSERT INTO Doctor VALUES
(1, 'Dr. Smith', 'Cardiology', '9876543210', 'smith@example.com'),
(2, 'Dr. Johnson', 'Dermatology', '9876543220', 'johnson@example.com'),
(3, 'Dr. Adams', 'Orthopedics', '9876543230', 'adams@example.com');

INSERT INTO Patient VALUES
(1, 'John Doe', 45, '9123456789', '123 Main St', 'Heart Disease'),
(2, 'Jane Doe', 30, '9234567890', '456 Oak St', 'Skin Allergy'),
(3, 'Mike Ross', 50, '9345678901', '789 Pine St', 'Arthritis'),
(4, 'Rachel Green', 35, '9456789012', '321 Elm St', 'Heart Disease'),
(5, 'Tom Hardy', 40, '9567890123', '654 Birch St', 'Skin Allergy');

INSERT INTO Appointment VALUES
(1, 1, 1, '2024-03-10', '10:00:00', 'Scheduled'),
(2, 2, 2, '2024-03-11', '11:30:00', 'Completed'),
(3, 3, 3, '2024-03-12', '09:45:00', 'Scheduled'),
(4, 4, 1, '2024-03-13', '14:00:00', 'Scheduled'),
(5, 5, 2, '2024-03-14', '15:30:00', 'Scheduled'),
(6, 1, 1, '2024-03-15', '16:00:00', 'Completed');

SELECT p.PatientID, p.Name, p.Age, p.Phone, p.Disease
FROM Patient p
JOIN Appointment a ON p.PatientID = a.PatientID
JOIN Doctor d ON a.DoctorID = d.DoctorID
WHERE d.Name = 'Dr. Smith';

SELECT d.DoctorID, d.Name, COUNT(a.AppointmentID) AS TotalAppointments
FROM Doctor d
JOIN Appointment a ON d.DoctorID = a.DoctorID
GROUP BY d.DoctorID, d.Name
HAVING COUNT(a.AppointmentID) > 5;

SELECT d.DoctorID, d.Name, COUNT(a.AppointmentID) AS TotalAppointments
FROM Doctor d
LEFT JOIN Appointment a ON d.DoctorID = a.DoctorID
GROUP BY d.DoctorID, d.Name;

SELECT d.DoctorID, d.Name, d.Specialization
FROM Doctor d
LEFT JOIN Appointment a ON d.DoctorID = a.DoctorID
WHERE a.AppointmentID IS NULL;

SELECT Disease, COUNT(*) AS Occurrences
FROM Patient
GROUP BY Disease
ORDER BY Occurrences DESC
LIMIT 1;

SHOW TABLES;
DESC Doctor;
