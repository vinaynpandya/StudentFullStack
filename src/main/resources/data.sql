drop table students;
create table students(id SERIAL PRIMARY KEY NOT NULL, fname varchar(255), lname varchar(255)
, major varchar(255), college varchar(255), created_date smalldatetime);
insert into students (fname,lname,major,college,created_date) values ('Ram','Bhai','History','BIT',CURRENT_TIMESTAMP());
insert into students (fname,lname,major,college,created_date) values ('John','Doe','Computer Science','OCU',CURRENT_TIMESTAMP());
insert into students (fname,lname,major,college,created_date) values ('Rahim','Rahgir','Math','DU',CURRENT_TIMESTAMP());
insert into students (fname,lname,major,college,created_date) values ('Robert','RockStar','English','UT Austin',CURRENT_TIMESTAMP());

COMMIT;