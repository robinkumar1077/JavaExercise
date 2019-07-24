package com.rob.app.enums;

public enum CustomerType {
	VIP("Vip"),
	NORMAL("Normal"),
	PERSONA_NON_GRATA("Persona Non Grata");
	
	private String printableName;
	
	CustomerType(String printableName){
		this.printableName=printableName;
	}

	public String getPrintableName() {
		return printableName;
	}

	public void setPrintableName(String printableName) {
		this.printableName = printableName;
	}
	
}
