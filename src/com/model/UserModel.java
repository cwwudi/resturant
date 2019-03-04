package com.model;

import java.sql.ResultSet;

import com.db.SqlHelper;

public class UserModel {
	/**
	 * 
	 * @param id 用户编号
	 * @param psd密码
	 * @return用户职位 用户不存在返回空
	 */
	SqlHelper sh;
	String zhiwei="";
public String checkUser(String id,String psd) {
	
	try {
		sh=new SqlHelper();
		String[] paras= {id,psd};
		String sql="select rszl.zhiwei from login,rszl where login.empid=rszl.empid and rszl.empid=? and passwd=?";
		ResultSet rs=sh.query(sql, paras);
		if(rs.next())
		{
			zhiwei=rs.getString(1);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		sh.close();
	}
	return zhiwei;
}
}
