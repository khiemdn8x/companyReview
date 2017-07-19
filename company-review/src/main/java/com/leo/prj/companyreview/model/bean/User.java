package com.leo.prj.companyreview.model.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.leo.prj.common.constant.DateConstant;
import com.leo.prj.common.constant.NumberConstant;
import com.leo.prj.common.constant.StringConstant;

public class User implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -8864128161034533643L;

	private long id;
	private String username;
	private String password;
	private boolean status;

	@JsonFormat(pattern = DateConstant.DATETIME_FORMAT_PATTERN)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime createdDate;

	@JsonFormat(pattern = DateConstant.DATETIME_FORMAT_PATTERN)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime updatedDate;

	public User() {
		this.id = NumberConstant.DEFAULT_LONG;
		this.username = StringConstant.EMPTY;
		this.password = StringConstant.EMPTY;
		this.status = false;
		this.createdDate = LocalDateTime.now();
		this.updatedDate = LocalDateTime.now();
	}

	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
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

	public LocalDateTime getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(final LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(final LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.createdDate == null) ? 0 : this.createdDate.hashCode());
		result = (prime * result) + (int) (this.id ^ (this.id >>> 32));
		result = (prime * result) + ((this.password == null) ? 0 : this.password.hashCode());
		result = (prime * result) + (this.status ? 1231 : 1237);
		result = (prime * result) + ((this.updatedDate == null) ? 0 : this.updatedDate.hashCode());
		result = (prime * result) + ((this.username == null) ? 0 : this.username.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		if (this.createdDate == null) {
			if (other.createdDate != null) {
				return false;
			}
		} else if (!this.createdDate.equals(other.createdDate)) {
			return false;
		}
		if (this.id != other.id) {
			return false;
		}
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
		if (this.updatedDate == null) {
			if (other.updatedDate != null) {
				return false;
			}
		} else if (!this.updatedDate.equals(other.updatedDate)) {
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
		return "User [id=" + this.id + ", username=" + this.username + ", password=" + this.password + ", status="
				+ this.status + ", createdDate=" + this.createdDate + ", updatedDate=" + this.updatedDate + "]";
	}
}
