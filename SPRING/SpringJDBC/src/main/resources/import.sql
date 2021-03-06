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
    
    
    insert into Department (DEPT_ID, DEPT_NAME, DEPT_NO, LOCATION)
values (10, 'ACCOUNTING', 'D10', 'NEW YORK');
  
insert into Department (DEPT_ID, DEPT_NAME, DEPT_NO, LOCATION)
values (20, 'RESEARCH', 'D20', 'DALLAS');
  
insert into Department (DEPT_ID, DEPT_NAME, DEPT_NO, LOCATION)
values (30, 'SALES', 'D30', 'CHICAGO');
  
insert into Department (DEPT_ID, DEPT_NAME, DEPT_NO, LOCATION)
values (40, 'OPERATIONS', 'D40', 'BOSTON');
 
-------------------------------------------------------------------------------------------------
 
 
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7839, 'KING', 'E7839', to_date('17-11-1981', 'dd-mm-yyyy'), 'PRESIDENT', 5000, 10, null);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7566, 'JONES', 'E7566', to_date('02-04-1981', 'dd-mm-yyyy'), 'MANAGER', 2975, 20, 7839);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7902, 'FORD', 'E7902', to_date('03-12-1981', 'dd-mm-yyyy'), 'ANALYST', 3000, 20, 7566);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7369, 'SMITH', 'E7369', to_date('17-12-1980', 'dd-mm-yyyy'), 'CLERK', 800, 20, 7902);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7698, 'BLAKE', 'E7698', to_date('01-05-1981', 'dd-mm-yyyy'), 'MANAGER', 2850, 30, 7839);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7499, 'ALLEN', 'E7499', to_date('20-02-1981', 'dd-mm-yyyy'), 'SALESMAN', 1600, 30, 7698);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7521, 'WARD', 'E7521', to_date('22-02-1981', 'dd-mm-yyyy'), 'SALESMAN', 1250, 30, 7698);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7654, 'MARTIN', 'E7654', to_date('28-09-1981', 'dd-mm-yyyy'), 'SALESMAN', 1250, 30, 7698);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7782, 'CLARK', 'E7782', to_date('09-06-1981', 'dd-mm-yyyy'), 'MANAGER', 2450, 30, 7839);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7788, 'SCOTT', 'E7788', to_date('19-04-1987', 'dd-mm-yyyy'), 'ANALYST', 3000, 20, 7566);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7844, 'TURNER', 'E7844', to_date('08-09-1981', 'dd-mm-yyyy'), 'SALESMAN', 1500, 30, 7698);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7876, 'ADAMS', 'E7876', to_date('23-05-1987', 'dd-mm-yyyy'), 'CLERK', 1100, 20, 7698);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7900, 'ADAMS', 'E7900', to_date('03-12-1981', 'dd-mm-yyyy'), 'CLERK', 950, 30, 7698);
  
insert into Employee (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, JOB, SALARY, DEPT_ID, MNG_ID)
values (7934, 'MILLER', 'E7934', to_date('23-01-1982', 'dd-mm-yyyy'), 'CLERK', 1300, 10, 7698);