create database Mock
use Mock
go

insert into Role(authority) values('admin')
insert into Role(authority) values('user')
go

INSERT INTO [dbo].[Users]([password],[user_name],[role_id])VALUES('25d55ad283aa400af464c76d713c07ad','PhucLQ',1)
INSERT INTO [dbo].[Users]([password],[user_name],[role_id])VALUES('25d55ad283aa400af464c76d713c07ad','TuanNN9',1)
INSERT INTO [dbo].[Users]([password],[user_name],[role_id])VALUES('25d55ad283aa400af464c76d713c07ad','SonNH35',2)
INSERT INTO [dbo].[Users]([password],[user_name],[role_id])VALUES('25d55ad283aa400af464c76d713c07ad','BaoNV8',2)
GO

insert into Subject values('Java')
insert into Subject values('Hibernate')
insert into Subject values('Jsp')
insert into Subject values('Servlet')
go

insert into Course values('Collection',1)
insert into Course values('OOP',1)
insert into Course values('String',1)
insert into Course values('ORM',2)
insert into Course values('SessionFactory',2)
insert into Course values('Transaction',2)
go

insert into Level(level_name) values('easy')
insert into Level(level_name) values('medium')
insert into Level(level_name) values('hard')
go
select * from Users


