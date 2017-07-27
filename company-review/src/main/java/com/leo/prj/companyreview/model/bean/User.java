package com.leo.prj.companyreview.model.bean;

import com.leo.prj.common.constant.StringConstant;

public class User extends Bean {
	/**
	 *
	 */
	private static final long serialVersionUID = -8864128161034533643L;

	private String username;
	private String password;
	private boolean status;

	public User() {
		super();
		this.username = StringConstant.EMPTY;
		this.password = StringConstant.EMPTY;
		this.status = false;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(final boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = (prime * result) + ((this.password == null) ? 0 : this.password.hashCode());
		result = (prime * result) + (this.status ? 1231 : 1237);
		result = (prime * result) + ((this.username == null) ? 0 : this.username.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		if (this.password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!this.password.equals(other.password)) {
			return false;
		}
		if (this.status != other.status) {
			return false;
		}
		if (this.username == null) {
			if (other.username != null) {
				return false;
			}
		} else if (!this.username.equals(other.username)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "User [username=" + this.username + ", password=" + this.password + ", status=" + this.status + ", id="
				+ this.getId() + ", createdDate=" + this.getCreatedDate() + ", updatedDate=" + this.getUpdatedDate()
				+ "]";
	}

}
