-- Create t_user table
DROP TABLE IF EXISTS t_user CASCADE;
CREATE TABLE t_user (
    id SERIAL PRIMARY KEY NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    login VARCHAR(50) NOT NULL UNIQUE,
    full_name VARCHAR(255) NOT NULL
);

-- Create idx_full_name index
CREATE UNIQUE INDEX idx_full_name ON t_user (full_name);