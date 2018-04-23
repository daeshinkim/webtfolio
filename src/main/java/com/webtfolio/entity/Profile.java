package com.webtfolio.entity;

import java.util.Date;

public class Profile {

	private String accountId;
	private String name;
	private String gender;
	private Date birthday;
	private String address;
	private String school;
	private String major;
	private String phone;
	private String email;
	private Date regDate;
	
	private Account account;
	private LanguageCert languageCert;
	private Certificate certificate;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(String accountId, String name, String gender, Date birthday, String address, String school,
			String major, String phone, String email) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.school = school;
		this.major = major;
		this.phone = phone;
		this.email = email;
	}

	public Profile(String accountId, String name, String gender, Date birthday, String address, String school,
			String major, String phone, String email, Date regDate) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.school = school;
		this.major = major;
		this.phone = phone;
		this.email = email;
		this.regDate = regDate;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public LanguageCert getLanguageCert() {
		return languageCert;
	}

	public void setLanguageCert(LanguageCert languageCert) {
		this.languageCert = languageCert;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

}