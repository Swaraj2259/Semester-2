
-- Create the table
CREATE TABLE stu (
  sid INTEGER PRIMARY KEY,
  sname TEXT NOT NULL,
  saddress TEXT NOT NULL,
  fees INTEGER,
  subject VARCHAR(50)
);

-- Insert data into the table
INSERT INTO stu (sid, sname, saddress, fees, subject)
VALUES
(1, 'dwdd', 'navi mumbai', 2000, 'math'),
(2, 'jhon', 'navi mumbai', 400, 'python'),
(3, 'devv', 'navi mumbai', 300, 'english'),
(4, 'yash', 'navi mumbai', NULL, 'csf'),
(5, 'raju', 'navi mumbai', 600, 'java');

-- Select all data from the table
SELECT * FROM stu;

-- UPDATE stu SET saddress = 'pune' WHERE saddress= 'navi mumbai';
-- SELECT * FROM stu;



-- SELECT count(*) FROM stu;
-- SELECT max(fees) FROM stu;
-- SELECT avg(fees) FROM stu;
-- SELECT sum(fees) FROM stu;
-- SELECT min(fees) FROM stu;

-- SELECT * FROM stu
-- WHERE fees=2000 or fees=600;

-- SELECT * FROM stu
-- WHERE NOT fees=2000 

-- SELECT *FROM stu
-- WHERE fees>600;

-- SELECT * FROM stu
-- WHERE fees>=400;

-- SELECT * FROM stu
-- WHERE fees between 400 and 2000;

-- SELECT * FROM stu
-- WHERE fees in (300,400,2000);

-- SELECT * FROM stu WHERE fees is NOT NULL;

-- SELECT * FROM stu WHERE fees is NULL;

-- SELECT * FROM stu limit 2;

SELECT * FROM stu WHERE sname like "_a%";
