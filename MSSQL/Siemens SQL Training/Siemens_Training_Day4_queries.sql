----VIEWS-----
--ment to show part of tables data 
--Simple view and complex view
--most of the time we use complex views
--views are already complied and only execured, but normal query gets complied and then gets executed

create view empv1 as select * from emp where sal > 2000

select * from empv1
update empv1 set sal = 1500 WHERE ename = 'FORD'

ALTER view empv1 as select * from emp where sal > 2000 WITH CHECK OPTION

select * from empv1

SELECT * FROM empv1 update empv1 set sal = 1500 where ename = 'king'

sp_helptext 'empv1'

create view empdeptvw with encryption as 
select e.*, d.dname from emp e 
join dept d 
on e.deptno = d.deptno

select * from empdeptvw
sp_helptext 'empdeptvw'

alter view empdeptvw as select e.*, d.dname from emp e join dept d on e.deptno=d.deptno
sp_helptext 'empdeptvw'





