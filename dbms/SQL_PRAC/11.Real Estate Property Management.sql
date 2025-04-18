CREATE DATABASE RealEstate;
USE RealEstate;

CREATE TABLE Property (
    PropertyID INT PRIMARY KEY,
    Address VARCHAR(255),
    Type VARCHAR(50),
    Price DECIMAL(10,2),
    Availability BOOLEAN
);

CREATE TABLE Owner (
    OwnerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Contact VARCHAR(15),
    Email VARCHAR(100)
);

CREATE TABLE Tenant (
    TenantID INT PRIMARY KEY,
    Name VARCHAR(100),
    Contact VARCHAR(15),
    Email VARCHAR(100),
    LeaseStart DATE,
    LeaseEnd DATE
);

CREATE TABLE RentalAgreement (
    AgreementID INT PRIMARY KEY,
    PropertyID INT,
    TenantID INT,
    RentAmount DECIMAL(10,2),
    Duration INT,
    Status VARCHAR(20),
    FOREIGN KEY (PropertyID) REFERENCES Property(PropertyID),
    FOREIGN KEY (TenantID) REFERENCES Tenant(TenantID)
);

-- Inserting sample properties
INSERT INTO Property (PropertyID, Address, Type, Price, Availability)
VALUES
(1, '123 Main St, NY', 'Apartment', 1500.00, TRUE),
(2, '456 Oak St, CA', 'Villa', 3000.00, FALSE),
(3, '789 Pine St, TX', 'Townhouse', 2000.00, TRUE),
(4, '101 Maple St, FL', 'Apartment', 1800.00, FALSE),
(5, '202 Birch St, IL', 'Condo', 2500.00, TRUE);

-- Inserting sample owners
INSERT INTO Owner (OwnerID, Name, Contact, Email)
VALUES
(1, 'John Doe', '1234567890', 'john@example.com'),
(2, 'Jane Smith', '0987654321', 'jane@example.com'),
(3, 'Alice Johnson', '1122334455', 'alice@example.com');

-- Inserting sample tenants
INSERT INTO Tenant (TenantID, Name, Contact, Email, LeaseStart, LeaseEnd)
VALUES
(1, 'Michael Brown', '3344556677', 'michael@example.com', '2023-06-01', '2024-06-01'),
(2, 'Sarah Miller', '2233445566', 'sarah@example.com', '2023-07-15', '2024-07-15'),
(3, 'David Wilson', '9988776655', 'david@example.com', '2023-05-10', '2024-05-10'),
(4, 'Emma Davis', '5566778899', 'emma@example.com', '2023-08-20', '2024-08-20');

-- Inserting sample rental agreements
INSERT INTO RentalAgreement (AgreementID, PropertyID, TenantID, RentAmount, Duration, Status)
VALUES
(1, 2, 1, 3000.00, 12, 'Active'),
(2, 4, 2, 1800.00, 12, 'Active'),
(3, 3, 3, 2000.00, 12, 'Active'),
(4, 5, 4, 2500.00, 12, 'Active');

SELECT * FROM Property
WHERE Availability = TRUE;

SELECT * FROM Tenant
WHERE LeaseEnd BETWEEN CURDATE() AND CURDATE() + INTERVAL 1 MONTH;

SELECT Type, MAX(Price) AS HighestPrice
FROM Property
GROUP BY Type;

SELECT OwnerID, COUNT(*) AS PropertyCount
FROM Property
GROUP BY OwnerID
HAVING COUNT(*) > 3;

SELECT Property.Type, COUNT(*) AS RentalCount
FROM RentalAgreement
JOIN Property ON RentalAgreement.PropertyID = Property.PropertyID
GROUP BY Property.Type
ORDER BY RentalCount DESC
LIMIT 1;



