

-- CREATE TABLE lms (
--   bookid INTEGER PRIMARY KEY,
--   title TEXT NOT NULL,
--   author TEXT NOT NULL,
--   publish_year INTEGER
-- );

-- INSERT INTO lms VALUES (1, 'dscf', 'erwe', 23);
-- INSERT INTO lms VALUES (2, 'dswecf', 'erweds', 24);

-- SELECT * FROM lms;

-- CREATE TABLE employee (
--   eid INTEGER ,
--   ename TEXT NOT NULL,
--   eaddress TEXT NOT NULL,
--   esal INTEGER,
--   department VARCHAR(50)
-- );


-- INSERT INTO employee (eid, ename, eaddress, esal, department)
-- VALUES
-- (1, 'yash', 'navi mumbai', 25000, 'development'),
-- (2, 'kunal', ' mumbai', NULL, 'frontend'),
-- (3, 'araman', 'nashik', 30000, 'backend'),
-- (4, 'shiv', 'pune', 7500, 'data scientista'),
-- (5, 'raju', 'delhi', 60000, 'HR');


-- SELECT * FROM employee;

-- CREATE TABLE employee(
-- empid INTEGER,
-- name TEXT,
-- salary double,
-- depid INTEGER
-- );

-- INSERT INTO employee (empid, name, salary, depid) VALUES
-- (101, 'John', 3000.00, 1),
-- (102, 'Alice', 3500.00, 2),
-- (103, 'Bob', 4000.00, 1),
-- (104, 'Emma', 4500.00, 3),
-- (105, 'David', 5000.00, 2);

-- SELECT* FROM employee; 


-- update employee set salary = 60000.0 where empid=101; 

-- SELECT* FROM employee

-- DELETE FROM employee WHERE depid = 2;

-- SELECT * FROM employee;


-- CREATE TABLE employee (
--   empid INTEGER PRIMARY KEY, 
--   name TEXT NOT NULL, 
--   salary DOUBLE CHECK (salary >= 1000), 
--   depid INTEGER
-- );


-- INSERT INTO employee (empid, name, salary, depid) VALUES
-- (101, 'John', 3000.00, 1),
-- (102, 'Alice', 3500.00, 2),
-- (103, 'Bob', 4000.00, 1),
-- (104, 'Emma', 4500.00, 3),
-- (105, 'David', 5000.00, 2);

-- -- INSERT INTO employee (empid, name, salary, depid) VALUES
-- -- (106, 'Mike', 800, 3);

-- SELECT * FROM employee;

-- Create the department table
-- Create the employee table
CREATE TABLE employee (
    empid INTEGER PRIMARY KEY, 
    name TEXT NOT NULL, 
    salary DOUBLE CHECK (salary >= 1000),  -- Ensures salary is at least 1000
    depid INTEGER,
    FOREIGN KEY (depid) REFERENCES department(depid)
);

-- Insert sample employee data
INSERT INTO employee (empid, name, salary, depid) VALUES
(101, 'John', 3000.00, 1),
(102, 'Alice', 3500.00, 2),
(103, 'Bob', 4000.00, 1),
(104, 'Emma', 4500.00, 3),
(105, 'David', 5000.00, 2);

SELECT 
    e.empid, 
    e.name, 
    e.salary, 
    d.depid, 
    d.dept_name 
FROM employee e
INNER JOIN department d ON e.depid = d.depid;











