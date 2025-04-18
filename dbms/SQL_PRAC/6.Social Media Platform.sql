CREATE DATABASE SocialMediaDB;
USE SocialMediaDB;
CREATE TABLE Users (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Email VARCHAR(255) UNIQUE NOT NULL,
    DateJoined TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Status ENUM('Active', 'Inactive', 'Banned') DEFAULT 'Active'
);

CREATE TABLE Posts (
    PostID INT PRIMARY KEY AUTO_INCREMENT,
    UserID INT,
    Content TEXT NOT NULL,
    PostDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Likes INT DEFAULT 0,
    Shares INT DEFAULT 0,
    FOREIGN KEY (UserID) REFERENCES Users(UserID) ON DELETE CASCADE
);

CREATE TABLE Comments (
    CommentID INT PRIMARY KEY AUTO_INCREMENT,
    PostID INT,
    UserID INT,
    Content TEXT NOT NULL,
    CommentDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (PostID) REFERENCES Posts(PostID) ON DELETE CASCADE,
    FOREIGN KEY (UserID) REFERENCES Users(UserID) ON DELETE CASCADE
);

INSERT INTO Users (Name, Email, Status) VALUES
('Alice Johnson', 'alice@email.com', 'Active'),
('Bob Smith', 'bob@email.com', 'Active'),
('Charlie Brown', 'charlie@email.com', 'Inactive');


INSERT INTO Posts (UserID, Content, Likes, Shares) VALUES
(1, 'Hello, world! My first post.', 150, 10),
(2, 'This is a tech blog post.', 90, 20),
(3, 'Good morning everyone!', 50, 5),
(1, 'Check out my new artwork!', 200, 30);

INSERT INTO Comments (PostID, UserID, Content) VALUES
(1, 2, 'Nice post!'),
(1, 3, 'Welcome to the platform!'),
(2, 1, 'Very informative! Thanks!'),
(4, 2, 'Wow! That looks amazing!');

SELECT PostID, Content, Likes 
FROM Posts 
ORDER BY Likes DESC 
LIMIT 1;

SELECT U.UserID, U.Name, COUNT(P.PostID) AS TotalPosts
FROM Users U
JOIN Posts P ON U.UserID = P.UserID
WHERE P.PostDate >= NOW() - INTERVAL 1 MONTH
GROUP BY U.UserID
ORDER BY TotalPosts DESC
LIMIT 1;

SELECT C.CommentID, U.Name, C.Content, C.CommentDate
FROM Comments C
JOIN Users U ON C.UserID = U.UserID
WHERE C.PostID = 1;  -- Change 1 to any specific PostID

SELECT U.UserID, U.Name, SUM(P.Shares) AS TotalShares
FROM Users U
JOIN Posts P ON U.UserID = P.UserID
GROUP BY U.UserID
ORDER BY TotalShares DESC
LIMIT 1;

SELECT PostID, Content, Likes 
FROM Posts 
WHERE Likes > 100;

SHOW TABLES;
