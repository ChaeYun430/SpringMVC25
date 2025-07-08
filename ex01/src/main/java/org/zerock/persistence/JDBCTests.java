package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class JDBCTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test //메서드 단위로 테스트됨
	public void testConnection() {
	try {
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.111.104:1521:xe", "BOOK_XE", "BOOK_XE");
		log.info(conn);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	
}
