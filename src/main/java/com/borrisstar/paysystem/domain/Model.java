package com.borrisstar.paysystem.domain;

import java.util.UUID;

public class Model {
	private long id;
	private String uid;// = UUID.randomUUID().toString();//Псевдоуникальный номер

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
