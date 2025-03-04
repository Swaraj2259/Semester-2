
CREATE DATABASE subqueries;
USE subqueries;

CREATE TABLE department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50),
    dept_location VARCHAR(50)
);


CREATE TABLE employee (
    Eid INT PRIMARY KEY,
    Ename VARCHAR(50),
    Esal FLOAT,
    dept_id INT NOT NULL,
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);

INSERT INTO department (dept_id, dept_name, dept_location) VALUES 
(10, "HR", "Mumbai"),
(11, "Fin", "Delhi"),
(12, "MI", "Noida");


INSERT INTO employee (Eid, Ename, Esal, dept_id) VALUES 
(1, "John", 3000.00, 11),
(2, "Doe", 4000.00, 11),
(3, "Lore", 5000.00, 12),
(4, "Ipsum", 4500.00, 12),
(5, "Odor", 3500.00, 12);


#retrive mployees with the minimum salary in each department
SELECT * FROM employee WHERE Esal IN (SELECT MIN(Esal) FROM employee GROUP BY dept_id);


#retrive employee where salary of 
SELECT * FROM employee WHERE Esal =any (SELECT MIN(Esal) FROM employee GROUP BY dept_id);


SELECT * FROM employee WHERE Esal >any (SELECT MIN(Esal) FROM employee GROUP BY dept_id);

SELECT * FROM employee WHERE Esal <any (SELECT MIN(Esal) FROM employee GROUP BY dept_id);

SELECT * FROM employee WHERE Esal >all (SELECT MIN(Esal) FROM employee GROUP BY dept_id);

select Ename, Esal,dept_id from employee e1 where Esal >(select AVG(Esal) from employee e2 where e1.dept_id=e2.dept_id);


CREATE VIEW EmployeeView AS
SELECT Eid, Ename, Esal
FROM employee;

SELECT * FROM EmployeeView;

CREATE OR REPLACE VIEW EmployeeView as select Eid, Ename, Esal,dept_id from employee;


-- DROP VIEW EmployeeView;
