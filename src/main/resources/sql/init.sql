DROP TABLE users;
DROP TABLE authorities;
DROP TABLE customer;



CREATE TABLE users
(
    id       INT         NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    enabled  INT         NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE authorities
(
    id        INT         NOT NULL AUTO_INCREMENT,
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE customer
(
    id    INT          NOT NULL AUTO_INCREMENT,
    email varchar(50)  NOT NULL,
    pwd   varchar(200) NOT NULL,
    role  varchar(50)  NOT NULL,
    PRIMARY KEY (id)
);