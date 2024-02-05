package com.ashokit.bean;

import org.springframework.stereotype.Repository;

@Repository
public class MySQLDBReportDao implements ReportDao {

	public void getData() {
		System.out.println("getting data from mysql Db.....");
		
	}

}
