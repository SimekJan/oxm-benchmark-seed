SELECT
    s.id AS supplier_id,
    s.company_name AS supplier,
    COUNT(sr.supplied_to_id) AS supplied_count
FROM suppliers s
LEFT JOIN supplier_relationship sr ON sr.supplier_id = s.id
GROUP BY s.id, s.company_name;
