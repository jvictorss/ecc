CREATE SEQUENCE sq_setorial_id START WITH 1 INCREMENT BY 1;

CREATE TABLE setorial (
    id BIGINT NOT NULL PRIMARY KEY,
    nome_setor VARCHAR(255) NOT NULL,
    nome_casal_setorial VARCHAR(255) NOT NULL,
    contato_casal_setorial VARCHAR(255) NOT NULL,
    email_casal_setorial VARCHAR(255) NOT NULL,
    diocese_id BIGINT NOT NULL,
    observacao VARCHAR(255),
    ativo BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_setorial_diocese FOREIGN KEY (diocese_id) REFERENCES diocese (id)
);