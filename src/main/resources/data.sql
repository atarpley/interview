DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(250) NOT NULL,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);

INSERT INTO users (username, firstname, lastname, password) VALUES
  ('user1', 'John', 'Last', 'changeme'),
  ('user2', 'Jake', 'Last', 'changeme'),
  ('user3', 'Michael', 'Last', 'changeme'),
  ('user4', 'Wilbur', 'Last', 'changeme'),
  ('user5', 'Sam', 'Last', 'changeme'),
  ('user6', 'Jose', 'Last', 'changeme'),
  ('user7', 'Sally', 'Last', 'changeme'),
  ('user8', 'Alberta', 'Last', 'changeme'),
  ('user9', 'Maria', 'Last', 'changeme');