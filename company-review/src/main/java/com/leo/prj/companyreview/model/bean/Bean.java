package com.leo.prj.companyreview.model.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.leo.prj.common.constant.*;

public abstract class Bean implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -4089689919145950185L;

	private long id;

	@JsonFormat(pattern = DateConstant.DATETIME_FORMAT_PATTERN)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime createdDate;

	@JsonFormat(pattern = DateConstant.DATETIME_FORMAT_PATTERN)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime updatedDate;

	public Bean() {
		this.id = NumberConstant.DEFAULT_LONG;
		this.createdDate = LocalDateTime.now();
		this.updatedDate = LocalDateTime.now();
	}

	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
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
		result = (prime * result) + ((this.updatedDate == null) ? 0 : this.updatedDate.hashCode());
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
		Bean other = (Bean) obj;
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
		if (this.updatedDate == null) {
			if (other.updatedDate != null) {
				return false;
			}
		} else if (!this.updatedDate.equals(other.updatedDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Bean [id=" + this.id + ", createdDate=" + this.createdDate + ", updatedDate=" + this.updatedDate + "]";
	}
}
