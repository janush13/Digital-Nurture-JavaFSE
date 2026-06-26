CREATE TABLE Customers
(
    Customer_ID NUMBER PRIMARY KEY,
    Customer_Name VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(10)
);


CREATE TABLE Loans
(
    Loan_ID NUMBER PRIMARY KEY,
    Customer_ID NUMBER,
    Interest_Rate NUMBER,
    Due_Date DATE,

    FOREIGN KEY(Customer_ID)
    REFERENCES Customers(Customer_ID)
);