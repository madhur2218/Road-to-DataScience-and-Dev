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

21. Operators















