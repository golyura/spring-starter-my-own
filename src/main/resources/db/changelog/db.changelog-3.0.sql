--liquibase formatted sql

--changeset golyura:1
ALTER TABLE users
ADD COLUMN image VARCHAR(64);

--changeset golyura:2
ALTER TABLE users_aud
ADD COLUMN image VARCHAR(64);