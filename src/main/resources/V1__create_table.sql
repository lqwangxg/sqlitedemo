----------------------------------------------------
--AUTHOR:LQWAN
--CREATE DATE:2020/04/01
----------------------------------------------------
DROP TABLE IF EXISTS `QUESTION`;
CREATE TABLE `QUESTION` (
	`ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ,
	`TITLE` VARCHAR(500) NULL DEFAULT NULL ,
	`TYPE` INTEGER(2) NOT NULL DEFAULT 0 
)
;
DROP TABLE IF EXISTS `QUESTION_IMAGE`;
CREATE TABLE `QUESTION_IMAGE` (
	`ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ,
	`QID` INTEGER NOT NULL ,
	`URI` VARCHAR(500) NULL DEFAULT NULL 
)


;
DROP TABLE IF EXISTS `QUESTION_CASE`;
CREATE TABLE `QUESTION_CASE` (
	`ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ,
	`QID` INTEGER NOT NULL ,
	`CASETEXT` VARCHAR(500) NULL DEFAULT NULL ,
	`FLAG` INTEGER(1) NOT NULL DEFAULT 0 
)


;
DROP TABLE IF EXISTS `QUESTION_CASE_DESC`;
CREATE TABLE `QUESTION_CASE_DESC` (
	`ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ,
	`QID` INTEGER NOT NULL ,
	`CID` INTEGER NOT NULL ,
	`DESC` VARCHAR(500) NULL DEFAULT NULL 
)


;