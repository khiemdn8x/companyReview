package com.leo.prj.companyreview.model.entity;

import java.util.Date;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

public class GraphEntity {
	@GraphId
	private Long graphId;

	@DateLong
	private Date createdDate;

	@DateLong
	private Date updatedDate;

	public Long getGraphId() {
		return this.graphId;
	}

	public void setGraphId(final Long graphId) {
		this.graphId = graphId;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(final Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(final Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
