/*
	These scripts inserts the data in BULK.
	First it TRUNCATES the table and then loads the data in BULK.
	This called FULL-LOAD
*/


--Creating Stored Procedure (frequently used sql scripts)

CREATE OR ALTER PROCEDURE bronze.load_bronze AS
BEGIN

	DECLARE @start_time DATETIME, @end_time DATETIME
	BEGIN TRY
		SET @start_time = GETDATE();
		PRINT('====================================');
		PRINT('LOADING crm_cust_info');
		
		SET @start_time = GETDATE();
		TRUNCATE TABLE bronze.crm_cust_info
		BULK INSERT bronze.crm_cust_info
		FROM 'E:\Road-to-DS-2024\Data Engg\Projects\sql-data-warehouse-project\datasets\source_crm\cust_info.csv'
		WITH(
			FIRSTROW = 2,
			FIELDTERMINATOR=',',
			TABLOCK
		);
		PRINT('====================================');
		PRINT('LOADING prd_info');
		PRINT('====================================');
		
		SET @start_time = GETDATE();
		BULK INSERT bronze.crm_prd_info
		FROM 'E:\Road-to-DS-2024\Data Engg\Projects\sql-data-warehouse-project\datasets\source_crm\prd_info.csv'
		WITH(
			FIRSTROW = 2,
			FIELDTERMINATOR=',',
			TABLOCK
		);
		SET @end_time = GETDATE();
		PRINT '>> Load duration: '+ CAST(DATEDIFF(SECOND, @start_tiime,@end_time) AS NVARCHAR) + 'seconds'

		PRINT('====================================');
		PRINT('LOADING sales_details');
		PRINT('====================================');
		SET @start_time = GETDATE();
		BULK INSERT bronze.crm_sales_details
		FROM 'E:\Road-to-DS-2024\Data Engg\Projects\sql-data-warehouse-project\datasets\source_crm\sales_details.csv'
		WITH(
			FIRSTROW = 2,
			FIELDTERMINATOR=',',
			TABLOCK
		);
		SET @end_time = GETDATE();
		PRINT '>> Load duration: '+ CAST(DATEDIFF(SECOND, @start_tiime,@end_time) AS NVARCHAR) + 'seconds'

		PRINT('====================================');

		PRINT('LOADING CUST_AZ12');
		PRINT('====================================');
		SET @start_time = GETDATE();
		BULK INSERT bronze.erp_cust_az12
		SET @start_time = GETDATE();
		FROM 'E:\Road-to-DS-2024\Data Engg\Projects\sql-data-warehouse-project\datasets\source_erp\CUST_AZ12.csv'
		WITH(
			FIRSTROW = 2,
			FIELDTERMINATOR=',',
			TABLOCK
		);
		SET @end_time = GETDATE();
		PRINT '>> Load duration: '+ CAST(DATEDIFF(SECOND, @start_tiime,@end_time) AS NVARCHAR) + 'seconds'
		PRINT('====================================')

		PRINT('LOADING LOC_A101');
		PRINT('====================================');
		BULK INSERT bronze.erp_loc_a101
		SET @start_time = GETDATE();
		FROM 'E:\Road-to-DS-2024\Data Engg\Projects\sql-data-warehouse-project\datasets\source_erp\LOC_A101.csv'
		WITH(
			FIRSTROW = 2,
			FIELDTERMINATOR=',',
			TABLOCK
		);
		SET @end_time = GETDATE();
		PRINT '>> Load duration: '+ CAST(DATEDIFF(SECOND, @start_tiime,@end_time) AS NVARCHAR) + 'seconds'
		PRINT('====================================');

		PRINT('LOADING LOC_A101');
		PRINT('====================================');
		BULK INSERT bronze.erp_px_cat_g1v2
		SET @start_time = GETDATE();
		FROM 'E:\Road-to-DS-2024\Data Engg\Projects\sql-data-warehouse-project\datasets\source_erp\PX_CAT_G1V2.csv'
		WITH(
			FIRSTROW = 2,
			FIELDTERMINATOR=',',
			TABLOCK
);
		SET @end_time = GETDATE();
		PRINT '>> Load duration: '+ CAST(DATEDIFF(SECOND, @start_tiime,@end_time) AS NVARCHAR) + 'seconds'
	PRINT('====================================');
	SET @end_time = GETDATE();
	PRINT '>> Load duration: '+ CAST(DATEDIFF(SECOND, @start_tiime,@end_time) AS NVARCHAR) + 'seconds'
	END TRY
	BEGIN CATCH
		PRINT('ERROR OCCURED DURING LOADING BRONZE LAYER');
		PRINT('ERROR MESSAGE' + ERROR_MESSAGE());
		PRINT('ERROR MESSAGE' + ERROR_NUMBER());
	END CATCH
END



/*
	Loading db over here is superfast as we are doing it locally unlike in projects where we load data from 
	different servers and data size which we are using is small
/*