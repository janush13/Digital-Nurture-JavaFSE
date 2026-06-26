CREATE TABLE CustomerDetails
(
    Customer_ID NUMBER PRIMARY KEY,
    Customer_Name VARCHAR2(50),
    DOB DATE
);


INSERT INTO CustomerDetails VALUES
(1,'Arun',TO_DATE('15-06-1998','DD-MM-YYYY'));

INSERT INTO CustomerDetails VALUES
(2,'Priya',TO_DATE('20-12-2005','DD-MM-YYYY'));

COMMIT;