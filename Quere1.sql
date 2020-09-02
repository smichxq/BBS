USE BBS;
create TABLE TBL_USER
(
	userID INT NOT NULL PRIMARY KEY,
    userName VARCHAR(20) UNIQUE NOT NULL,
    userPass VARCHAR(20) NOT NULL,
    head VARCHAR(100) NOT NULL,
    gender smallint check(gender=1 or gender=2) default 1 NOT NULL,
    regTime datetime NOT NULL

);

create table TBL_BOARD
(
	boardId int not null primary key,
    boardName varchar(50) not null,
    parentId int not null default 0

);

create table TBL_TOPIC
(
	topicId int not null primary key,
    title varchar(50) not null,
    content varchar(1000) not null,
    publishTime datetime not null,
    modifyTime datetime not null,
    userId int not null,
    boardId int not null,
	foreign key(userId) references TBL_USER(userId)
);
