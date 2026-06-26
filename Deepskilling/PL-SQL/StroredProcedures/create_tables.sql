CREATE TABLE Accounts
(
    Account_ID NUMBER PRIMARY KEY,
    Customer_Name VARCHAR2(50),
    Balance NUMBER,
    Account_Type VARCHAR2(20)
);

INSERT INTO Accounts VALUES
(101,'Arun',50000,'SAVINGS');

INSERT INTO Accounts VALUES
(102,'Priya',30000,'SAVINGS');

INSERT INTO Accounts VALUES
(103,'Karthik',10000,'CURRENT');


CREATE TABLE Employees
(
    Employee_ID NUMBER PRIMARY KEY,
    Employee_Name VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER
);

INSERT INTO Employees VALUES
(1,'Ravi','IT',50000);

INSERT INTO Employees VALUES
(2,'Meena','HR',40000);

INSERT INTO Employees VALUES
(3,'Arun','IT',60000);

COMMIT;