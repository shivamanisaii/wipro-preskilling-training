package com.wipro.Day_seven;

public class Browser {
	private String Site;
	private String time;
	
	public Browser() {
		
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String Site) {
		this.Site=Site;
	}
	public void setTime(String time) {
		this.time=time;
	}
	@Override
	public String toString() {
		return("Website visited "+Site+"- at "+time);
	}

}
