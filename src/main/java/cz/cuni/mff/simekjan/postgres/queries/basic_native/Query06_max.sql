SELECT category, MAX(unit_price)
FROM products
GROUP BY category;
