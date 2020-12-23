
Create TABLE TourArea_tb (
   name   varchar2(50) constraint tour_area_pk   primary key    --이름
   ,fee   number   NOT NULL     --가격
   ,starttime   number   NOT NULL   --오픈시간
   ,closetime   number   NOT NULL   --마감시간
   ,subwayLine   number   NOT NULL      --지하철 호선
   ,parking   number   NOT NULL     --주차여부
    ,Language   number not NULL     --언어

    
CREATE TABLE Castle (
    name   varchar2(50) CONSTRAINT TourArea_fk1  references TourArea_tb(name)   --이름
   ,birth   number    NoT NULL  --생성연도
   ,King   varchar2(50)   NoT NULL  --지여진 시기의 왕
    ,cNum number constraint PK_cNum primary key     --성 번호
    );
    
    
CREATE TABLE Park (
    name   varchar2(50) CONSTRAINT TourArea_fk2 references TourArea_tb(name)    --이름
   ,Location   varchar2(100)    NOT NULL    --지역
   ,manageOffice   number   NOT NULL    --관리실 수
    ,pNum number constraint PK_pNum primary key     --공원번호
);


insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('경복궁',1000,09,18,1,0,0);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('창경궁',2000,10,19,2,0,0);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('광화문',2500,10,20,3,0,0);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('キョンボックン',1000,09,18,1,0,1);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('チャンギョングン',2000,10,19,2,0,1);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('光化門',2500,10,20,3,0,1);

