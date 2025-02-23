/*
	CREATING TABLES silver LAYER:
	
	Tables Names:
		1. silver.crm_cust_info
		2. silver.crm_prd_info
		3. silver.crm_sales_details
		4. silver.erp_cust_az12
		5. silver.erp_px_cat_g1v2
		6. silver.erp_loc_a101

*/


IF OBJECT_ID ('silver.crm_cust_info', 'U') IS NOT NULL
	DROP TABLE silver.crm_cust_info
CREATE TABLE silver.crm_cust_info(
	cust_id INT,
	cst_key NVARCHAR(255),
	cst_firstname NVARCHAR(255),
	cst_lastname NVARCHAR(255),
	cst_maritial_status NVARCHAR(10),
	cst_gndr INT,
	cst_create_date DATE,
	dwh_create_date DATETIME2 DEFAULT GETDATE()
);

IF OBJECT_ID ('silver.crm_prd_info', 'U') IS NOT NULL
	DROP TABLE silver.crm_prd_info
CREATE TABLE silver.crm_prd_info(
	prd_id INT,
	prd_key NVARCHAR(255),
	prd_nm NVARCHAR(255),
	prd_cost INT,
	prd_line NVARCHAR(10),
	prd_start_dt DATE,
	prd_end_dt DATE,
	dwh_create_date DATETIME2 DEFAULT GETDATE()
);

IF OBJECT_ID ('silver.crm_sales_details', 'U') IS NOT NULL
	DROP TABLE silver.crm_sales_details
CREATE TABLE silver.crm_sales_details(
	sls_ord_num NVARCHAR(255),
	sls_prd_key NVARCHAR(255),
	sls_cust_id INT,
	sls_order_dt INT,
	sls_ship_dt INT,
	sls_due_dt INT,
	sls_sales INT,
	sls_quantity INT,
	sls_price INT,
	dwh_create_date DATETIME2 DEFAULT GETDATE()
);

IF OBJECT_ID ('silver.erp_cust_az12', 'U') IS NOT NULL
	DROP TABLE silver.erp_cust_az12
CREATE TABLE silver.erp_cust_az12(
	CID NVARCHAR(255),
	BDATE DATE,
	GEN NVARCHAR(255),
	dwh_create_date DATETIME2 DEFAULT GETDATE()

);

IF OBJECT_ID ('silver.erp_loc_a101', 'U') IS NOT NULL
	DROP TABLE silver.erp_loc_a101
CREATE TABLE silver.erp_loc_a101(
	CID NVARCHAR(255),
	CNTRY NVARCHAR(255),
	dwh_create_date DATETIME2 DEFAULT GETDATE()
);

IF OBJECT_ID ('silver.erp_px_cat_g1v2', 'U') IS NOT NULL
	DROP TABLE silver.erp_px_cat_g1v2
CREATE TABLE silver.erp_px_cat_g1v2(
	ID NVARCHAR(255),
	CAT NVARCHAR(255),
	SUBCAT NVARCHAR(255),
	MAINTENANCE NVARCHAR(255),
	dwh_create_date DATETIME2 DEFAULT GETDATE()
);








