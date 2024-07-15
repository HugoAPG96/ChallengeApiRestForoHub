CREATE TABLE topicos (
    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensaje varchar(250) not null unique,
    fecha_creacion datetime not null default current_timestamp,
    autor varchar(100) not null,
    curso varchar(150) not null,
    primary key(id)
);

