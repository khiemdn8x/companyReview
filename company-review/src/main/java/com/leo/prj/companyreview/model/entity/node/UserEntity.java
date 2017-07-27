package com.leo.prj.companyreview.model.entity.node;

import org.neo4j.ogm.annotation.NodeEntity;

import com.leo.prj.companyreview.model.entity.GraphEntity;

@NodeEntity(label = "User")
public class UserEntity extends GraphEntity {
	private String username;
	private String password;
	private boolean status;

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
	public String toString() {
		return "UserEntity [username=" + this.username + ", password=" + this.password + ", status=" + this.status
				+ ", graphId=" + this.getGraphId() + ", createdDate=" + this.getCreatedDate() + ", updatedDate="
				+ this.getUpdatedDate() + "]";
	}

}
