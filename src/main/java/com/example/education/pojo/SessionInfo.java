package com.example.education.pojo;

public class SessionInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String id;// 用户ID
	private String name;// 姓名
	private String loginName;// 登录名
	private String ip;// 用户IP
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

}
