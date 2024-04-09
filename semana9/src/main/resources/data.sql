-- Insert sample data into livro table
INSERT INTO livro (titulo, autor, ano_publicacao)
VALUES ('The Great Gatsby', 'F. Scott Fitzgerald', 1925),
       ('To Kill a Mockingbird', 'Harper Lee', 1960),
       ('1984', 'George Orwell', 1949);

-- Insert sample data into membro table
INSERT INTO membro (nome, endereco, telefone)
VALUES ('Emily', '123 Main St', '+1122334455'),
       ('William', '456 Elm St', '+9988776655');

-- Insert sample data into emprestimos table
INSERT INTO emprestimos (livro_id, membro_id, data_emprestimo, data_devolucao)
VALUES (1, 1, '2024-02-24', '2024-03-10'),
       (2, 2, '2024-02-25', '2024-03-15');

-- Insert sample data into bibliotecario table
INSERT INTO bibliotecario (nome, email, senha)
VALUES ('Sophia', 'sophia@example.com', 'password123'),
       ('James', 'james@example.com', 'pass456');

-- Insert sample data into visitante table
INSERT INTO visitante (nome, telefone)
VALUES ('Olivia', '+777888999'),
       ('Henry', '+333222111');
