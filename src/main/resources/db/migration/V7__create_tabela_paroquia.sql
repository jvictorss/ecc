CREATE SEQUENCE sq_paroquia_id START WITH 1 INCREMENT BY 1;

        CREATE TABLE paroquia (
            id BIGINT PRIMARY KEY DEFAULT nextval('sq_paroquia_id'),
            nome_paroquia VARCHAR(255) NOT NULL,
            cidade VARCHAR(255) NOT NULL,
            setorial VARCHAR(255) NOT NULL,
            estado VARCHAR(255) NOT NULL,
            diocese_id BIGINT NOT NULL,
            observacao TEXT,
            CONSTRAINT fk_paroquia_diocese FOREIGN KEY (diocese_id) REFERENCES diocese (id)
        );