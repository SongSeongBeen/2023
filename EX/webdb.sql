--system에서 명령어 입력
--1아이디 비번입력 계정생성
create user webdb identified by 1234;    
--2접속 권한 부여
grant resource, connect to webdb;
--3 비번변경
alter user webdb identified by webdb;