package com.dao;

import javax.sql.DataSource;

public class BoardDAO {
	DataSource dataFactory;
	
	public EmpDAO() {
		try {
			Context ctx = new initialContext();
			dataFactory = (DataSource)ctx.lookup("java:comp/env/jdbc/Oracle11g");
		}
	}
}
