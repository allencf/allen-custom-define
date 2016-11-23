package com.allen.custom.cfg;

import java.io.Serializable;

public class CustomDefineBean implements Serializable{
	
	private static final long serialVersionUID = -1743031949015653764L;

	private String modelName;
	
	private String address;
	
	private String port;
	

	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}
	

	@Override
	public String toString() {
		return "CustomDefineBean [modelName=" + modelName + ", address=" + address + ", port=" + port + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
