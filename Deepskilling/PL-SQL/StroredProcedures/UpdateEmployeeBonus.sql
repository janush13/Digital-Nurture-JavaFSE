CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
dept_name VARCHAR2,
bonus_percent NUMBER
)
IS

BEGIN

UPDATE Employees
SET Salary = Salary + (Salary*bonus_percent/100)
WHERE Department = dept_name;

COMMIT;

DBMS_OUTPUT.PUT_LINE('Bonus updated');

END;
/