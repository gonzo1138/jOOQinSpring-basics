create table database_entity
(
    number_field bigint,
    text_field   varchar(255),
    id           bigint not null
        constraint database_entity_pkey
            primary key
);

alter table database_entity
    owner to dbuser;