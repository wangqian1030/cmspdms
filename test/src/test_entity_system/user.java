package test_entity_system;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class user{
	/**
	 * ����id����¼�˻��Լ�����
	 */
	private Integer id;
	/** ��¼�ߵ�����**/
	private String userName;
	/** ��¼�˺�**/
	private String loginCode;
	/** ��¼����**/
	private String password;
	/** ����ID*/
	private String deptId;
	/** �Ա�*/
	private Integer sex;
	/** �ֻ�����*/
	private String phone;
	/** ͷ��*/
	private String userPhoto;
	/** ������*/
	private String creator;
	/** 1���� 0ͣ��*/
	private Integer isEnable;
	/** ��¼IP*/
	private String loginIp;
	/** ����¼ʱ�� */
	private Date lastTime;
	/** �Ƿ�ɾ�� */
	private Integer isDel;
	/** ����ʱ�� */
	/** �ô�ע����Խ�ʱ�������ʽ��ҳ����������ʾ */
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
