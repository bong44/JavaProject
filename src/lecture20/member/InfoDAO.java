package lecture20.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lecture18.editor.InfoModel;



public class InfoDAO { //Data Accese Object

	//기본적인 CRUD 구현
	
	public List<InfoModel> selectList() {
		List<InfoModel> list = null; // InfoModel형의 list로 담을 공간 생성
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null; //CTRL + SHIFT + X
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.2:1521:xe","java","oracle"); 
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT INFO_NO, PC_NO, NM, EMAIL, HOBBY FROM INFO");
			
			list = new ArrayList<InfoModel>(); // try안에 있어줘야지 메모리 측면에서 안정적 (위에 전부다 스플릿으로 나눔)
			
			while (resultSet.next()) {
				
				int infoNo = resultSet.getInt("INFO_NO");
				String pcNo = resultSet.getString("PC_NO");
				String nm = resultSet.getString("NM");
				String email = resultSet.getString("EMAIL");
				String hobby = resultSet.getString("HOBBY");
				
				
				list.add(new InfoModel(infoNo, pcNo, nm, email, hobby)); //중요개념!! 가장많이 씀
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (resultSet != null) { //널이면 못 닫아줌
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public InfoModel select(int infoNo) {
		
		return null;
	}
	public void insert(InfoModel model) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.2:1521:xe","java","oracle"); 
			statement = connection.createStatement();
			String sql = "insert into info (info_no, pc_no, nm, email, hobby) values (info_seq.nextval,"+model.getPcNo()+","+model.getNm()+","+model.getNm()+","+model.getEmail()+","+model.getHobby()+")";
			statement.executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update(InfoModel model) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.2:1521:xe","java","oracle"); 
			statement = connection.createStatement();
			String sql = "UPDATE INFO SET HOBBY ="+;
			statement.executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	public void delete(int infoNo) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.2:1521:xe","java","oracle"); 
			statement = connection.createStatement();
			String sql = "DELETE FROM INFO WHERE INFO_NO ="+infoNo;
			statement.executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
