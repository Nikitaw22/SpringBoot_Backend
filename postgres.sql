CREATE TABLE load_details (
   loadid int,
   facilityid int,
   loadingpoint varchar(100) DEFAULT NULL,
   unloadingpoint varchar(100) DEFAULT NULL,
   loadingdate varchar(100) DEFAULT NULL,
   unloadingdate varchar(100) DEFAULT NULL,
   producttype varchar(100) DEFAULT NULL,
   trucktype varchar(100) DEFAULT NULL,
   nooftrucks varchar(100) DEFAULT NULL,
   weight varchar(100) DEFAULT NULL,
   comments varchar(100) DEFAULT NULL,
   shipperid int,
   date Date,
   PRIMARY KEY (loadid)
);

Select * from load_details


ALTER TABLE load_details 
ALTER COLUMN loadid SET DATA TYPE Long USING unloadingdate::Long;





