SELECT o.order_id, e.first_name, e.last_name
FROM orders o
INNER JOIN employees e ON o.employee_id = e.id;
