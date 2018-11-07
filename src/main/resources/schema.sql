drop table IF EXISTS  table02 ;

create table table02
(
  id   integer,
  name varchar(255)
);

drop table IF EXISTS  table03 ;
create table table03
(
  id   integer,
  name varchar(255)
);


drop table IF EXISTS  emmployee;

create table emmployee
(
  id   integer,
  last_name varchar(255),
  gender   integer,
  email varchar(255),
  dId   integer
);

drop table IF EXISTS  department;

create table department
(
  id   integer,
  name varchar(255)
);