package basic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class AddressInsertMain {

	public static void main(String[] args) throws Exception{
		
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper12";
		String password = "javadeveloper12";
		
		/************************************/
		String insertSql= "insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";

				
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		/*
		 * 4.statement 객체를 사용해sql문 전송 (dml)
		 * 
		 */
	    int insertRowCount= stmt.executeUpdate(insertSql);
	    System.out.println(">> "+insertRowCount + "행 insert");
	    stmt.close();
		con.close();
				
				
				
	}

}
