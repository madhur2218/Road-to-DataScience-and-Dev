---- stored procedure ---
CREATE PROCEDURE empdept10 AS
BEGIN
SELECT * FROM  emp where deptno=10;
END

exec empdept10

--------------------------------------------------------------------------------------
alter PROCEDURE upempbydeptno @dno  INT = 20, @x int, @y varchar(20)
AS
BEGIN
select sal from emp where deptno =@dno;
update EMP set SAL=SAL+100 where DEPTNO=@dno;
select sal from emp where deptno=@dno;
select @@rowcount
END

