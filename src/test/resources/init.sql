CREATE TABLE books (
	id serial PRIMARY KEY,
	name VARCHAR ( 50 ) UNIQUE NOT NULL,
	author VARCHAR ( 50 ) NOT NULL
);

insert into books(name,author) VALUES ('Harry Potter', 'JK Rowling');
insert into books(name,author) VALUES ('Eragon', 'Christopher Paolini');