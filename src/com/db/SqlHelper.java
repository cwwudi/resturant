/**
 * 对数据库操作
 * crud和查询
 */
package com.db;

import java.sql.*;


public class SqlHelper {
	PreparedStatement ps=null;
	ResultSet rs=null;
	Connection conn=null;
	String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=restaurant";
	String user="sa";
	String psd="cw900515";
	public SqlHelper() 
	{
		
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,psd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public ResultSet query(String sql,String[] paras) {
		try {
			ps=conn.prepareStatement(sql);
			for(int i=0;i<paras.length;i++)
			{
				ps.setString(i+1, paras[i]);
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	//关闭资源
	public void close()
	{
		try {
			if(rs!=null) rs.close();
			if(ps!=null) rs.close();
			if(conn!=null) rs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
