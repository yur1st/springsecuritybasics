DROP TABLE users;
DROP TABLE authorities;
DROP TABLE customer;
DROP TABLE cards;



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

CREATE TABLE cards
(
    card_id          INt         NOT NULL AUTO_INCREMENT,
    customer_id      INT         NOT NULL,
    card_number      VARCHAR(50) NOT NULL,
    card_type        VARCHAR(50) NOT NULL,
    total_limit      INT         NOT NULL,
    amount_used      INT         NOT NULL,
    available_amount INT         NOT NULL,
    create_date      INT         NOT NULL,
    PRIMARY KEY (customer_id)
)


