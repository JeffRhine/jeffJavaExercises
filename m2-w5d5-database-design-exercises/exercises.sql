BEGIN TRANSACTION;

CREATE TABLE department (
id serial,
name varchar(255) NOT NULL,
constraint pk_deparment_id PRIMARY KEY(id)
);

CREATE TABLE employee (
employee_id serial,
first_name varchar(255) NOT NULL,
last_name varchar(255) NOT NULL,
gender character(1) NOT NULL,
birthday DATE,
hiredate DATE,
department_id integer,
job_title varchar(255),
CONSTRAINT pk_employee_id PRIMARY KEY(employee_id),
CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES department(id)
);

CREATE TABLE project (
project_id serial,
start_date DATE NOT NULL,
project_name varchar(255) NOT NULL UNIQUE,
CONSTRAINT pk_project_id PRIMARY KEY (project_id)
);

CREATE TABLE employee_project (
employee_id integer NOT NULL,
project_id integer NOT NULL,
CONSTRAINT pk_employee_project_id PRIMARY KEY (employee_id,project_id),
CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES project(project_id),
CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);
commit;


INSERT INTO department (name) VALUES ('World Domination');
INSERT INTO department (name) VALUES ('Revenge');
INSERT INTO department (name) VALUES ('Profit');
INSERT INTO employee (first_name,last_name,gender,birthday,hiredate,department_id,job_title) VAlUES ('Red','Skull','M','1920-04-14','1941-07-04',1,'Nazi');
INSERT INTO employee (first_name,last_name,gender,birthday,hiredate,department_id,job_title) VAlUES ('Otto','Octavius','M','1964-05-15','1980-03-24',2,'DocOck');
INSERT INTO employee (first_name,last_name,gender,birthday,hiredate,department_id,job_title) VAlUES ('Norman','Osborn','M','1956-07-24','1975-06-28',3,'Goblin');
INSERT INTO employee (first_name,last_name,gender,birthday,hiredate,department_id,job_title) VAlUES ('Helmut','Zemo','M','1945-02-14','1965-07-13',2,'Baron');
INSERT INTO employee (first_name,last_name,gender,birthday,hiredate,department_id,job_title) VAlUES ('Wilson','Fisk','M','1967-03-24','1991-09-23',3,'KingPin');
INSERT INTO employee (first_name,last_name,gender,birthday,hiredate,department_id,job_title) VAlUES ('Kang','TheConqueror','M','2984-07-30','1965-08-24',1,'Immortus');
INSERT INTO employee (first_name,last_name,gender,birthday,hiredate,department_id,job_title) VAlUES ('Batroc','TheLeaper','M','1976-07-23','1999-09-15',2,'FrenchGuy');
INSERT INTO employee (first_name,last_name,gender,birthday,hiredate,department_id,job_title) VAlUES ('Victor','VonDoom','M','1964-04-06','1987-02-22',1,'KingOfAllVillians');
INsert INTO project (project_name,start_date) VAlues ('KillEveryone','1999-04-07');
INsert INTO project (project_name,start_date) VAlues ('DestroyEarth','1999-12-31');
INsert INTO project (project_name,start_date) VAlues ('RobBank','2015-02-14');
INsert INTO project (project_name,start_date) VAlues ('RuleTheUniverse','1964-02-15');
INsert INTO project (project_name,start_date) VAlues ('killSpider-Man','1985-05-17');
INSERT INTO employee_project (employee_id,project_id) VAlUES (1,1);
INSERT INTO employee_project (employee_id,project_id) VAlUES (2,5);
INSERT INTO employee_project (employee_id,project_id) VAlUES (3,5);
INSERT INTO employee_project (employee_id,project_id) VAlUES (4,2);
INSERT INTO employee_project (employee_id,project_id) VAlUES (5,3);
INSERT INTO employee_project (employee_id,project_id) VAlUES (6,4);
INSERT INTO employee_project (employee_id,project_id) VAlUES (7,3);
INSERT INTO employee_project (employee_id,project_id) VAlUES (8,4);




ADD CONSTRAINT gender_check CHECK ((UPPER (gender)='M') OR (UPPER (gender)='F'));

ROLLBACK;

DROP TABLE employee;














