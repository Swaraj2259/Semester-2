

CREATE TABLE Faculty (
    FID INT PRIMARY KEY, 
    Faculty_name VARCHAR(50) NOT NULL, 
    Faculty_Subject VARCHAR(50)
);

INSERT INTO Faculty VALUES (1, 'sam', 'c++');
INSERT INTO Faculty VALUES (2, 'Sachin', 'C Programming');
INSERT INTO Faculty VALUES (3, 'Swathi', 'PM');

SELECT * FROM Faculty;

CREATE TABLE Course (
    cid INT PRIMARY KEY, 
    cname VARCHAR(50), 
    faculty_id INT, 
    FOREIGN KEY (faculty_id) REFERENCES Faculty(FID)
);

INSERT INTO Course VALUES (10, 'btech', 1);
INSERT INTO Course VALUES (11, 'BBA', 1);
INSERT INTO Course VALUES (12, 'BCA', 2);
INSERT INTO Course VALUES (13, 'PGDM', 2);
INSERT INTO Course VALUES (14, 'MBA', 3);

SELECT * FROM Course;

SELECT 
    faculty.Faculty_name, 
    faculty.Faculty_Subject, 
    course.cname 
FROM faculty  
INNER JOIN course ON faculty.FID = course.faculty_id;