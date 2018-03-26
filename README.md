# jsf_spring_hibernate_crud

This is a sample JSF + Spring Boot + Hibernate + Mysql Crud application with authorisation and authentication done with spring security.

# System Requirements

Java 1.8
Spring Boot 2.4.1
Jsf 2.0
Hibernate 4
Primefaces 5
Mysql database


# Project Structure 

Database

Please find the dumb of database in the attahced cnfdatabase.sql.Please insert the values for the Department table.
ddl-auto = auto , SO tables will be created automatically .Please create the database that will like and make changes in the application.yml 

Run the below in the mysql .

mysql> INSERT INTO department(department_id,dept_name) VALUES(1,'It'), (2,'Finance'),(3,'Hr') ,(4,'Operations');
Query OK, 4 rows affected (0.06 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from department;
+---------------+------------+
| department_id | dept_name  |
+---------------+------------+
|             1 | It         |
|             2 | Finance    |
|             3 | Hr         |
|             4 | Operations |
+---------------+------------+
4 rows in set (0.00 sec)

Then only department will show data.

# Frontend

I have used JSF with primefaces in frontend.
  We ahev used mixed tag of JSF and Primefaces .

# Security

I have integrated Jsf with the spring Security .

# BackEnd

Spring repository was used mainly for database opertaion.

# Project Deployement.

Unzip the project .
Run mvn clean install .
Run sprin boot command mvn spring-boot:run.
Run the local host as we ahve given the port number as 9090 please use http://localhost:9090/jsfcrudspring

context-path: /jsfcrudspring
port: 9091

Coclusion

I have attahced all the images for workflow.
