SELECT s.supplier_id, s.company_name, COUNT(*)
FROM suppliers s
JOIN products p ON p.supplier_id = s.id
GROUP BY s.supplier_id, s.company_name;
