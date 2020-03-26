use newsweb;

insert into role (code, name) value ('admin', 'quản trị');
insert into role (code, name) value ('user', 'người dùng');

insert into user (role_id, fullname, username, password, status) value (1, 'quản trị viên', 'admin', '12345', 1);
insert into user (role_id, fullname, username, password, status) value (2, 'người dùng 1', 'user1', '12345', 1);
insert into user (role_id, fullname, username, password, status) value (2, 'người dùng 2', 'user2', '12345', 1);
insert into user (role_id, fullname, username, password, status) value (2, 'người dùng 3', 'user3', '12345', 1);

insert into category (name, code) value ('chinh-tri', 'chính trị');
insert into category (name, code) value ('the-thao', 'thể thao');
insert into category (name, code) value ('van-hoa', 'văn hóa');
insert into category (name, code) value ('giai-tri', 'giải trí');
insert into category (name, code) value ('quoc-te', 'quốc tế');
insert into category (name, code) value ('giao-thong', 'giao thông');

