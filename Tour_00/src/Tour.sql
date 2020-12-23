
Create TABLE TourArea_tb (
   name   varchar2(50) constraint tour_area_pk   primary key    --�̸�
   ,fee   number   NOT NULL     --����
   ,starttime   number   NOT NULL   --���½ð�
   ,closetime   number   NOT NULL   --�����ð�
   ,subwayLine   number   NOT NULL      --����ö ȣ��
   ,parking   number   NOT NULL     --��������
    ,Language   number not NULL     --���

    
CREATE TABLE Castle (
    name   varchar2(50) CONSTRAINT TourArea_fk1  references TourArea_tb(name)   --�̸�
   ,birth   number    NoT NULL  --��������
   ,King   varchar2(50)   NoT NULL  --������ �ñ��� ��
    ,cNum number constraint PK_cNum primary key     --�� ��ȣ
    );
    
    
CREATE TABLE Park (
    name   varchar2(50) CONSTRAINT TourArea_fk2 references TourArea_tb(name)    --�̸�
   ,Location   varchar2(100)    NOT NULL    --����
   ,manageOffice   number   NOT NULL    --������ ��
    ,pNum number constraint PK_pNum primary key     --������ȣ
);


insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('�溹��',1000,09,18,1,0,0);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('â���',2000,10,19,2,0,0);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('��ȭ��',2500,10,20,3,0,0);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('�����ܫë���',1000,09,18,1,0,1);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('����󫮫�󫰫�',2000,10,19,2,0,1);
insert into TourArea_tb(name,fee,starttime,closetime,subwayLine,parking)values('����ڦ',2500,10,20,3,0,1);

