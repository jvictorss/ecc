-- V1_0__create_table_diocese.sql

CREATE SEQUENCE IF NOT EXISTS sq_diocese_id START WITH 1 INCREMENT BY 1;

CREATE TABLE diocese (
                         id BIGSERIAL PRIMARY KEY,
                         ativo BOOLEAN,
                         criado TIMESTAMP,
                         atualizado TIMESTAMP,
                         id_user BIGINT,
                         id_user_atualizou BIGINT,
                         hash VARCHAR(255) UNIQUE,

                         nome VARCHAR(255) NOT NULL,
                         cidade VARCHAR(255) NOT NULL,
                         estado VARCHAR(255) NOT NULL,
                         observacao TEXT
);
