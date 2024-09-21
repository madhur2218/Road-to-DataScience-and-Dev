--SQL Statement Fundamentals

-->Select Statement, Distinct and Count
Select * From actor                
Select * From address

Select address, address2 From address

Select * From film
Select title, description From FILM

Select DISTINCT(title,description) From Film
Select DISTINCT(country) From Country
Select DISTINCT(city) From city

Select Count(city) From city
Select Count(Distinct(city)) From city

Select Count(first_name) From actor
Select Count(Distinct(first_name)) From actor


--Where clause with operators (BETWEEN, LIKE, IN, ILIKE)
Select * From customer
Where first_name = 'Katie'

Select Count(first_name) From customer
Where first_name = 'Katie'

Select * From payment 
Where amount > 3.99

Select Count(customer_id) From payment 
Where amount > 3.99

Select * From payment 
Where amount BETWEEN 2.99 AND 3.99

Select Count(Distinct(amount)) From payment 
Where amount BETWEEN 2.99 AND 3.99

Select * From payment 
Where amount > 2.99 AND amount < 4.99

Select * From payment
Where amount IN (3.99, 2.99) 

Select * From country
Where country LIKE '%di%'

Select * From country
Where country ILIKE 'i%'

--Order by clause

Select * From customer
Order By first_name ASC

Select * From customer 
Order By email DESC

Select * From customer
Where email LIKE '%customer.org%'
Order By email ASC

--Group By clause with Where, Order BY and Having Clause

Select title, SUM(rental_duration) From FILM
Group By title

Select customer_id,staff_id, SUM(amount) From payment
Group By customer_id,staff_id
Having sum(amount) >1.99

--Limit clause 
Select * From customer
Where first_name LIKE '%M%'
Order By first_name ASC
Limit 1 offset 2

--Mod - retrives values where ID was even
Select DISTINCT(city) From Station
Where MOD (ID,2)=0;


--Aggregate functions
Select AVG(amount) From payment
Select Max(amount) From payment
Select Min(amount) From payment
Select Count(amount) From payment
Select Avg(Distinct(amount)) From payment

--Operators

Select * From Payment
Where customer_id IN (341,342,343)
Order By customer_id ASC

Select * From Payment
Where customer_id != 341       --NOT EQUAL


Select * From customer 
Where first_name IS NULL

Select * From customer 
Where first_name IS NOT NULL

Select film_id From film_category
UNION ALL
Select film_id From inventory

Select film_id From film_category
EXCEPT ALL
Select film_id From inventory


Select film_id AS fildids From inventory


(select city, length(city) from station   --union all
order by length(city) ASC, city asc
LIMIT 1)
UNION ALL
(select city, length(city) from station
order by length(city)DESC, city ASC
Limit 1);


Select * From actor
Where first_name ILIKE '%A' or first_name ILIKE '%e'  and first_name ILIKE '%A' or first_name ILIKE '%e'
Order By first_name asc


SELECT DISTINCT first_name
FROM actor
WHERE (first_name LIKE 'a%' OR first_name LIKE 'e%' OR first_name LIKE 'i%' OR first_name LIKE 'o%' OR first_name LIKE 'u%')
  AND (first_name LIKE '%a' OR first_name LIKE '%e' OR first_name LIKE '%i' OR first_name LIKE '%o' OR first_name LIKE '%u');


SELECT DISTINCT first_name
FROM actor
WHERE (LEFT(first_name, 1) IN ('a', 'e', 'i', 'o', 'u'))
  AND (RIGHT(first_name, 1) IN ('a', 'e', 'i', 'o', 'u'));


  --String Functions 
  Select CHAR_LENGTH (first_name),first_name,LAST_NAME From actor
  Where LAST_name = 'Stallone'

  Select EMAIL, character_length(email) From customer
  
  Select LEFT (first_name,1), rIGHT(first_name,1) From actor 
  Where first_name IN ('A','E','I','O','U') AND last_name IN ('a','e','i','o','u')


SELECT first_name, last_name 
FROM actor
WHERE 
    LEFT(first_name, 1) NOT IN ('A', 'E', 'I', 'O', 'U') 
AND 
    RIGHT(first_name, 1) NOT IN ('a', 'e', 'i', 'o', 'u')
AND
    LEFT(last_name, 1) IN ('A', 'E', 'I', 'O', 'U')
AND
    RIGHT(last_name, 1) IN ('a', 'e', 'i', 'o', 'u');


Select  Distinct first_name From actor
Where Left(first_name,1) NOT IN ('A', 'E', 'I', 'O', 'U') AND Right (first_name,1) NOT IN ('a', 'e', 'i', 'o', 'u');


Select first_name || '  ' || last_name AS full_name From CUSTOMER  --CONCAT FUNCTION 

SELECT DISTINCT SUBSTRING(email, 1, POSITION('@' IN email) - 1) AS email_before_at  --Substring function
FROM CUSTOMER; 
Select Position('e' IN 'MADHUR');
Select SUBSTRING(address,1,POSITION(' ' IN address)) from address
Select SUBSTRING(district,1,POSITION(' ' IN district)) From ADDRESS

Select Length(address) From address   	--length and char_length function (same, not difference in these functions)
Select Length(email) From customer
Select char_length(email) from customer

Select reverse(email) From customer














	

  
  
  
  

































--Keywords
1. Select
2. Where
3. Distinct
4. Count
5. Max
6. Min
9. Sum, Avg
10. Between 
11. And
12. Like 
13. ILIKE
14. IN
15. Order By 
16. ASC/DESC
17. Group By 
18. Having
19. Limit 
20. Offset - imp
21. Union  - imp, displays distinct values
	Union ALL - imp, displays non distinct values also
	AS
	String Functions

CONCAT: Joins two or more strings together 
SUBSTRING: Extracts a substring from a larger string 
LENGTH: Returns the length of a string 
LOWER: Converts a string to lowercase 
UPPER: Converts a string to uppercase 
TRIM: Removes whitespace or specified characters from the beginning or end of a string 
REPLACE: Replaces one or more instances of a substring within a string 
INSTR: Searches for the position of a substring within a string 
LEFT: Extracts a specified number of characters from the beginning of a string 
RIGHT: Extracts a specified number of characters from the end of a string
		

	















