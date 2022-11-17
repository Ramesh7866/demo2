use customer_database;

delimiter $$
CREATE PROCEDURE SelectAllCustomers()
BEGIN
select Customer_Name, Phone_Number from customers ;
END 
$$
 
CALL SelectAllCustomers();
 
delimiter $$
create procedure SelectAllMembers()
begin
select * from members;
end
$$
 
call SelectAllMembers();
 
call SelectAllCustomers;