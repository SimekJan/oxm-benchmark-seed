-- Direct connections (depth 1)
SELECT DISTINCT s.*, target.*
FROM suppliers s
JOIN supplier_relationship sr ON sr.supplier_id = s.id
JOIN suppliers target ON target.id = sr.supplied_to_id
WHERE s.id <> target.id;

-- Indirect connections (depth 2)
SELECT DISTINCT s.*, target.*
FROM suppliers s
JOIN supplier_relationship sr1 ON sr1.supplier_id = s.id
JOIN supplier_relationship sr2 ON sr2.supplier_id = sr1.supplied_to_id
JOIN suppliers target ON target.id = sr2.supplied_to_id
WHERE s.id <> target.id;
