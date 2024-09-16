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











