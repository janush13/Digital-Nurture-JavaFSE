CREATE OR REPLACE PROCEDURE TransferFunds
(
from_acc NUMBER,
to_acc NUMBER,
amount NUMBER
)

IS

source_balance NUMBER;

BEGIN

SELECT Balance INTO source_balance
FROM Accounts
WHERE Account_ID=from_acc;


IF source_balance >= amount THEN

UPDATE Accounts
SET Balance = Balance - amount
WHERE Account_ID=from_acc;


UPDATE Accounts
SET Balance = Balance + amount
WHERE Account_ID=to_acc;


COMMIT;

DBMS_OUTPUT.PUT_LINE('Transfer Successful');

ELSE

DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

END IF;

END;
/