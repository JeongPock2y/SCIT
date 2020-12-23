--[역량평가_Mybatis_서점]
create table book (
	bnum 	number 			    primary key,	--상품 일련번호
	title 		varchar2(50) 	not null,  		--제목
	author 		varchar2(50) 	not null, 		--저자
	publisher 	varchar2(50) 	not null,  		--출판사
	price	    number          default 0, 	    --가격
	inputdate 	date 	        default sysdate 		--입력한 날짜
);

create sequence bookseq;




