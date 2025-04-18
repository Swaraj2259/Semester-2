CREATE DATABASE OnlineLearning;
USE OnlineLearning;

CREATE TABLE Instructor (
    InstructorID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    ExperienceYears INT
);

CREATE TABLE Course (
    CourseID INT PRIMARY KEY,
    Title VARCHAR(100),
    InstructorID INT,
    Duration INT,  -- Duration in weeks
    Category VARCHAR(50),
    FOREIGN KEY (InstructorID) REFERENCES Instructor(InstructorID)
);

CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    EnrolledDate DATE
);

CREATE TABLE Enrollment (
    EnrollmentID INT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    Status VARCHAR(20),
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)
);

-- Insert sample instructors
INSERT INTO Instructor (InstructorID, Name, Email, ExperienceYears)
VALUES
(1, 'John Doe', 'john@example.com', 10),
(2, 'Jane Smith', 'jane@example.com', 8),
(3, 'Alice Johnson', 'alice@example.com', 5);

-- Insert sample courses
INSERT INTO Course (CourseID, Title, InstructorID, Duration, Category)
VALUES
(1, 'Python Programming', 1, 10, 'Programming'),
(2, 'Data Science Basics', 2, 12, 'Data Science'),
(3, 'Web Development', 3, 8, 'Development'),
(4, 'Cybersecurity Essentials', 1, 6, 'Security'),
(5, 'AI and Machine Learning', 2, 14, 'AI');

-- Insert sample students
INSERT INTO Student (StudentID, Name, Email, EnrolledDate)
VALUES
(1, 'Emily Brown', 'emily@example.com', '2024-01-15'),
(2, 'Michael Wilson', 'michael@example.com', '2024-02-10'),
(3, 'Sarah Johnson', 'sarah@example.com', '2024-03-05'),
(4, 'David Lee', 'david@example.com', '2024-01-20'),
(5, 'Emma Davis', 'emma@example.com', '2024-03-25');

-- Insert sample enrollments
INSERT INTO Enrollment (EnrollmentID, StudentID, CourseID, Status)
VALUES
(1, 1, 1, 'Active'),
(2, 2, 2, 'Active'),
(3, 3, 3, 'Active'),
(4, 4, 1, 'Completed'),
(5, 5, 2, 'Active'),
(6, 1, 3, 'Active'),
(7, 2, 3, 'Active'),
(8, 5, 5, 'Active');

DESC Enrollment;
DESC Course;

SELECT c.CourseID, c.Title, COUNT(e.EnrollmentID) AS TotalEnrollments
FROM Enrollment e
JOIN Course c ON e.CourseID = c.CourseID
GROUP BY c.CourseID, c.Title
ORDER BY TotalEnrollments DESC
LIMIT 1;

SELECT c.InstructorID, i.Name, COUNT(e.StudentID) AS TotalStudents
FROM Course c
JOIN Instructor i ON c.InstructorID = i.InstructorID
JOIN Enrollment e ON c.CourseID = e.CourseID
GROUP BY c.InstructorID, i.Name
ORDER BY TotalStudents DESC
LIMIT 1;

SELECT e.StudentID, s.Name, COUNT(e.CourseID) AS TotalCourses
FROM Enrollment e
JOIN Student s ON e.StudentID = s.StudentID
GROUP BY e.StudentID, s.Name
HAVING TotalCourses > 1
LIMIT 2000;

SELECT CourseID, Title
FROM Course
WHERE CourseID NOT IN (SELECT DISTINCT CourseID FROM Enrollment);

SELECT * FROM Student
WHERE EnrolledDate >= CURDATE() - INTERVAL 3 MONTH;





