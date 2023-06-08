CREATE TABLE student (
  SNO VARCHAR(20),
 Name VARCHAR(10),
  age INTEGER,
  College VARCHAR(50)
);

INSERT INTO student (SNO, Name, age, College)
VALUES ('s001', '老大', 20, '计算机学院'),
       ('s002', '老二', 19, '计算机学院'),
       ('s003', '老三', 18, '计算机学院'),
       ('s004', '老四', 17, '计算机学院');

SELECT * FROM student;

DELETE FROM student WHERE SNO = 's004';

SELECT * FROM student WHERE SNO = 's003';

UPDATE student SET College = '通信学院' WHERE SNO = 's001';


