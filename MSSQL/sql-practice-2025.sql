SELECT * FROM address


SELECT * FROM address
SELECT DISTINCT (district) FROM address

SELECT * FROM country
WHERE country ILIKE '%A'  -- ENDS WITH A or a

SELECT * FROM payment
ORDER BY amount DESC


between in like

SELECT * FROM film
WHERE replacement_cost BETWEEN 14.99 and 20.99

SELECT * FROM film
WHERE title in ('Academy Dinosaur', 'Date Speed')

SELECT  first_name , last_name, count(first_name) FROM actor
Group BY first_name, last_name

SELECT COUNT(*) FROM actor
Where first_name = 'Angela'

SELECT address, COUNT(district) FROM ADDRESS
GROUP BY address
HAVING address like '%47'


Select * From country 
Where country LIKE 'A%'
LIMIT 1 OFFSET 1


SELECT * FROM customer
WHERE customer_id NOT IN (1,2,3,4,5)


SELECT * FROM customer 
ORDER BY first_name DESC

SELECT first_name, last_name, COUNT(first_name) FROM customer
GROUP BY first_name, last_name 
HAVING COUNT(first_name) >1

SELECT payment_id, SUM(amount) FROM payment
Group By payment_id


SELECT * FROM payment q
JOIN payment d
ON q.payment_id = d.payment_id

-- List all customers with their order dates.
SELECT c.customer_id, c.name, o.order_date FROM Customers c 
INNER JOIN Orders o
ON c.customer_id = o.customer_id

--List customer names and the products they ordered.
SELECT c.customer_id, c.name, o.customer_id, p.product_name  FROM Customer c 
INNER JOIN Orders o 
ON c.customer_id = o.order_id
INNER JOIN Order_items oi
ON o.order_id = oi.order_id
INNER JOIN Products p 
ON oi.product_id = p.product_id

--Show all products and the number of times each was ordered
SELECT p.product_id, p.product_name, COUNT(oi.item_id) FROM Products p 
LEFT JOIN Order_Items oi
ON p.product_id = oi.product_id
GROUP BY p.product_name

--Show all customers and the total amount they've spent
SELECT c.customer_id, c.name, SUM(oi.quantity*p.product) AS total_spent FROM Customers c
JOIN Orders o ON c.customer_id = o.customer_id
JOIN Order_Items oi ON o.order_id = oi.order_id
JOIN Products p ON oi.product_id = p.product_id
GROUP BY c.name;

-- Show all customers even if they haven’t placed any orders
SELECT c.name AS customer_name, o.order_id
FROM Customers c
LEFT JOIN Orders o ON c.customer_id = o.customer_id;










SELECT logins.id, count(logins.id) FROM logins l
INNER JOIN registrations r 
ON l.id=r.id
WHERE abs(r.rdate - l.ldate) <7
GROUP BY l.id


SELECT e.name as employeeName FROM Employees e 
JOIN Employees s 
ON e.empid = s.supid
WHERE e.salary > s.supid

SELECT e.empid, e.name AS employeeName, d.name AS dept_name FROM Employees e
LEFT JOIN Departments d
ON e.deptid = d.deptid

SELECT e.empid, e.name AS employeeName , s.name AS supervisorName FROM Employee e
SELF JOIN Employee s 
ON e.supid = s.empid

SELECT d.deptid, d.name AS deptName, MAX(e.salary) AS employeeSlary FROM Employees e
INNER JOIN Department d
ON e.deptid = d.deptid
Group By d.Name













