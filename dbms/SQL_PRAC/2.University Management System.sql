CREATE DATABASE UniversityDB;
USE UniversityDB;

CREATE TABLE Student (
    StudentID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Age INT CHECK (Age >= 17),  
    Email VARCHAR(255) UNIQUE,
    Phone VARCHAR(15) UNIQUE,
    Major VARCHAR(100)
);

CREATE TABLE Instructor (
    InstructorID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Department VARCHAR(100),
    Email VARCHAR(255) UNIQUE,
    Phone VARCHAR(15) UNIQUE
);

CREATE TABLE Course (
    CourseID INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(255) NOT NULL,
    Credits INT CHECK (Credits > 0),
    InstructorID INT,
    FOREIGN KEY (InstructorID) REFERENCES Instructor(InstructorID) ON DELETE SET NULL
);

CREATE TABLE Enrollment (
    EnrollmentID INT PRIMARY KEY AUTO_INCREMENT,
    StudentID INT,
    CourseID INT,
    Grade CHAR(2),  
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID) ON DELETE CASCADE,
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID) ON DELETE CASCADE
);

INSERT INTO Student (Name, Age, Email, Phone, Major) VALUES
('Alice Johnson', 20, 'alice@example.com', '9876543210', 'Computer Science'),
('Bob Smith', 22, 'bob@example.com', '9123456789', 'Information Technology'),
('Charlie Brown', 21, 'charlie@example.com', '9234567890', 'Data Science'),
('David Lee', 23, 'david@example.com', '9012345678', 'Cyber Security');

INSERT INTO Instructor (Name, Department, Email, Phone) VALUES
('Dr. John Doe', 'Computer Science', 'john.doe@example.com', '9876512345'),
('Dr. Jane Smith', 'Information Technology', 'jane.smith@example.com', '9123412345');

INSERT INTO Course (Title, Credits, InstructorID) VALUES
('Database Management Systems', 3, 1),
('Data Structures', 4, 1),
('Operating Systems', 3, 2),
('Machine Learning', 3, 2);

INSERT INTO Enrollment (StudentID, CourseID, Grade) VALUES
(1, 1, 'B'),
(2, 1, 'A'),
(3, 2, 'C'),
(4, 3, 'F'),
(1, 3, 'A');

SELECT s.StudentID, s.Name, s.Email
FROM Student s
JOIN Enrollment e ON s.StudentID = e.StudentID
JOIN Course c ON e.CourseID = c.CourseID
WHERE c.Title = 'Database Management Systems';

SELECT i.InstructorID, i.Name, COUNT(c.CourseID) AS CourseCount
FROM Instructor i
JOIN Course c ON i.InstructorID = c.InstructorID
GROUP BY i.InstructorID, i.Name
HAVING CourseCount > 2;

SELECT DISTINCT s.StudentID, s.Name, s.Email
FROM Student s
JOIN Enrollment e ON s.StudentID = e.StudentID
WHERE e.Grade = 'F';

SELECT c.CourseID, c.Title, COUNT(e.StudentID) AS TotalStudents
FROM Course c
LEFT JOIN Enrollment e ON c.CourseID = e.CourseID
GROUP BY c.CourseID, c.Title;

SELECT s.StudentID, s.Name, s.Email
FROM Student s
LEFT JOIN Enrollment e ON s.StudentID = e.StudentID
WHERE e.EnrollmentID IS NULL;
