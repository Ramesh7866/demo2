use customer_database;


/* assingment 61*/
CREATE TABLE members (

    member_id INT AUTO_INCREMENT,

    name VARCHAR(100),

    PRIMARY KEY (member_id)

);

CREATE TABLE committees (

    committee_id INT AUTO_INCREMENT,

    name VARCHAR(100),

    PRIMARY KEY (committee_id)

);

insert into members(name) 
values ("Abhiram"), ("Aditya"), ("Arvind"), ("Anil"), ("Shreevidya"), ("Harshil") ;
 
insert into committees(name)
values("Abhiram"), ("Shreevidya"), ("Sumanth"), ("Deekshitha");

select * from members;
select * from committees;



