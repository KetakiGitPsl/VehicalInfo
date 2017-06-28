package com.psl.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "info")
public class Info {

	private String mac;
	private int latitude;
	private int longitude;
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	
	
	public Info() {
	}
	public Info(String mac, int latitude, int longitude) {
		this.mac = mac;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	
	
}
