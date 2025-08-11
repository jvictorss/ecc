CREATE SEQUENCE sq_casal_id START WITH 1 INCREMENT BY 1;

    CREATE TABLE casal (
        id BIGINT PRIMARY KEY DEFAULT nextval('sq_casal_id'),
        nome_ele VARCHAR(255) NOT NULL,
        apelido_ele VARCHAR(255) NOT NULL,
        telefone_ele VARCHAR(20) NOT NULL,
        email_ele VARCHAR(255) NOT NULL,
        data_nascimento_ele DATE NOT NULL,
        data_falecimento_ele DATE,
        nome_ela VARCHAR(255) NOT NULL,
        apelido_ela VARCHAR(255) NOT NULL,
        telefone_ela VARCHAR(20) NOT NULL,
        email_ela VARCHAR(255) NOT NULL,
        data_nascimento_ela DATE NOT NULL,
        data_falecimento_ela DATE,
        data_casamento_religioso DATE,
        data_casamento_civil DATE NOT NULL,
        endereco VARCHAR(255) NOT NULL,
        bairro VARCHAR(255) NOT NULL,
        cidade VARCHAR(255) NOT NULL,
        estado VARCHAR(255) NOT NULL,
        paroquia_ecc VARCHAR(255) NOT NULL,
        paroquia_atual VARCHAR(255),
        data_primeira_etapa DATE NOT NULL,
        data_segunda_etapa DATE,
        data_terceira_etapa DATE,
        is_active BOOLEAN
    );