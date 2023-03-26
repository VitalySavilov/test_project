--liquibase formatted sql

--changeset vitalik.savilov@gmail.com:1

INSERT INTO t_user_info (INFO_ID, INFO_U_FIRSTNAME, INFO_U_LASTNAME, INFO_U_PATRONYMIC, INFO_U_EMAIL)
VALUES ('1', 'Ivan', 'Ivanov', 'Ivanovich', 'ivan@gmail.com'),
       ('2', 'Petr', 'Petrov', 'Petrovich', 'petr@gmail.com'),
       ('3', 'Sergey', 'Sergeev', 'Sergeevich', 'sergey@gmail.com'),
       ('4', 'Egor', 'Egorov', 'Egorovich', 'egor@gmail.com'),
       ('5', 'Aleksey', 'Alekseev', 'Alekseevich', 'aleksey@gmail.com'),
       ('6', 'Igor', 'Igorev', 'Igorevich', 'igor@gmail.com'),
       ('7', 'Semen', 'Semenov', 'Semenovich', 'semen@gmail.com'),
       ('8', 'Roman', 'Romanov', 'Romanovich', 'roman@gmail.com'),
       ('9', 'Timofei', 'Timofeev', 'Timofeevich', 'timofei@gmail.com'),
       ('10', 'Denis', 'Denisov', 'Denisovich', 'denis@gmail.com'),
       ('11', 'Fedor', 'Fedorov', 'Fedorovich', 'fedor@gmail.com'),
       ('12', 'Artem', 'Artemov', 'Artemovich', 'artem@gmail.com'),
       ('13', 'Pavel', 'Pavlov', 'Pavlovich', 'pavel@gmail.com'),
       ('14', 'Oleg', 'Olegov', 'Olegovich', 'oleg@gmail.com'),
       ('15', 'Mark', 'Markov', 'Markovich', 'mark@gmail.com'),
       ('16', 'Nikolay', 'Nikolaev', 'Nikolaeevich', 'nikolay@gmail.com'),
       ('17', 'Vadim', 'Vadimov', 'Vadimovich', 'vadim@gmail.com'),
       ('18', 'Ruslan', 'Ruslanov', 'Ruslanovich', 'ruslan@gmail.com'),
       ('19', 'Timur', 'Timurov', 'Timurovich', 'timur@gmail.com'),
       ('20', 'Michail', 'Michailov', 'Michailovich', 'michail@gmail.com'),
       ('21', 'Boris', 'Borisov', 'Borisovich', 'boris@gmail.com'),
       ('22', 'Viktor', 'Viktorov', 'Viktorovich', 'viktor@gmail.com'),
       ('23', 'Gleb', 'Glebov', 'Glebovich', 'gleb@gmail.com');

--changeset vitalik.savilov@gmail.com:3

INSERT INTO t_role (R_ID, U_R_NAME)
VALUES ('1', 'Administrator'),
       ('2', 'Sale User'),
       ('3', 'Customer User'),
       ('4', 'Secure API User');

--changeset vitalik.savilov@gmail.com:2

INSERT INTO t_user (USER_ID, INFO_ID, R_ID)
VALUES ('10000000-0000-0000-0000-000000000001', '1', '1'),
       ('10000000-0000-0000-0000-000000000002', '2', '2'),
       ('10000000-0000-0000-0000-000000000003', '3', '3'),
       ('10000000-0000-0000-0000-000000000004', '4', '4'),
       ('10000000-0000-0000-0000-000000000005', '5', '1'),
       ('10000000-0000-0000-0000-000000000006', '6', '2'),
       ('10000000-0000-0000-0000-000000000007', '7', '3'),
       ('10000000-0000-0000-0000-000000000008', '8', '4'),
       ('10000000-0000-0000-0000-000000000009', '9', '1'),
       ('10000000-0000-0000-0000-000000000010', '10', '2'),
       ('10000000-0000-0000-0000-000000000011', '11', '3'),
       ('10000000-0000-0000-0000-000000000012', '12', '4'),
       ('10000000-0000-0000-0000-000000000013', '13', '1'),
       ('10000000-0000-0000-0000-000000000014', '14', '2'),
       ('10000000-0000-0000-0000-000000000015', '15', '3'),
       ('10000000-0000-0000-0000-000000000016', '16', '4'),
       ('10000000-0000-0000-0000-000000000017', '17', '1'),
       ('10000000-0000-0000-0000-000000000018', '18', '2'),
       ('10000000-0000-0000-0000-000000000019', '19', '3'),
       ('10000000-0000-0000-0000-000000000020', '20', '4'),
       ('10000000-0000-0000-0000-000000000021', '21', '1'),
       ('10000000-0000-0000-0000-000000000022', '22', '2'),
       ('10000000-0000-0000-0000-000000000023', '23', '3');


