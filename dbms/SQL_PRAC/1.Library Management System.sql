CREATE DATABASE LibraryDB;
USE LibraryDB;

CREATE TABLE Book (
    BookID INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(255) NOT NULL,
    Author VARCHAR(255),
    ISBN VARCHAR(20) UNIQUE,
    Category VARCHAR(100),
    CopiesAvailable INT CHECK (CopiesAvailable >= 0)
);
CREATE TABLE Member (
    MemberID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Email VARCHAR(255) UNIQUE,
    Phone VARCHAR(15) UNIQUE,
    MembershipType VARCHAR(50)
);
CREATE TABLE Borrow (
    BorrowID INT PRIMARY KEY AUTO_INCREMENT,
    MemberID INT,
    BookID INT,
    BorrowDate DATE,
    ReturnDate DATE,
    Status ENUM('Borrowed', 'Returned'),
    FOREIGN KEY (MemberID) REFERENCES Member(MemberID) ON DELETE CASCADE,
    FOREIGN KEY (BookID) REFERENCES Book(BookID) ON DELETE CASCADE
);

INSERT INTO Book (Title, Author, ISBN, Category, CopiesAvailable) VALUES
('Database Systems', 'C.J. Date', '9780321197849', 'Computer Science', 5),
('Introduction to Algorithms', 'Thomas H. Cormen', '9780262033848', 'Computer Science', 3),
('Operating Systems', 'Andrew S. Tanenbaum', '9780133591620', 'Computer Science', 2);

INSERT INTO Member (Name, Email, Phone, MembershipType) VALUES
('Alice Johnson', 'alice@example.com', '9876543210', 'Gold'),
('Bob Smith', 'bob@example.com', '9123456789', 'Silver'),
('Charlie Brown', 'charlie@example.com', '9234567890', 'Gold');

INSERT INTO Borrow (MemberID, BookID, BorrowDate, ReturnDate, Status) VALUES
(1, 1, '2025-03-01', '2025-03-15', 'Borrowed'),
(2, 1, '2025-02-15', '2025-02-28', 'Returned'),
(3, 2, '2025-03-05', '2025-03-20', 'Borrowed');

SELECT DISTINCT m.MemberID, m.Name, m.Email
FROM Member m
JOIN Borrow b ON m.MemberID = b.MemberID
JOIN Book bk ON b.BookID = bk.BookID
WHERE bk.Title = 'Database Systems';

SELECT m.MemberID, m.Name, COUNT(b.BorrowID) AS BooksBorrowed
FROM Member m
LEFT JOIN Borrow b ON m.MemberID = b.MemberID
GROUP BY m.MemberID, m.Name;

SELECT b.BookID, b.Title, b.Author
FROM Book b
LEFT JOIN Borrow br ON b.BookID = br.BookID AND br.Status = 'Borrowed'
WHERE br.BorrowID IS NULL;

SELECT m.MemberID, m.Name, COUNT(b.BorrowID) AS BorrowCount
FROM Member m
JOIN Borrow b ON m.MemberID = b.MemberID
GROUP BY m.MemberID, m.Name
ORDER BY BorrowCount DESC
LIMIT 1;

SELECT BookID, Title, Author, CopiesAvailable
FROM Book
WHERE CopiesAvailable > 0;


