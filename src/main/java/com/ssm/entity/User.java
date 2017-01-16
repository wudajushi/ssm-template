package com.ssm.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private Long id;

	private String name;

	private String password;

	private Date brith;

	private static final long serialVersionUID = 1L;

	public User(Long id, String name, String password, Date brith) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.brith = brith;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Date getBrith() {
		return brith;
	}

	public void setBrith(Date brith) {
		this.brith = brith;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", password=").append(password);
		sb.append(", brith=").append(brith);
		sb.append("]");
		return sb.toString();
	}
}