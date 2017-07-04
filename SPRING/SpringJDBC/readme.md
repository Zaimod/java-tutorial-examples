"YOU HAVE TO SET ORACLE SID: set ORACLE_SID=sid" for no rows selected error

As always, begin by connecting to your server where Oracle is hosted, then connect to Oracle itself as the SYSTEM account.

The SYSTEM account is one of a handful of predefined administrative accounts generated automatically when Oracle is installed. SYSTEM is capable of most administrative tasks, but the task we’re particularly interested in is account management.
Creating a User

Once connected as SYSTEM, simply issue the CREATE USER command to generate a new account.

CREATE USER books_admin IDENTIFIED BY MyPassword;

Here we’re simply creating a books_admin account that is IDENTIFIED or authenticated by the specified password.
The Grant Statement

With our new books_admin account created, we can now begin adding privileges to the account using the GRANT statement. GRANT is a very powerful statement with many possible options, but the core functionality is to manage the privileges of both users and roles throughout the database.
Providing Roles

Typically, you’ll first want to assign privileges to the user through attaching the account to various roles, starting with the CONNECT role:

GRANT CONNECT TO books_admin;

In some cases to create a more powerful user, you may also consider adding the RESOURCE role (allowing the user to create named types for custom schemas) or even the DBA role, which allows the user to not only create custom named types but alter and destroy them as well.

GRANT CONNECT, RESOURCE, DBA TO books_admin;

Assigning Privileges

Next you’ll want to ensure the user has privileges to actually connect to the database and create a session using GRANT CREATE SESSION. We’ll also combine that with all privileges using GRANT ANY PRIVILEGES.

GRANT CREATE SESSION GRANT ANY PRIVILEGE TO books_admin;

We also need to ensure our new user has disk space allocated in the system to actually create or modify tables and data, so we’ll GRANT TABLESPACE like so:

GRANT UNLIMITED TABLESPACE TO books_admin;

Table Privileges

While not typically necessary in newer versions of Oracle, some older installations may require that you manually specify the access rights the new user has to a specific schema and database tables.

For example, if we want our books_admin user to have the ability to perform SELECT, UPDATE, INSERT, and DELETE capabilities on the books table, we might execute the following GRANT statement:

GRANT
  SELECT,
  INSERT,
  UPDATE,
  DELETE
ON
  schema.books
TO
  books_admin;

This ensures that books_admin can perform the four basic statements for the books table that is part of the schema schema.
