create table DEPARTMENT (
    DEPT_ID number(10,0) not null,
    DEPT_NAME varchar2(255 char) not null,
    DEPT_NO varchar2(20 char) not null unique,
    LOCATION varchar2(255 char),
    primary key (DEPT_ID)
);
 
create table EMPLOYEE (
    EMP_ID number(19,0) not null,
    EMP_NAME varchar2(50 char) not null,
    EMP_NO varchar2(20 char) not null unique,
    HIRE_DATE date not null,
    IMAGE blob,
    JOB varchar2(30 char) not null,
    SALARY float not null,
    DEPT_ID number(10,0) not null,
    MNG_ID number(19,0),
    primary key (EMP_ID)
);
 
create table SALARY_GRADE (
    GRADE number(10,0) not null,
    HIGH_SALARY float not null,
    LOW_SALARY float not null,
    primary key (GRADE)
);
 
create table TIMEKEEPER (
    Timekeeper_Id varchar2(36 char) not null,
    Date_Time timestamp not null,
    In_Out char(1 char) not null,
    EMP_ID number(19,0) not null,
    primary key (Timekeeper_Id)
);
 
alter table EMPLOYEE
    add constraint FK75C8D6AE269A3C9
    foreign key (DEPT_ID)
    references DEPARTMENT;
 
alter table EMPLOYEE
    add constraint FK75C8D6AE6106A42
    foreign key (EMP_ID)
    references EMPLOYEE;
 
alter table EMPLOYEE
    add constraint FK75C8D6AE13C12F64
    foreign key (MNG_ID)
    references EMPLOYEE;
 
alter table TIMEKEEPER
    add constraint FK744D9BFF6106A42
    foreign key (EMP_ID)
    references EMPLOYEE;