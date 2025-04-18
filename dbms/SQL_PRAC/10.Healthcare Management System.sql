CREATE DATABASE Healthcare;
USE Healthcare;

CREATE TABLE Patient (
    PatientID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Gender VARCHAR(10),
    Contact VARCHAR(15),
    MedicalHistory TEXT
);

CREATE TABLE Doctor (
    DoctorID INT PRIMARY KEY,
    Name VARCHAR(100),
    Specialization VARCHAR(100),
    Availability VARCHAR(50),
    Contact VARCHAR(15)
);

CREATE TABLE Appointment (
    AppointmentID INT PRIMARY KEY,
    PatientID INT,
    DoctorID INT,
    Date DATE,
    Time TIME,
    Status VARCHAR(20),
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID),
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID)
);

CREATE TABLE Prescription (
    PrescriptionID INT PRIMARY KEY,
    PatientID INT,
    DoctorID INT,
    Medicine VARCHAR(100),
    Dosage VARCHAR(50),
    Instructions TEXT,
    FOREIGN KEY (PatientID) REFERENCES Patient(PatientID),
    FOREIGN KEY (DoctorID) REFERENCES Doctor(DoctorID)
);

-- Inserting sample patients
INSERT INTO Patient (PatientID, Name, Age, Gender, Contact, MedicalHistory)
VALUES
(1, 'John Doe', 35, 'Male', '1234567890', 'Diabetes, Hypertension'),
(2, 'Jane Smith', 29, 'Female', '0987654321', 'Asthma'),
(3, 'Alice Johnson', 42, 'Female', '1122334455', 'Heart Disease');

-- Inserting sample doctors
INSERT INTO Doctor (DoctorID, Name, Specialization, Availability, Contact)
VALUES
(1, 'Dr. Mark Lee', 'Cardiology', 'Mon-Fri 9am-5pm', '5566778899'),
(2, 'Dr. Sara Davis', 'Neurology', 'Mon-Fri 8am-6pm', '6677889900'),
(3, 'Dr. Tom Brown', 'General Medicine', 'Mon-Fri 7am-4pm', '7788990011');

-- Inserting sample appointments
INSERT INTO Appointment (AppointmentID, PatientID, DoctorID, Date, Time, Status)
VALUES
(1, 1, 1, '2024-04-01', '10:00:00', 'Completed'),
(2, 2, 2, '2024-04-02', '11:30:00', 'Pending'),
(3, 3, 3, '2024-04-03', '09:45:00', 'Confirmed'),
(4, 1, 3, '2024-04-05', '14:00:00', 'Confirmed'),
(5, 2, 1, '2024-04-06', '15:30:00', 'Pending');

-- Inserting sample prescriptions
INSERT INTO Prescription (PrescriptionID, PatientID, DoctorID, Medicine, Dosage, Instructions)
VALUES
(1, 1, 1, 'Metformin', '500mg', 'Take after meals twice a day'),
(2, 2, 2, 'Ventolin', '2 puffs', 'Use inhaler every 6 hours if needed'),
(3, 3, 3, 'Atorvastatin', '10mg', 'Take one tablet daily at night'),
(4, 1, 3, 'Aspirin', '75mg', 'Take once daily with water'),
(5, 2, 1, 'Metformin', '500mg', 'Take before breakfast');

SELECT * FROM Appointment
WHERE DoctorID = 1; -- Change the DoctorID as needed

SELECT Medicine, COUNT(*) AS PrescriptionCount
FROM Prescription
GROUP BY Medicine
ORDER BY PrescriptionCount DESC
LIMIT 1;

SELECT PatientID, Name, Age, Gender, Contact, MedicalHistory
FROM Patient;

SELECT DoctorID, COUNT(*) AS AppointmentCount
FROM Appointment
GROUP BY DoctorID
ORDER BY AppointmentCount DESC
LIMIT 1;

SELECT * FROM Appointment
WHERE Date BETWEEN CURDATE() AND CURDATE() + INTERVAL 7 DAY;


