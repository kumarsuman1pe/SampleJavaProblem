package com.rest.webService.restfulwebService.exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timestamp;
	private String detsils;
	private String messgae;

	public ExceptionResponse(Date timestamp, String detsils, String messgae) {
		super();
		this.timestamp = timestamp;
		this.detsils = detsils;
		this.messgae = messgae;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getDetsils() {
		return detsils;
	}

	public void setDetsils(String detsils) {
		this.detsils = detsils;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}

}
