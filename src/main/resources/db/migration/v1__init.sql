CREATE TABLE jogador (
    jg_id    INT NOT NULL AUTO_INCREMENT,
    jg_nome  VARCHAR(100) NOT NULL,
    jg_idade INT NOT NULL,
    PRIMARY KEY (jg_id)
);

CREATE TABLE equipe (
    eq_id    INT NOT NULL AUTO_INCREMENT,
    eq_nome  VARCHAR(100) NOT NULL,
    eq_cor   VARCHAR(100) NOT NULL,
    PRIMARY KEY (eq_id)
);

CREATE TABLE jogador_equipe (
    jg_id    INT NOT NULL,
    eq_id    INT NOT NULL,
    PRIMARY KEY (jg_id, eq_id)
);

INSERT INTO equipe (eq_nome, eq_cor) VALUES ("Time 1", "Vermelho");
INSERT INTO equipe (eq_nome, eq_cor) VALUES ("Time 2", "Azul");
INSERT INTO equipe (eq_nome, eq_cor) VALUES ("Time 3", "Roxo");

INSERT INTO jogador (jg_nome, jg_idade) VALUES ("Arnaldo", "21");
INSERT INTO jogador (jg_nome, jg_idade) VALUES ("Carlim", "24");
INSERT INTO jogador (jg_nome, jg_idade) VALUES ("Josias", "19");

INSERT INTO jogador_equipe VALUES (1, 1);
INSERT INTO jogador_equipe VALUES (2, 2);
INSERT INTO jogador_equipe VALUES (3, 3);