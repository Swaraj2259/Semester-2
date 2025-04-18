CREATE DATABASE CarRentalSystem;
USE CarRentalSystem;

CREATE TABLE Car (
    CarID INT PRIMARY KEY,
    Model VARCHAR(100),
    Brand VARCHAR(100),
    Year INT,
    PricePerDay DECIMAL(10, 2),
    Status VARCHAR(20)
);

CREATE TABLE Customer (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    LicenseNumber VARCHAR(50) UNIQUE,
    Contact VARCHAR(15),
    Email VARCHAR(100) UNIQUE
);

CREATE TABLE Rental (
    RentalID INT PRIMARY KEY,
    CarID INT,
    CustomerID INT,
    StartDate DATE,
    EndDate DATE,
    TotalCost DECIMAL(10, 2),
    FOREIGN KEY (CarID) REFERENCES Car(CarID),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);

CREATE TABLE Payment (
    PaymentID INT PRIMARY KEY,
    RentalID INT,
    Amount DECIMAL(10, 2),
    Date DATE,
    PaymentMethod VARCHAR(50),
    FOREIGN KEY (RentalID) REFERENCES Rental(RentalID)
);

INSERT INTO Car VALUES 
(1, 'Model X', 'Tesla', 2022, 150.00, 'Available'),
(2, 'Civic', 'Honda', 2020, 50.00, 'Available'),
(3, 'Corolla', 'Toyota', 2019, 40.00, 'Unavailable');

INSERT INTO Customer VALUES 
(1, 'John Doe', 'L12345', '1234567890', 'john@example.com'),
(2, 'Jane Smith', 'L67890', '0987654321', 'jane@example.com'),
(3, 'Alice Johnson', 'L11223', '1122334455', 'alice@example.com');

INSERT INTO Rental VALUES 
(1, 1, 1, '2024-03-01', '2024-03-05', 750.00),
(2, 2, 2, '2024-03-10', '2024-03-15', 250.00),
(3, 2, 2, '2024-03-20', '2024-03-25', 250.00);

INSERT INTO Payment VALUES 
(1, 1, 750.00, '2024-03-01', 'Credit Card'),
(2, 2, 250.00, '2024-03-10', 'Debit Card'),
(3, 3, 250.00, '2024-03-20', 'Cash');

SELECT * FROM Car WHERE Status = 'Available';

SELECT CustomerID, COUNT(*) AS RentalCount 
FROM Rental 
GROUP BY CustomerID 
HAVING COUNT(*) > 2;

SELECT Car.Model, SUM(Rental.TotalCost) AS TotalRevenue
FROM Rental
JOIN Car ON Rental.CarID = Car.CarID
GROUP BY Car.Model;

SELECT * FROM Rental 
WHERE StartDate >= CURDATE() - INTERVAL 1 MONTH;

SELECT * FROM Rental 
WHERE EndDate < CURDATE();

