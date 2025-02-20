/*
	===========================
	Create database and schemas
	===========================

	Script purpose: The script creates new database named DataWarehouse after shecking if it already exists.
	If the database exists, it is dropped and recreated. Script also sets up three schemas:
	
	1. Bronze
	2. Silver
	3. Gold

WARNING: runnig this script will drop the entire DataWarehouse db if it exists.
		All data withing the database will be deleted so procede with caution and ensure to have proper backup 
		before running this script

*/


USE MASTER
GO;

--DROP AND RECREATE DATAWAREHOUSE DATABASE
IF EXISTS (SELECT 1 FROM sys.databases WHERE name = 'DataWarehouse')
BEGIN
	ALTER database DataWarehouse SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
	DROP DATABASE DataWarehouse

END
GO;


Create Database DataWarehouse;

USE DataWarehouse

--CREATION OF SCHEMAS
CREATE SCHEMA bronze;
GO
CREATE SCHEMA silver;
GO
CREATE SCHEMA gold;




