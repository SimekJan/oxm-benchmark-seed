SELECT *
FROM employees
WHERE employee_id BETWEEN :id_min AND :id_max;
