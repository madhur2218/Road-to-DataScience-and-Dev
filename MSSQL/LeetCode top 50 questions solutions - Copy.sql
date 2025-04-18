--TOP 50 SQL questions from LEETCODE

--1757. Recyclable and Low Fat Products
SELECT product_id  FROM PRODUCTS
WHERE low_fats = 'Y' AND recyclable = 'Y'

--584. Find Customer Referee
SELECT name FROM Customer
WHERE referee_id  !=2 or referee_id is null

--595. Big Countries
SELECT name, population, area FROM World
WHERE area >= 3000000 OR population >=25000000

--1148. Article views 1
SELECT distinct(author_id) as id FROM Views 
WHERE author_id = viewer_id

--1683. Invalid tweets
SELECT tweet_id FROM Tweets
WHERE LENGTH(CONTENT) >15 

--1378. Replace Employee ID With The Unique Identifier
SELECT eu.unique_id, e.name FROM Employees AS e
LEFT JOIN EmployeeUNI as eu
ON eu.id = e.id

--1068. Product Sales Analysis I
SELECT p.product_name, s.year, s.price FROM Sales as s
INNER JOIN Product p
ON s.product_id = p.product_id 

--1581. Customer Who Visited but Did Not Make Any Transactions (**)
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans 
from Visits v 
LEFT JOIN Transactions t 
ON v.visit_id = t.visit_id  
WHERE t.transaction_id IS NULL 
GROUP BY v.customer_id; 

--620. Not Boring Movies
SELECT * FROM Cinema
WHERE MOD(id,2) = 1 AND description !='boring'
order by RATING DESC

SELECT id,movie,description,rating
FROM (
    SELECT *,
           ROW_NUMBER() OVER (PARTITION BY description ORDER BY rating DESC) AS rn
    FROM Cinema
    WHERE MOD(id, 2) = 1   -- Odd-numbered ID
      AND description != 'boring'
) AS ranked
ORDER BY rating DESC;

--1251. Average Selling Price
SELECT 
    p.product_id, 
    COALESCE(ROUND(SUM(u.units * p.price)::numeric / NULLIF(SUM(u.units), 0), 2), 0) AS average_price
FROM 
    Prices p
LEFT JOIN 
    UnitsSold u
    ON p.product_id = u.product_id 
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY 
    p.product_id;




