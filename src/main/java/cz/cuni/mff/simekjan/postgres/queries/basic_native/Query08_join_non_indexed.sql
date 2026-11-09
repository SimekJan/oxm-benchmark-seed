SELECT c.company_name, c.city, e.first_name, e.last_name
FROM customers c
INNER JOIN employees e ON c.city = e.city;
