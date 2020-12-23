create table userinfo(
    id  varchar2(20) primary key 
    ,name varchar2(20) NOT NULL  
    ,Gender char(1) default 'M'
    );
    drop table userinfo;
insert into
    userinfo(
        id
        ,name
        ,gender
        )values(
        '1'
        ,'11'
        ,1
        );
    rollback;
    
create table useraddr(
    id  varchar2(20) CONSTRAINT userinfo_fk  references userinfo(id)
    ,phone varchar2(50) NOT NULL  
    ,Address varchar2(100) NOT NULL 
    );
insert into
    useraddr(
        id
        ,phone
        ,Address
        )values(
        '1'
        ,'11'
        ,'010'
        
       
        );
        rollback;
        
        SELECT
        i.id
        ,i.name
        ,i.gender
        ,a.phone
        ,a.Address
from
    userinfo i,useraddr a
where
    i.id = a.id;

    
    
    


