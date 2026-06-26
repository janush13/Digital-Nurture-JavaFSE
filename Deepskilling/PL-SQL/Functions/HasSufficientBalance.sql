CREATE OR REPLACE FUNCTION HasSufficientBalance
(
    acc_id NUMBER,
    amount NUMBER
)

RETURN BOOLEAN
IS

    bal NUMBER;

BEGIN

    SELECT Balance
    INTO bal
    FROM Accounts
    WHERE Account_ID = acc_id;


    IF bal >= amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;


END;
/