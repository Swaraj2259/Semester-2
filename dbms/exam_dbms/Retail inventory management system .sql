CREATE DATABASE RetailDatabase;
USE RetailDatabase;

CREATE TABLE Supplier (
    SupplierID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Contact VARCHAR(50),
    Address VARCHAR(255)
);

CREATE TABLE Product (
    ProductID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Category VARCHAR(100),
    Price DECIMAL(10,2) CHECK (Price > 0),
    StockQuantity INT CHECK (StockQuantity >= 0),
    SupplierID INT,
    FOREIGN KEY (SupplierID) REFERENCES Supplier(SupplierID) ON DELETE CASCADE
);

CREATE TABLE Sales (
    SaleID INT PRIMARY KEY AUTO_INCREMENT,
    ProductID INT,
    Date DATE,
    Quantity INT CHECK (Quantity > 0),
    TotalPrice DECIMAL(10,2) CHECK (TotalPrice >= 0),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID) ON DELETE CASCADE
);

INSERT INTO Supplier (Name, Contact, Address) VALUES
('ABC Supplier', '1234567890', 'New York, USA'),
('Global Traders', '1234567890', 'Los Angeles, USA'),
('Fresh', '1234567890', 'Chicago, USA');

INSERT INTO Product (Name, Category, Price, StockQuantity, SupplierID) VALUES
('Laptop', 'Electronics', 800.00, 10, 1),
('Smartphone', 'Electronics', 500.00, 4, 1),
('Tablet', 'Electronics', 300.00, 15, 2),
('Washing Machine', 'Appliances', 600.00, 2, 3),
('Microwave', 'Appliances', 150.00, 8, 2);

INSERT INTO Sales (ProductID, Date, Quantity, TotalPrice) VALUES
(1, '2025-03-10', 2, 1600.00),
(2, '2025-03-15', 1, 500.00),
(3, '2025-03-20', 3, 900.00),
(4, '2025-03-25', 1, 600.00),
(5, '2025-03-28', 2, 300.00);

SELECT ProductID, Name, StockQuantity
FROM Product
WHERE StockQuantity < 5;

SELECT p.ProductID, p.Name, SUM(s.Quantity) AS TotalUnitsSold, SUM(s.TotalPrice) AS TotalSales
FROM Product p
JOIN Sales s ON p.ProductID = s.ProductID
GROUP BY p.ProductID, p.Name;



SELECT p.ProductID, p.Name, p.Category, p.Price, p.StockQuantity
FROM Product p
JOIN Supplier s ON p.SupplierID = s.SupplierID
WHERE s.Name = 'Global Traders';

SELECT SaleID, ProductID, Date, Quantity, TotalPrice
FROM Sales
WHERE Date >= DATE_SUB(CURRENT_DATE, INTERVAL 30 DAY);



