package com.example.hessiandemo.beans;

import java.io.Serializable;

public class DemoRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String payload;

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

}
