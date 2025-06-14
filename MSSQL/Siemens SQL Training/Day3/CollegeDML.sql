--- Inserting data into tables ---


-- Department Table ---
 insert into department values(2001,'EC','Bangalore',null);
 insert into department values(2002,'CS','Mysore',null);
 insert into department values(2003,'IT','Cochin',null);
 insert into department values(2004,'CV','Mumbai',null);
 insert into department values(2005,'EE','Chennai',null);
 insert into department values(2006,'IS','Pune',null);

-- Instructor Table --
 insert into instructor values(11,'Arun','2007-05-10',9899990910,2002);
 insert into instructor values(12,'Ajay','2007-07-10',9899990918,2001);
 insert into instructor values(13,'Smitha','2007-08-10',9899990911,2003);
 insert into instructor values(14,'Raghuveer','2007-09-07',9899990912,2004);
 insert into instructor values(15,'Manoj','2009-02-13',9899990913,2006);
 insert into instructor values(16,'Sanjeev','2009-04-09',9899990914,2002);
 insert into instructor values(17,'Geetha','2006-10-13',9899990915,2001);
 insert into instructor values(18,'Leela','2007-03-22',9899990916,2005);
 insert into instructor values(19,'Rekha','2010-08-10',9899990917,2006);
insert into instructor values(20,'Kiran','2012-11-12',9899990919,2004);

update department set dhid=13 where did=2001;
update department set dhid=17 where did=2002;
update department set dhid=15 where did=2003;
update department set dhid=15 where did=2004;
update department set dhid=12 where did=2005;
update department set dhid=14 where did=2006;


-- Course Table ---
 insert into course values(101,'C',3000,'ProgLogic',2,11,2002);
 insert into course values(102,'C++',8000,'OOPS',3,11,2002);
 insert into course values(103,'Oracle',6000,'DataLogic',1,16,2002);
 insert into course values(105,'CAD',2000,'Design',2,14,2004);
 insert into course values(106,'AWS',13000,'ITInfra',2,13,2003);
 insert into course values(107,'Linux',10000,'OS',2,15,2006);
 insert into course values(104,'Java',9000,'ProgLogic',6,18,2005);

-- student table ---
         Insert into student values(1 ,'Akshay','1999-07-23');
        Insert into student values(2,'Ajay','1998-08-13');
         Insert into student values(3,'Bala','1997-10-20');
         Insert into student values(4,'Hari','1999-05-15');
         Insert into student values(5,'Henry','2002-02-19');
         Insert into student values(6,'Shruthi','1999-07-23');
         Insert into student values(7,'Deepak','1999-09-14');
         Insert into student values(8,'Prankaj','1999-06-18');
         Insert into student values(9,'Vinay','1999-03-19');
        Insert into student values(10,'Divya','2001-05-08');
        Insert into student values(11,'Sagar','2008-01-16');
        Insert into student values(12,'Sohan','1999-11-21');
        Insert into student values(13,'Nikil','2003-12-16');
        Insert into student values(14,'Vishal','2002-02-24');
        Insert into student values(15,'Leena','2003-04-03');

-- Enrolls Table --

insert into enrolls values(1,101,68);
insert into enrolls values(2,102,86);
insert into enrolls values(3,102,77);
insert into enrolls values(4,103,56);
insert into enrolls values(5,105,80);
insert into enrolls values(6,106,76);
insert into enrolls values(7,101,58);
insert into enrolls values(8,107,33);
insert into enrolls values(9,103,81);
insert into enrolls values(12,101,72);
insert into enrolls values(13,101,66);
insert into enrolls values(14,103,60);
insert into enrolls values(15,102,92);
insert into enrolls values(10,104,74);
insert into enrolls values(11,104,65);


