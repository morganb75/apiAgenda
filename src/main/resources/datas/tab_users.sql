
-- DROP TABLE user_roles,agenda_member,agenda_event,role,dbuser,event,agenda; 

-- DELETE FROM dbuser;

-- DELETE FROM role;

INSERT INTO role (name)
VALUES
('user'),
('admin');

INSERT INTO dbuser (email, password, username)
VALUES 

('morgan.bleunven@maif.fr','password','morgan'),
('olivier.villaverde@maif.fr','password','olivier'),
('charlotte.charrier@maif.fr','password','charlotte'),
('omar.omar@maif.fr','password', 'omar'),
('jeremy.bourdeau@maif.fr','password','jeremy'),
('jerome.bouhet@maif.fr', 'password', 'jerome'),
('soumaya.benhachem@maif.fr','password','soumaya'),
('coralie.antoine@maif.fr','password','coralie'),
('marie.tranchant@maif.fr','password','marie'),
('sandrine.faucher@maif.fr', 'password','sandrine'),
('thibault.mesmin@maif.fr', 'password','thibault'),
('jeancharles.audebert@maif.fr', 'password','jeancharles');

INSERT INTO user_roles (user_id,role_id)
VALUES
(1,1),(1,2),(3,1),(4,1),(5,1),(6,1),(7,1),(8,1),(9,1),(10,1),(11,1),(12,1);

