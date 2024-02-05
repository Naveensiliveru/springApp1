package com.ashokit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	@Autowired
	 private ReportDao dao;

	 public void generateReportDao() {
		 dao.getData();
	 }
}
