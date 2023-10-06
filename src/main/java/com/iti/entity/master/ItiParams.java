package com.iti.entity.master;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="iti_params")
public class ItiParams {
	
	@Id
	private Integer code;
	private String description;
	private String value;
	public ItiParams() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItiParams(Integer code, String description, String value) {
		super();
		this.code = code;
		this.description = description;
		this.value = value;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ItiParams [code=" + code + ", description=" + description + ", value=" + value + "]";
	}
}
