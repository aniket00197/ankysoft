-- USERINFO TABLE
ALTER TABLE USERINFO
DROP CONSTRAINT userinfo_pk
DROP CONSTRAINT username_unique
DROP CONSTRAINT emailid_unique
DROP CONSTRAINT phonenumber_unique

DROP TABLE USERINFO

SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME ='USERINFO'

CREATE TABLE USERINFO
  (
    USERID          INT PRIMARY KEY,
    USERNAME    VARCHAR(250) NOT NULL,
    PASSWORD    VARCHAR(250) NOT NULL,
    FIRSTNAME   VARCHAR(250) NOT NULL,
    LASTNAME    VARCHAR(250) NOT NULL,
    EMAILID     VARCHAR(250) NOT NULL,
    PHONENUMBER NUMERIC(15),
    ISACTIVE    INT DEFAULT 1 NOT NULL,
    CREATEDDATE DATE,
    UPDATEDDATE DATE,
    CONSTRAINT un_userinfo_username_unique UNIQUE(USERNAME),
    CONSTRAINT un_userinfo_emailid_unique UNIQUE(EMAILID),
    CONSTRAINT un_userinfo_phone_unique UNIQUE(PHONENUMBER)
  );

ALTER TABLE INCOME_TYPE
DROP CONSTRAINT FK_USERID

ALTER TABLE WALLET
DROP CONSTRAINT FK_WALLET_USERID

select * from userinfo

select username,password from USERINFO WHERE USERNAME='aniket' AND PASSWORD='aniket'

TRUNCATE TABLE USERINFO 

DROP SEQUENCE USERID

CREATE SEQUENCE userid
START WITH 1 INCREMENT BY 1 MINVALUE 1



INSERT
INTO USERINFO VALUES
  (
    userid.NEXTVAL,
    'aniket',
    'password',
    'aniket',
    'kanade',
    'aniket@gmail.com',
    '8888859886',
    1,
    CURRENT_DATE,
    CURRENT_DATE
  )
 
 SELECT * FROM USERINFO
 