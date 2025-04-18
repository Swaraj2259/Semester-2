CREATE DATABASE InventoryManagement;
USE InventoryManagement;

CREATE TABLE Supplier (
    SupplierID INT PRIMARY KEY,
    Name VARCHAR(100),
    Contact VARCHAR(20),
    Email VARCHAR(100),
    Location VARCHAR(100)
);

CREATE TABLE Product (
    ProductID INT PRIMARY KEY,
    Name VARCHAR(100),
    Category VARCHAR(50),
    StockQuantity INT,
    Price DECIMAL(10,2),
    SupplierID INT,
    FOREIGN KEY (SupplierID) REFERENCES Supplier(SupplierID) ON DELETE CASCADE
);

CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Role VARCHAR(50),
    Contact VARCHAR(20),
    Email VARCHAR(100)
);

CREATE TABLE InventoryTransaction (
    TransactionID INT PRIMARY KEY,
    ProductID INT,
    Type ENUM('IN', 'OUT'),
    Quantity INT,
    Date DATE,
    EmployeeID INT,
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID) ON DELETE CASCADE,
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID) ON DELETE CASCADE
);

INSERT INTO Supplier VALUES
(1, 'Tech Supplies Co.', '1234567890', 'techsupplies@example.com', 'Mumbai'),
(2, 'FreshFarms Ltd.', '9876543210', 'freshfarms@example.com', 'Pune');

INSERT INTO Product VALUES
(1, 'Laptop', 'Electronics', 15, 55000.00, 1),
(2, 'Mouse', 'Electronics', 5, 1200.00, 1),
(3, 'Apple', 'Fruits', 50, 100.00, 2),
(4, 'Keyboard', 'Electronics', 8, 2500.00, 1);

INSERT INTO Employee VALUES
(1, 'Amit Sharma', 'Manager', '9998887776', 'amit@example.com'),
(2, 'Neha Singh', 'Cashier', '8887776665', 'neha@example.com');

INSERT INTO InventoryTransaction VALUES
(1, 1, 'IN', 10, '2024-03-01', 1),
(2, 2, 'OUT', 3, '2024-03-02', 2),
(3, 3, 'IN', 20, '2024-03-05', 1),
(4, 4, 'OUT', 2, '2024-03-10', 2);

SELECT * FROM Product WHERE StockQuantity < 10;

SELECT DISTINCT s.SupplierID, s.Name, s.Contact, s.Email, s.Location
FROM Supplier s
JOIN Product p ON s.SupplierID = p.SupplierID
WHERE p.Category = 'Electronics';

SELECT Category, SUM(StockQuantity) AS TotalStock
FROM Product
GROUP BY Category;

SELECT * FROM InventoryTransaction 
WHERE Date >= CURDATE() - INTERVAL 30 DAY;

SELECT it.EmployeeID, e.Name, COUNT(*) AS TransactionsProcessed 
FROM InventoryTransaction it
JOIN Employee e ON it.EmployeeID = e.EmployeeID
GROUP BY it.EmployeeID, e.Name
HAVING COUNT(*) > 50
LIMIT 2000;

