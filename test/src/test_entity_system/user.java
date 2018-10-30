package test_entity_system;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class user{
	/**
	 * 定义id，登录账户以及密码
	 */
	private Integer id;
	/** 登录者的名字**/
	private String userName;
	/** 登录账号**/
	private String loginCode;
	/** 登录密码**/
	private String password;
	/** 部门ID*/
	private String deptId;
	/** 性别*/
	private Integer sex;
	/** 手机号码*/
	private String phone;
	/** 头像*/
	private String userPhoto;
	/** 创建人*/
	private String creator;
	/** 1启用 0停用*/
	private Integer isEnable;
	/** 登录IP*/
	private String loginIp;
	/** 最后登录时间 */
	private Date lastTime;
	/** 是否删除 */
	private Integer isDel;
	/** 创建时间 */
	/** 用词注解可以将时间戳的形式在页面上正常显示 */
	@JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Integer getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

}
