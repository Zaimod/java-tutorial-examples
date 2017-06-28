create table ATTACHMENT
(
  ID          NUMBER(19) not null,
  FILE_NAME   VARCHAR2(50) not null,
  FILE_DATA   BLOB not null,
  DESCRIPTION VARCHAR2(255)
) ;
 
 
alter table ATTACHMENT
  add constraint ATTACHMENT_PK primary key (ID) ;