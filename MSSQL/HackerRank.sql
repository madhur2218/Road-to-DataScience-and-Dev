--Practice questions from hackerRank

--Basic selext challenges

--1. Revising the Select Query I
select * from CITY 
where population > 100000 AND countrycode = 'USA'

--2. Revising the Select Query 2
select name from CITY 
where population >120000 and COUNTRYCODE = 'USA'

--3. SELECT ALL
select * from city

--4	Select By ID
select * from CITY 
where id = 1661

--5 Japanese Cities' Attributes
select * from CITY 
where COUNTRYCODE = 'JPN'

--6.Japanese Cities' Names
select name from CITY 
where COUNTRYCODE  = 'JPN'

--7. Weather Observation Station 1
select city, state from STATION 

--8 Weather Observation Station 3
select distinct(city) from STATION 
where mod(id,2) = 0

--9 Weather Observation Station 4
select count(city) - count(distinct(city)) FROM STATION  

--10 Weather Observation Station 5

 








--Query all columns (attributes) for every row in the CITY table.
--The CITY table is described as follows:
SELECT * FROM CITY

--Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
SELECT DISTINCT (CITY) FROM STATION WHERE CITY LIKE "A%" OR CITY LIKE "E%" OR CITY LIKE "I%" OR CITY LIKE "O%" OR CITY LIKE "U%";

--Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.
SELECT DISTINCT(city) FROM STATION 
WHERE LEFT(city,1) IN ('A','E','I','O','U')
AND RIGHT (city,1) IN ('A','E','I','O','U')

--Query the Name of any student in STUDENTS who scored higher than  Marks. Order your output by the last three characters of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.
SELECT name FROM STUDENTS 
WHERE marks>75 
ORDER BY RIGHT(name,3),id asc

--Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.
SELECT name FROM Employee
ORDER BY name asc

--Write a query that prints a list of employee names (i.e.: the name attribute) for employees in Employee having a salary greater than  per month who have been employees for less than  months. Sort your result by ascending employee_id.
SELECT name FROM Employee
WHERE salary>2000 AND months <10
ORDER BY employee_id ASC


--Advance select statemetnts (medium level)
--Type of triangle
SELECT  
    CASE
        WHEN A + B > C AND A + C > B AND B + C > A THEN
            CASE
                WHEN A = B AND B = C THEN 'EQUILATERAL'
                WHEN A = B OR A = C OR B = C THEN 'ISOSCELES'
                ELSE 'SCALENE'
            END
        ELSE 'Not A Triangle'
    END AS TriangleType
FROM TRIANGLES;

--The pads
SELECT 
    Name + '(' + LEFT(Occupation, 1) + ')' AS Output
FROM OCCUPATIONS
ORDER BY Name;


SELECT 
    'There are a total of ' + 
    CAST(COUNT(*) AS VARCHAR) + 
    ' ' + 
    LOWER(Occupation) + 
    's.' AS Output
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY COUNT(*) ASC, Occupation ASC;

--basic joins

--AFRICAN CITIES
SELECT CITY.NAME FROM CITY JOIN COUNTRY ON CITY.COUNTRYCODE = COUNTRY.CODE WHERE COUNTRY.CONTINENT = 'Africa'

--Avg polulation of each continent
select COUNTRY.Continent, round(avg(CITY.Population),2) from COUNTRY
inner join  CITY
on COUNTRY.Code = CITY.CountryCode
group by COUNTRY.Continent

--