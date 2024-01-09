DQL Commands:

SELECT customer_id, first_name FROM sales.customers;
Select * From sales.customers

SELECT DISTINCT(first_name) FROM sales.customers;
SELECT COUNT(first_name) FROM sales.customers;
SELECT COUNT(DISTINCT(first_name)) FROM sales.customers;
SELECT COUNT(DISTINCT(first_name)) AS DistinctNames FROM sales.customers;

SELECT * FROM sales.customers
WHERE phone IS NULL

SELECT * FROM sales.customers
WHERE city = 'Victoria'





