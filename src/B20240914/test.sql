create database if not exists students10121;

use students10121;

show tables ;

show databases;



create table Student
(
    sno   char(7) comment '学号',
    sname Nchar(5)              not null comment '姓名',
    sid   char(18)              null comment '身份证号',
    ssex  nchar(1) default '男' null,
    sage  tinyint(45)           null comment '年龄',
    sdept NVARCHAR(20)          null comment '所在系',
    constraint table_name_pk
        primary key (sno),
    constraint table_name_pk2
        unique (sid)
);

create table Course
(
    cno      char(6)       not null comment '课程号',
    cname    Nvarchar(20)  not null comment '课程名',
    credit   Numeric(3, 1) null comment '学分',
    Semester TINYINT       null comment '学期',
    constraint Course_pk
        primary key (cno)
);

create table SC
(
    sno   Char(7) null comment '学号',
    cno   Char(6) null comment '课程号',
    grade tinyint null comment '成绩',
    constraint SC_course_cno_fk
        foreign key (cno) references course (cno),
    constraint SC_student_sno_fk
        foreign key (sno) references student (sno)
);


