SELECT *
FROM products
WHERE unit_price BETWEEN :price_from AND :price_to;
