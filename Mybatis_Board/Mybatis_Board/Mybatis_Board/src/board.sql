
--게시판 글정보 테이블
create table board (
	boardnum 	number 			primary key,	--게시글 일련번호
	name 		varchar2(20) 	not null,  		--작성자 이름
	title 		varchar2(200) 	not null, 		--글제목
	content 	varchar2(2000) 	not null,  		--글내용
	hits 		number default 0, 				--조회수
	indate 		date default sysdate 			--작성일
);

--게시판 글 일련번호에 사용할 시퀀스 생성
create sequence boardseq;

--게시판 글 저장 예
insert into board (boardnum, name, title, content)
values (boardseq.nextval, '홍길동', '글제목', '글내용입니다.');

