-- College Database--
-- DDL script to create table --
-- Department Table --
create table department(
did NUMERIC(4) constraint did_pk primary key,
dname varchar(20) constraint dname_nn not null,
dloc varchar(20));

-- Instructor Table --
create table instructor(iid NUMERIC(2) constraint iid_pk primary key, iname  varchar(20) constraint iname_nn not null,
idoj date constraint idoj_nn not null,iphno NUMERIC(10),
idid NUMERIC(4) constraint idid_fk references department (did) );

Alter table department add dhid NUMERIC(2) constraint dhid_fk references instructor(iid);

-- course table --

create table course(
cid NUMERIC(3) constraint cid_pk primary key,
cname varchar(15) constraint cname_nn not null,
cfees NUMERIC(7,2) , cprereq varchar(30),cduration NUMERIC(2),iid NUMERIC(2) constraint ciid_fk  references instructor(iid),did NUMERIC(4)  constraint cdid_fk references department(did));

-- Student Table --

create table student(
sid NUMERIC(3) constraint sid_pk primary key,
sname varchar(20) constraint sname_nn not null, sdob date);

-- Enrolls Table --

create table enrolls(
sid NUMERIC(3) constraint sidfk  references student(sid),cid NUMERIC(3) constraint cidfk references course(cid), score NUMERIC(3));