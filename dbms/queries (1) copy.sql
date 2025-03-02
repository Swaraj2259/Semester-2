-- create database Joinn
-- use joinn

-- #inner Join -- common to both table
CREATE TABLE faculty (
    FID INT PRIMARY KEY,
    F_name VARCHAR(50) NOT NULL,
    F_sub VARCHAR(50)
);

INSERT INTO faculty (FID, F_name, F_sub) VALUES 
(1, 'Anoop', 'Blockchain'),
(2, 'Dev', 'Data Structures'),
(3, 'Laxman', 'Machine Learning'),
(4, 'Ram', 'Operating Systems'),
(5, 'Ted', 'Database Management');

select * from faculty;


CREATE TABLE course (
    CID INT PRIMARY KEY,
    C_name VARCHAR(50) NOT NULL,
    Faculty_ID INT NOT NULL,
    FOREIGN KEY (Faculty_ID) REFERENCES faculty(FID)
);

INSERT INTO course () VALUES
(101, 'Web Development', 1),
(102, 'Data Analytics', 5),
(103, 'Artificial Intelligence', 3),
(104, 'Computer Networks', 4),
(105, 'SQL & Databases', 3);

select * from course;




select F_name,C_name
from faculty
left outer join course
on faculty.FID = course.Faculty_ID;

select F_name, C_name
from faculty
right outer join course
on faculty.FID = course.Faculty_ID;


-- #cross join
-- select F_name, C_name
-- from faculty
-- cross join course
-- on faculty.FID = course.Faculty_ID

-- select * from faculty, course
