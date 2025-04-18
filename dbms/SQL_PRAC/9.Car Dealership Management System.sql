CREATE DATABASE CarDealership;
USE CarDealership;
CREATE TABLE Car (
    CarID INT PRIMARY KEY,
    Brand VARCHAR(50),
    Model VARCHAR(50),
    Year INT,
    Price DECIMAL(10,2),
    Availability BOOLEAN
);

CREATE TABLE Customer (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Phone VARCHAR(15),
    Email VARCHAR(100),
    Address TEXT
);

CREATE TABLE Sale (
    SaleID INT PRIMARY KEY,
    CarID INT,
    CustomerID INT,
    SaleDate DATE,
    SaleAmount DECIMAL(10,2),
    FOREIGN KEY (CarID) REFERENCES Car(CarID),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);

-- Inserting sample cars
INSERT INTO Car (CarID, Brand, Model, Year, Price, Availability)
VALUES
(1, 'Toyota', 'Camry', 2023, 30000.00, TRUE),
(2, 'Honda', 'Civic', 2022, 25000.00, TRUE),
(3, 'Ford', 'Mustang', 2023, 55000.00, FALSE),
(4, 'Tesla', 'Model 3', 2023, 40000.00, TRUE),
(5, 'BMW', 'X5', 2022, 60000.00, FALSE);

-- Inserting sample customers
INSERT INTO Customer (CustomerID, Name, Phone, Email, Address)
VALUES
(1, 'John Doe', '1234567890', 'john@example.com', '123 Main St'),
(2, 'Jane Smith', '0987654321', 'jane@example.com', '456 Oak St'),
(3, 'Alice Johnson', '1122334455', 'alice@example.com', '789 Pine St');

-- Inserting sample sales
INSERT INTO Sale (SaleID, CarID, CustomerID, SaleDate, SaleAmount)
VALUES
(1, 3, 1, '2024-01-15', 55000.00),
(2, 5, 2, '2024-02-10', 60000.00),
(3, 1, 3, '2024-03-20', 30000.00),
(4, 2, 1, '2024-03-25', 25000.00),
(5, 4, 3, '2024-03-28', 40000.00);

SELECT * FROM Car
WHERE Availability = TRUE;

SELECT CustomerID, COUNT(*) AS CarsPurchased
FROM Sale
GROUP BY CustomerID
HAVING COUNT(*) > 1;

SELECT Car.Brand, SUM(Sale.SaleAmount) AS TotalSales
FROM Sale
JOIN Car ON Sale.CarID = Car.CarID
GROUP BY Car.Brand;

SELECT * FROM Sale
WHERE SaleDate >= CURDATE() - INTERVAL 3 MONTH;

SELECT * FROM Sale
ORDER BY SaleAmount DESC
LIMIT 1;


