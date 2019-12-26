DROP TABLE IF EXISTS book;
 
CREATE TABLE book (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  author VARCHAR(250) DEFAULT NULL,
  publisher VARCHAR(250) DEFAULT NULL,
  year INT DEFAULT NULL
);

INSERT INTO book (name, author, publisher, year) VALUES
	('Бьярне Страуструп', 'Программирование: принципы и практика использования C++', 
	    		'Издательский дом Вильямс', '2011'),
	('Николай Прохоренок', 'Основы Java', 
	    		'БХВ-Петербург', '2017'),
	('Герберт Шилдт', 'Java. Полное руководство', 
	    		'Диалектика', '2018'),
	('Ричардсон Крис', 'Микросервисы. Паттерны разработки и рефакторинга.', 
	    		'Питер', '2019'),
	('Гриффитс Дэвид, Гриффитс Дон', 'Head First. Программирование для Android', 
	    		'Питер', '2018');
  
