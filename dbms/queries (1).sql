
-- Create the table
-- Create the employee table
CREATE TABLE employee (
  eid INTEGER PRIMARY KEY,        
  ename TEXT NOT NULL,            
  eaddress TEXT NOT NULL,         
  salary INTEGER,                 
  dept VARCHAR(50)                
);

INSERT INTO employee (eid, ename, eaddress, salary, dept)
VALUES
(1, 'Aman', 'Pune', 80000, 'HR'),
(2, 'John', 'Delhi', 50000, 'Finance'),
(3, 'Priya', 'Mumbai', 60000, 'IT'),
(4, 'Ravi', 'Chennai', NULL, 'Marketing'),
(5, 'Sneha', 'Kolkata', 70000, 'Operations');

-- Select all data from the employee table
SELECT * FROM employee;

-- q1
SELECT MAX(salary) FROM employee;
-- q2
SELECT AVG(salary) FROM employee;
-- q3
SELECT SUM(salary) FROM employee;
-- q4
SELECT MIN(salary) FROM employee;
-- q5
SELECT * FROM employee
WHERE salary BETWEEN 50000 AND 80000;
-- q6
SELECT * FROM employee
WHERE salary = 80000 OR salary <70000;
-- q7
SELECT * FROM employee
WHERE ename LIKE '_n%';

-- q8
SELECT * FROM employee
WHERE salary IS NOT NULL;
-- q9
SELECT * FROM employee
WHERE salary IS NULL;
-- q10
SELECT * FROM employee
WHERE ename LIKE '____a%';