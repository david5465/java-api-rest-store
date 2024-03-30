CREATE TABLE productos (
    id BIGSERIAL PRIMARY KEY,
    sku VARCHAR(50) UNIQUE NOT NULL,
    barcode VARCHAR(50) UNIQUE NOT NULL,
    title VARCHAR(255) NOT NULL,
    brand VARCHAR(100),
    description TEXT,
    costPrice NUMERIC(12,2) NOT NULL,
    salePrice NUMERIC(12,2) NOT NULL,
    available BOOLEAN NOT NULL,
    supplier VARCHAR(100),
    category VARCHAR(100),
    tax NUMERIC(5,2)
);