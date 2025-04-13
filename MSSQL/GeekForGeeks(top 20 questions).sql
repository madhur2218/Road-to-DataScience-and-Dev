--This file consists of top 20 sql questions asked in interviews (GEEK FOR GEEKS)

--Second highest element of employee
SELECT MAX(salary) FROM EmployeeSalary 
ORDER BY salary DESC
LIMIT 1 OFFSET 1

SELECT MAX(salary) FROM EmployeeSalary
WHERE salary <
   (SELECT MAX(salary) FROM EmployeeSalary)
ORDER BY salary DESC
LIMIT 1

--Department Wise Highest Salary
SELECT deptno, MAX(sal) FROM EMP
GROUP BY deptno 

--Department Wise lowest Salary
SELECT deptno, MIN(sal) FROM EMP
GROUP BY deptno

--Display Alternate Records
SELECT * FROM 
	(SELECT ROW_NUMBER() OVER (ORDER BY id) AS rn from Employee)
AS sub
WHERE rn%2=0 --for even number of rows

SELECT ROW_NUMBER() OVER (ORDER BY first_name) AS rownum, first_name
FROM actor;

--Display Duplicate of a Column and its frequency
SELECT ename, COUNT(ename) FROM emp
GROUP BY ename 
HAVING COUNT(ename) > 1

--Pattern Matching in SQL

--1. Employees whose name starts with M
SELECT names FROM Emp
WHERE name ILIKE 'm%'

--2.Names ends with N
SELECT names FROM Emp
WHERE name ILIKE '%n'

--3.Char M in any position in their name
SELECT names FROM Emp
WHERE name ILIKE '%M%'

--4.Names do not contain character M anywhere
SELECT name FROM Emp
WHERE name NOT ILIKE '%M%';

--5.Names of employees whose name contains exactly 4 letters
SELECT * FROM Emp
WHERE name LIKE '____';

--6.Display names whose name contains 2nd letter as L and 4th letter as M
SELECT names FROM Emp
WHERE names LIKE '_L%'

SELECT names FROM Emp
WHERE names LIKE '___%M'

--5.Names contains exactly 2 L
SELECT names FROM emp
WHERE names ILIKE '%ll%'

--6. Names start with J and end with L
SELECT names FROM emp
WHERE names ILIKE 'J%L'

--Nth Row in sql

SELECT *
FROM (
    SELECT *, ROW_NUMBER() OVER (ORDER BY actor_id) AS rn
    FROM actor
) AS numbered
WHERE rn = 3;  -- Replace N with the desired row number

--Union 
select city from sample1
union
select city from sample2


--Display 1st and LAST row of table
SELECT * FROM 
	(SELECT ROW_NUMBER() OVER (GROUP BY id) AS rowNum FROM Emp)
WHERE rowNum = 1 OR rowNum =(SELECT COUNT(*) FROM Emp)

--Display last two rows of table
SELECT * FROM Emp
ORDER BY id DESC
LIMIT 2

SELECT * FROM 
	(SELECT ROW_NUMBER() OVER (GROUP BY id) AS rowNum FROM Emp)
WHERE rowNum > (SELECT count(*)-2 FROM Emp)

SELECT * FROM actor
ORDER BY actor_id desc
LIMIT 2

--Display first and last 2 rows of table
SELECT * FROM 
 (SELECT * FROM Emp ORDER BY id ASC LIMIT 1)
UNION ALL
SELECT * FROM 
	(SELECT * FROM Emp ORDER BY id DESC LIMIT 2)

--Display Nth Highest salary in table - there can be duplicate salaries in table
SELECT DISTINCT(salary) FROM Emp
ORDER BY salary desc
LIMIT 1 OFFSET N-1   (N is the Nth salary)

SELECT salary
FROM (
    SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
    FROM Employee
) AS ranked
WHERE rnk = 3;


--Intersect in SQL (returns only common rows present both tables unlike union which gives result of all rows from both tables)
SELECT city, country FROM sample1
INTERSECT 
SELECT city, country FROM sample2


--EXCEPT in SQL (DELETES THE ENTRIES FROM ONE TABLE FROM ANOTHER)
SELECT * FROM sample1
EXCEPT
SELECT * FROM sample2












 








