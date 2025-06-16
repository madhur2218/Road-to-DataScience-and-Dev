--DAY 2 QUERIES

--Scalar functions 

SELECT LOWER(ENAME) FROM EMP
SELECT LOWER(ENAME), UPPER(ENAME), LEN(ENAME) FROM EMP
SELECT LEFT(ENAME, 2) FROM EMP
SELECT RIGHT(ENAME, 2)AS E FROM EMP


-------CASE(IF THEN END)--------

SELECT EMPNO, ENAME, DEPTNO,
	CASE DEPTNO
			WHEN 10 THEN 'A'
			WHEN 20 THEN 'B'
			WHEN 30 THEN 'C'
			ELSE 'N/A'
		END AS empgrd
FROM EMP


SELECT EMPNO, ENAME, DEPTNO, SAL,
       CASE 
           WHEN SAL BETWEEN 800 AND 1100 THEN 'BLUE COLLAR JOB'
           WHEN SAL > 1100 THEN 'WHITE COLLAR JOB'
           ELSE 'N/A'
       END AS JobType
FROM EMP;

----Group By clause------

SELECT SUM(SAL), JOB FROM EMP
GROUP BY JOB 

SELECT SUM(SAL), DEPTNO FROM EMP
WHERE DEPTNO IN (10,20)
GROUP BY DEPTNO

SELECT MIN(SAL) FROM EMP
SELECT MAX(SAL) FROM EMP

--WHEN DID THE SENIORMOST CLERK JOIN 
SELECT * FROM EMP
WHERE HIREDATE =  (SELECT MIN(hiredate) FROM emp WHERE job = 'CLERK')

--when was a manager recruited most recently
SELECT * FROM EMP
WHERE HIREDATE = (SELECT MAX(HIREDATE) FROM EMP WHERE JOB = 'MANAGER')

--get total sal paid for emp who earn comm
SELECT SUM(SAL) FROM EMP
WHERE comm IS NOT NULL

select avg(comm) from emp
where comm is not null

SELECT AVG(COMM), SUM(COMM)/4, AVG(ISNULL(COMM,0)) FROM EMP

--how many employees earn comission
SELECT COUNT(*) FROM EMP
WHERE COMM IS NOT NULL

--how many managers salary more than 2500
SELECT * FROM EMP
SELECT COUNT(*) FROM EMP
WHERE JOB = 'MANAGER' AND SAL > 2500 

--headcount of emp in each dept
SELECT JOB, COUNT(*) FROM EMP
GROUP BY JOB 
ORDER BY COUNT(*) DESC

--total salary paid for each job 
SELECT SUM(SAL), JOB FROM EMP
GROUP BY JOB
ORDER BY SUM(SAL) DESC

--total salary paid for each job excluding clerks
SELECT SUM(SAL) , JOB FROM EMP
GROUP BY JOB
HAVING JOB != 'CLERK'
order by SUM(SAL) DESC 

--TOTAL SAL PAID FOR EACH JOB EXCLUDING CLERKS ONLY IF THE TOTAL SAL > 5000
SELECT SUM(SAL) AS TSAL, JOB FROM EMP
GROUP BY JOB
HAVING JOB != 'CLERK' AND SUM(SAL) > 5000
ORDER BY TSAL DESC

--how many emp earn sal . 1000 in each dept
SELECT deptno, COUNT(*) AS emp_count
FROM emp
WHERE sal > 1000
GROUP BY deptno;

--how many emp earn sal > 1000 in each dept with avg(sal) > 1500
SELECT COUNT(*) FROM EMP
WHERE SAL > 1000
GROUP BY deptno
HAVING AVG(SAL) > 1500 

--dept wise head count
select deptno, count(*) from emp
group by deptno

--dept wise, jobwise healdcount
SELECT COUNT(*) FROM EMP
GROUP BY JOB, DEPTNO
ORDER BY JOB DESC

--joins (day2 2nd half)

select * from dept;
select * from emp;

-- list empno,ename,sal,deptno,dname 
--  table emp, dept
-- join criteria --emp.deptno=dept.deptno
-- inner join

SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL , D.LOC FROM EMP AS E 
INNER JOIN DEPT AS D 
ON E.DEPTNO = D.DEPTNO

--list empno,ename,sal,deptno,dname of emp with sal>2000
SELECT E.EMPNO, E.ENAME, E.SAL, E.DEPTNO, D.DNAME FROM EMP E 
LEFT JOIN DEPT D 
ON E.DEPTNO = D.DEPTNO
WHERE SAL > 2000

-- 3 table join  (emp,dept,salgrade)
SELECT * FROM EMP
SELECT * FROM DEPT
SELECT * FROM SALGRADE

select e.empno,e.ename,d.deptno,d.dname,e.sal,s.grade from emp e    --- doubt 
join dept d
on e.deptno=d.deptno -- o/p1
join  salgrade s 
on e.sal between s.losal and s.hisal


select e.empno,e.ename,e.sal,d.deptno,d.dname from emp e 
right join dept d
on e.deptno=d.deptno 

select empno,ename,sal,grade,losal,hisal from emp e 
full  join salgrade s
on e.sal between s.losal and s.hisal;q

select empno,ename,sal,grade,losal,hisal from emp e 
inner  join salgrade s
on e.sal = s.losal 

select e.empno,e.ename,e.sal,d.deptno,d.dname from emp e right outer join dept d on e.deptno=d.deptno;

-- list ename , managername
select * from emp;

select   e.ename +' REPORTS TO '+ isnull(m.ename,'NONE') as emp_manager_details from emp e 
left join emp m 
on e.mgr=m.empno;

select comm,mgr,sal,coalesce(comm,mgr,sal) from emp;
--how many emp earn comm
select count(*) from emp where comm is not null;
select count(comm) from emp where job='salesman';
-- mgrwise count of reportees
select mgr, count(*) rct from emp  where mgr is not null group by mgr;
-- list dname, count(employees)  in each dname

select dname,count(empno)  from emp e right join dept d  on e.deptno=d.deptno
group by dname
select dname,count(*)  from emp e right join dept d  on e.deptno=d.deptno
group by dname

-- list  dname,  min(sal) , max(sal) in each dname

select d.dname, min(sal), max(sal) from emp e 
right join dept d 
on e.DEPTNO = d.DEPTNO
GROUP BY d.dname 

-- list grade, count(employees) in each grade
select s.grade, count(e.empno) from emp e  left join salgrade s on e.sal between s.losal and s.hisal
group by s.grade


-- set operators (union all, union, intersect, except)
-- queries should identical in structure
-- corresponding cols shd of compatible datatype
/* select sal+comm,ename from emp where deptno in(10,20) and job='clerk'
  union all
   select sal+comm,ename from emp where deptno in(10,20) and job='clerk'  */

select ename, job, sal from emp where sal>2000
union all
select ename, job, sal from emp where job='manager'

select ename, job, sal from emp where sal>2000
union 
select ename, job, sal from emp where job='manager'

 select ename, job, sal from emp where sal>2000
 intersect
 select ename, job, sal from emp where job='manager'

   select ename, job, sal from emp where sal>2000
 except
  select ename, job, sal from emp where job='manager'
  union
  select dname, loc, 1 from dept

  --union, union all, intersect, except (these are the keywords to be used)

  select 'a' as A, 'b'  as B
  union all
  select '1+3', 'ab'

  --Rollup and drill down
 select deptno,job,count(*) hct from emp
 group by  rollup (deptno,job)
 order by deptno;

























