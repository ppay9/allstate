package com.demo.app;

public class Mail {
	private String[] toAddresses;
	private String from;
	private Message message;
	
	public Mail() {
		// TODO Auto-generated constructor stub
	}

	

	public String[] getToAddresses() {
		return toAddresses;
	}



	public void setToAddresses(String[] toAddresses) {
		this.toAddresses = toAddresses;
	}



	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
}
