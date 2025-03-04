CREATE USER 'sam'@'localhost' IDENTIFIED BY '123';
CREATE USER 'prasad'@'localhost' IDENTIFIED BY '143';

ALTER USER 'sam'@'localhost' IDENTIFIED BY '666';

DROP USER 'sam'@'localhost';

SELECT USER FROM mysql.user;


CREATE ROLE 'MANGER_ROLE';

CREATE ROLE 'TEST_ROLE';

DROP ROLE 'TEST_ROLE';

SHOW DATABASES;

GRANT INSERT ON student.* TO prasad@localhost;



SHOW GRANTS FOR 'prasad'@'localhost';

GRANT 'MANGER_ROLE' TO 'prasad'@'localhost';

REVOKE 'MANGER_ROLE' FROM 'prasad'@'localhost';



