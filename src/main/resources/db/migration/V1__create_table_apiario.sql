create table apiario(
    id uuid not null,
    nome varchar(100) not null,
    quantidade_colmeias integer not null,
    rua varchar(100) not null,
    numero varchar(20),
    bairro varchar(100) not null,
    cidade varchar(100) not null,
    uf char(2) not null,
    pais varchar(9) not null,
    primary key(id)
);