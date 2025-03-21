package com.jts.Spring.project.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="load_details")
@Getter
@Setter
public class Load {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Ensure ID is auto-generated
    @Column(name = "loadid")
	private long loadid;
	
	private int facilityid;
	
	private String producttype;
	
	private String trucktype;
	
	private String nooftrucks;
	
	private String weight;
	
	private String comments;
	
	private int shipperid;
	
	private Date date;
	
	private String loadingpoint;
	
	private String unloadingpoint;
	
	private Date loadingdate;
	
	private Date unloadingdate;

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setload_id(Object getload_id) {
		// TODO Auto-generated method stub
		
	}

	public Object getload_id() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
