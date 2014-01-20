package com.henchao.sort.utilities;

public class ListElement {
	private Integer value;
	private boolean isModified;
	
	public ListElement(Integer initialValue) {
		this.value = initialValue;
		this.isModified = false;
	}
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public boolean isModified() {
		return isModified;
	}
	public void setModified(boolean isModified) {
		this.isModified = isModified;
	}

	public boolean isGreaterThan(ListElement o) {
		Integer comparisonValue = o.getValue();
		
		if ( this.value > comparisonValue )
			return true;
		else
			return false;
	}
	
	public String toString(){
		return this.value.toString();
	}
}
