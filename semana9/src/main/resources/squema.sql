-- Create livro table
CREATE TABLE livro
(
    id            BIGSERIAL PRIMARY KEY,
    titulo        VARCHAR(255) NOT NULL,
    autor         VARCHAR(255),
    anoPublicacao BIGINT
);

-- Create membro table
CREATE TABLE membro
(
    id       SERIAL PRIMARY KEY,
    nome     VARCHAR(255) NOT NULL,
    endereco VARCHAR(255),
    telefone VARCHAR(255)
);

-- Create empréstimos table
CREATE TABLE emprestimos
(
    id             BIGSERIAL PRIMARY KEY,
    livro_id       BIGINT,
    membro_id      BIGINT,
    dataEmprestimo DATE,
    dataDevolucao  DATE,
    FOREIGN KEY (livro_id) REFERENCES livro (id),
    FOREIGN KEY (membro_id) REFERENCES membro (id)
);

-- Create bibliotecario table
CREATE TABLE bibliotecario
(
    id    BIGSERIAL PRIMARY KEY,
    nome  VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    senha VARCHAR(255)
);

-- Create visitante table
CREATE TABLE visitante
(
    id       BIGSERIAL PRIMARY KEY,
    nome     VARCHAR(255),
    telefone VARCHAR(255)
);