package com.ashokit.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("dao")
@Primary
public class OracleDbReportDao implements ReportDao {

	
	public void getData() {
		System.out.println("getting data fro oracleDb");
		
	}

}
