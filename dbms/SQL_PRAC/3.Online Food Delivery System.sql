CREATE DATABASE FoodDeliveryDB;
USE FoodDeliveryDB;

CREATE TABLE Restaurant (
    RestaurantID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Location VARCHAR(255),
    Rating DECIMAL(3,1) CHECK (Rating >= 0 AND Rating <= 5)
);

CREATE TABLE Customer (
    CustomerID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Phone VARCHAR(15) UNIQUE,
    Address VARCHAR(255)
);

CREATE TABLE FoodItem (
    FoodID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Price DECIMAL(8,2) CHECK (Price > 0),
    RestaurantID INT,
    FOREIGN KEY (RestaurantID) REFERENCES Restaurant(RestaurantID) ON DELETE CASCADE
);

CREATE TABLE `Order` (
    OrderID INT PRIMARY KEY AUTO_INCREMENT,
    CustomerID INT,
    OrderDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    TotalAmount DECIMAL(10,2) CHECK (TotalAmount >= 0),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID) ON DELETE CASCADE
);

CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY AUTO_INCREMENT,
    OrderID INT,
    FoodID INT,
    Quantity INT CHECK (Quantity > 0),
    Subtotal DECIMAL(10,2) CHECK (Subtotal >= 0),
    FOREIGN KEY (OrderID) REFERENCES `Order`(OrderID) ON DELETE CASCADE,
    FOREIGN KEY (FoodID) REFERENCES FoodItem(FoodID) ON DELETE CASCADE
);

INSERT INTO Restaurant (Name, Location, Rating) VALUES
('Spicy Bites', 'New York', 4.5),
('Gourmet Delight', 'Los Angeles', 4.8),
('Food Haven', 'Chicago', 4.2);

INSERT INTO Customer (Name, Phone, Address) VALUES
('Alice Johnson', '9876543210', '123 Main St, NY'),
('Bob Smith', '9123456789', '456 Elm St, LA'),
('Charlie Brown', '9234567890', '789 Oak St, Chicago');

INSERT INTO FoodItem (Name, Price, RestaurantID) VALUES
('Burger', 8.99, 1),
('Pizza', 12.99, 2),
('Pasta', 10.49, 3),
('Sushi', 15.99, 1);

INSERT INTO `Order` (CustomerID, OrderDate, TotalAmount) VALUES
(1, '2025-03-25 12:30:00', 21.98),
(2, '2025-03-28 18:45:00', 12.99),
(3, '2025-03-29 14:15:00', 26.48);

INSERT INTO OrderDetails (OrderID, FoodID, Quantity, Subtotal) VALUES
(1, 1, 2, 17.98),
(1, 3, 1, 10.49),
(2, 2, 1, 12.99),
(3, 4, 2, 31.98);

SELECT c.CustomerID, c.Name, COUNT(o.OrderID) AS TotalOrders
FROM Customer c
LEFT JOIN `Order` o ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerID, c.Name;

SELECT f.FoodID, f.Name, SUM(od.Quantity) AS TotalOrdered
FROM FoodItem f
JOIN OrderDetails od ON f.FoodID = od.FoodID
GROUP BY f.FoodID, f.Name
ORDER BY TotalOrdered DESC
LIMIT 1;

SELECT RestaurantID, Name, Rating
FROM Restaurant
ORDER BY Rating DESC
LIMIT 1;

SELECT r.RestaurantID, r.Name, SUM(od.Subtotal) AS TotalSales
FROM Restaurant r
JOIN FoodItem f ON r.RestaurantID = f.RestaurantID
JOIN OrderDetails od ON f.FoodID = od.FoodID
GROUP BY r.RestaurantID, r.Name;

SELECT o.OrderID, c.Name AS CustomerName, o.OrderDate, o.TotalAmount
FROM `Order` o
JOIN Customer c ON o.CustomerID = c.CustomerID
WHERE o.OrderDate >= DATE_SUB(CURRENT_DATE, INTERVAL 7 DAY);

