use customer_database;
/*Assignment 62*/
select 
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from
    members m
inner join committees c on c.name = m.name;


 /*Assignment 63*/
select
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from
    members m right join committees c on c.name = m.name;  



/*Assignment 64*/
select
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from
    members m left join committees c on c.name = m.name; 
 

/*Assignment 65*/
select
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from
    members m cross join committees c;    