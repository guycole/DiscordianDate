package com.digiburo.discordia;

/**
 * Discordian season definitions
 *
 * @author gsc
 */
public enum Season {
	CHAOS("Chaos", "Chs"),
	DISCORD("Discord", "Dsc"),
	CONFUSION("Confusion", "Cfn"),
	BUREAUCRACY("Bureaucracy", "Bcy"),
	AFTERMATH("The Aftermath", "Afm");
	
	private final String _full_name;
	private final String _abbreviated_name;
	
	/**
	 * 
	 * @param full_name
	 * @param abbreviated_name
	 */
	Season(String full_name, String abbreviated_name) {
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