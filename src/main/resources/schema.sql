create table if not exists Food (
    id bigint not null,
    name varchar(30) not null,
    type varchar(30) not null,
    price decimal not null
);

create sequence HIBERNATE_SEQUENCE start with 1 increment by 1;