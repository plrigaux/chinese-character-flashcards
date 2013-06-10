DROP VIEW DUPLICATE_HANZI
;

DROP Table HSK_VOCABULARY
;

Create Table HSK_VOCABULARY (
ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
SIMPLIFIED VARCHAR(10) not null, 
PINYIN_NUM VARCHAR(150) not null, 
PINYIN VARCHAR(150) not null,
LEVEL INTEGER not null,
DEFINITION VARCHAR(450) not null,
PRIMARY KEY (ID)
)
;


CREATE VIEW DUPLICATE_HANZI AS SELECT * from   HSK_VOCABULARY 
where  HSK_VOCABULARY.SIMPLIFIED in (SELECT SIMPLIFIED
  FROM HSK_VOCABULARY 
  GROUP BY SIMPLIFIED
HAVING COUNT(SIMPLIFIED) > 1) order by HSK_VOCABULARY.SIMPLIFIED

;