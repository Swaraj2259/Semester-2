
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

SELECT * FROM stu where subject ='python';

create index idx_subject on stu(subject);

select * from stu where subject ='python';

create unique index 










