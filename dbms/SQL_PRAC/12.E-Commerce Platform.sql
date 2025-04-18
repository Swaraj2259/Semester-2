CREATE DATABASE ECommerce;
USE ECommerce;

CREATE TABLE User (
    UserID INT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    RegistrationDate DATE,
    Address TEXT
);

CREATE TABLE Product (
    ProductID INT PRIMARY KEY,
    Name VARCHAR(100),
    Category VARCHAR(50),
    Price DECIMAL(10,2),
    Stock INT
);

CREATE TABLE `Order` (
    OrderID INT PRIMARY KEY,
    UserID INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10,2),
    FOREIGN KEY (UserID) REFERENCES User(UserID)
);

CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    Subtotal DECIMAL(10,2),
    FOREIGN KEY (OrderID) REFERENCES `Order`(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);
-- Inserting sample users
INSERT INTO User (UserID, Name, Email, RegistrationDate, Address)
VALUES
(1, 'John Doe', 'john@example.com', '2023-01-15', '123 Main St'),
(2, 'Jane Smith', 'jane@example.com', '2023-02-20', '456 Oak St'),
(3, 'Alice Johnson', 'alice@example.com', '2023-03-25', '789 Pine St');

-- Inserting sample products
INSERT INTO Product (ProductID, Name, Category, Price, Stock)
VALUES
(1, 'Laptop', 'Electronics', 800.00, 10),
(2, 'Headphones', 'Electronics', 100.00, 5),
(3, 'Desk Chair', 'Furniture', 150.00, 2),
(4, 'Smartphone', 'Electronics', 600.00, 8),
(5, 'Table', 'Furniture', 200.00, 4);

-- Inserting sample orders
INSERT INTO `Order` (OrderID, UserID, OrderDate, TotalAmount)
VALUES
(1, 1, '2024-03-10', 900.00),
(2, 2, '2024-03-15', 600.00),
(3, 1, '2024-03-20', 800.00),
(4, 3, '2024-03-25', 350.00),
(5, 2, '2024-03-28', 200.00);

-- Inserting sample order details
INSERT INTO OrderDetails (OrderDetailID, OrderID, ProductID, Quantity, Subtotal)
VALUES
(1, 1, 1, 1, 800.00),
(2, 1, 2, 1, 100.00),
(3, 2, 4, 1, 600.00),
(4, 3, 1, 1, 800.00),
(5, 4, 3, 1, 150.00),
(6, 4, 2, 2, 200.00),
(7, 5, 5, 1, 200.00);

SELECT ProductID, SUM(Quantity) AS TotalSold, SUM(Subtotal) AS TotalSales
FROM OrderDetails
GROUP BY ProductID;

SELECT Product.Category, SUM(OrderDetails.Quantity) AS TotalSold
FROM OrderDetails
JOIN Product ON OrderDetails.ProductID = Product.ProductID
GROUP BY Product.Category
ORDER BY TotalSold DESC
LIMIT 1;

SELECT UserID, COUNT(*) AS OrderCount
FROM `Order`
GROUP BY UserID
HAVING OrderCount > 5;

SELECT * FROM Product
WHERE Stock < 5;

SELECT * FROM `Order`
WHERE OrderDate >= CURDATE() - INTERVAL 30 DAY;
