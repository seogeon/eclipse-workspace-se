package dao.address.fourth;
/*
 * 
 * Connection을 생성하고 해지하는역할을하는 클래스
 *  Dao 객체들이 사용
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
	
	public Connection getConnection( ) throws Exception {
		/*********************DB접속정보*********************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper42";
		String password = "javadeveloper42";
		/*******************************************/
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	public void releaseConnection(Connection con)throws Exception {
		
		con.close();
	}

	
	
}
