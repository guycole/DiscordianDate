package com.digiburo.discordia.date;

/**
 * Discordian day definitions
 */

/**
 * Discordian day definitions
 *
 * @author gsc
 */
public enum Day {
	SWEET_MORN("Sweetmorn", "SM"),
	BOOM_TIME("Boomtime", "BT"),
	PUNGEN_DAY("Pungenday", "PD"),
	PRICKLE_PRICKLE("Prickle-Prickle", "PP"),
	SETTING_ORANGE("Setting Orange", "SO"),
	ST_TIB("St. Tib's Day", "St. Tib's Day");
	
	private final String _full_name;
	private final String _abbreviated_name;
	
	/**
	 * 
	 * @param full_name
	 * @param abbreviated_name
	 */
	Day(String full_name, String abbreviated_name) {
		_full_name = full_name;
		_abbreviated_name = abbreviated_name;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getFullName() {
		return(_full_name);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getAbbreviatedName() {
		return(_abbreviated_name);
	}
	
	/**
	 * 
	 */
	public String toString() {
		return(_full_name);
	}
}

/*
 * Copyright 2009 Digital Burro, INC
 * Created on Aug 14, 2009 by gsc
 */