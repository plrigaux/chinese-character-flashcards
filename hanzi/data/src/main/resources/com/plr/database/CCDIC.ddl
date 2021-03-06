Create Table BASE (
ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
TRADITIONAL VARCHAR(45) not null, 
SIMPLIFIED VARCHAR(45) not null, 
PINYIN_NUM VARCHAR(150) not null, 
PINYIN VARCHAR(150) not null, 
PRIMARY KEY (ID)
)
;
						
Create Table DEFINITION (
ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
DEF VARCHAR(1500) not null UNIQUE,
PRIMARY KEY (ID)
)
;
						
						
Create Table BASE_DEF (
ID_BASE INTEGER, 
ID_DEF INTEGER, 
PRIMARY KEY (ID_BASE, ID_DEF)
)
;
	
Create Table CLASSIFIER (
ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
TRADITIONAL CHAR(1),
SIMPLIFIED CHAR(1) not null UNIQUE,
PINYIN_NUM VARCHAR(7),
PINYIN VARCHAR(7),
PRIMARY KEY (ID)
)
;

Create Table BASE_CLASS (
ID_BASE INTEGER, 
ID_CLF INTEGER, 
PRIMARY KEY (ID_BASE, ID_CLF)
)
;

CREATE INDEX DEFIDX ON DEFINITION (DEF)
;

				
CREATE INDEX CLFIDX ON CLASSIFIER (SIMPLIFIED)
;

CREATE INDEX BASE_SIMPL_IDX ON BASE (SIMPLIFIED)
;		

Create VIEW DANCI as select b.ID as Id,b.TRADITIONAL as TRADITIONAL, b.SIMPLIFIED as SIMPLIFIED, b.PINYIN_NUM as PINYIN_NUM,b.PINYIN as PINYIN,d.DEF as DEFINITION
from BASE b
join BASE_DEF bd on b.ID = Bd.ID_DEF
join DEFINITION d on Bd.ID_DEF = d.ID
;

Create view  DANCI_CLS as select d.*, c.TRADITIONAL as CLS_TRADITIONAL, c.SIMPLIFIED as CLS_SIMPLIFIED, c.PINYIN_NUM as CLS_PINYIN_NUM, c.PINYIN as CLS_PINYIN
from DANCI d
left join BASE_CLASS bc on d.id = bc.ID_BASE 
left join CLASSIFIER c on bc.ID_CLF = c.ID