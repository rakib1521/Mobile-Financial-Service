Alter login sa with password = 'ra123456'
CREATE DATABASE MFS;
use MFS;

drop table UserInfo;
drop table BlanceTable;
drop table TrixTable;
drop table ProfitTable;



Create table UserInfo
(
	UserId int identity(20001,1) primary key,
	PhoneNo int unique not null,
	FirstName varchar(50) not null,
	LastName varchar(50) not null,
	MiddleName varchar(50) null,
	DateOfBirth varchar(10) not null,
	NationalId varchar(20) null,
	BirthCertificate varchar(20) null,
	PresentAddress varchar(50) not null,
	PremanentAddress varchar(50) not null,
	PasswordNo varchar(20) not null,
	ReferenceId varchar(20) not null,
	AccountType int not null
	
);




insert into UserInfo values(112233,'admin','admin','admin','1996-11-26','1234567','9876543','mohakhali','dhaka','1234','5678',3);



Create table TrixTable
(
	TrxID int identity(50000,1) primary key,
	UserId int FOREIGN KEY REFERENCES UserInfo(UserId)  not null,
	SenderId varchar(50) not null,
	ReciverId varchar(50) not null,
	TrixType varchar(50) not null,
	Ammount float not null,
	TrixDate Date not null
	
	
);





Create table BlanceTable
(
	BlanceID int identity(70000,1) primary key,
	UserId int FOREIGN KEY REFERENCES UserInfo(UserId)  not null,
	CurrentBlance float not null 

	
	
	
);


Create table ProfitTable
(
	ProfitID int identity(110000,1) primary key,
	UserId int FOREIGN KEY REFERENCES UserInfo(UserId)  not null,
	SenderId varchar(50) not null,
	TrixType varchar(50) not null,
	Ammount float not null,
	TrixDate Date not null
	
	
);




select * from BlanceTable;
select * from TrixTable;
select * from UserInfo;
select * from ProfitTable;






