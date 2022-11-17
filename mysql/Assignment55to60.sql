create database customer_database;

use customer_database;

create table Customers(
    Customer_ID int not null,
    Customer_Name varchar(25),
    Phone_Number int,
    Address varchar(255),
    City varchar(25),
    Country varchar(25)
);

create view Hyd_Customers as 
select Customer_Name, Phone_Number 
from 
Customers 
where
City = "Hyderabad";


drop view Hyd_Customers;
drop table Customers;
drop database customer_database;


alter table customers
add column Gender varchar(25);
 
alter table customers
drop column Gender;
 
alter table customers
modify Phone_Number int;
 
truncate table customers;
 
insert into customers(Customer_ID, Customer_Name, Phone_Number, Address, City, Country)
values (1, "Sai Dheeraj", 1285698, "Akhila Enclave", "Hyderbad","India");

insert into customers(Customer_ID, Customer_Name, Phone_Number, Address, City, Country)
values (2, "Rohit", 987634, "Beerumguda", "Goa","India");

insert into customers(Customer_ID, Customer_Name, Phone_Number, Address, City, Country)
values (3, "D Dheeraj", 7827783, "kukatpally", "Bihar","India");


 
update customers
set Address = "17 Nehru Road" where customer_id = 1;
 
select * from customers;
select Customer_Name, City from customers;
 
select * from customers where Customer_Name like "d%";