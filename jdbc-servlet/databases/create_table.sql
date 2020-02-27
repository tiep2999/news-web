create database newsweb;

use newsweb;

create table user (
	id bigint not null primary key auto_increment,
    role_id bigint not null,
    username varchar(255) not null,
    password varchar(255) not null,
    createddate timestamp NULL,
    modfieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
 );
 
create table news (
	id bigint primary key not null auto_increment,
    category_id bigint not null,
    title varchar(255) null,
    summary text null,
    content text null,
    thumbnail varchar(255) null,
	createddate timestamp null,
    modfieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
 );
 
create table role (
	id bigint primary key not null auto_increment,
    name varchar(255) not null,
    code varchar(255) not null,
    createddate timestamp NULL,
    modfieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
 );
 
 create table category (
	id bigint primary key not null auto_increment,
    name varchar(255) not null,
    code varchar(255) not null,
    createddate timestamp NULL,
    modfieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
 );
 
create table comment (
	id bigint not null primary key auto_increment,
    content text null,
    user_id bigint not null,
    news_id bigint not null,
    createddate timestamp NULL,
    modfieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null    
 );
 
alter table user add constraint ft_user_role foreign key (role_id) references role(id);
 
alter table news add constraint ft_news_category foreign key (category_id) references category(id);

alter table comment add constraint ft_comment_news foreign key(news_id) references news(id);

alter table comment add constraint ft_comment_user foreign key(user_id) references user(id);
