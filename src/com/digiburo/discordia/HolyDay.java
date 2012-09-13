package com.digiburo.discordia;

/**
 * Discordian Holy Days
 *
 * @author gsc
 */
public enum HolyDay {
	NONE("None", Season.CHAOS, 0),
	MUNGDAY("Mungday", Season.CHAOS, 5),
	CHAOFLUX("Chaoflux", Season.CHAOS, 50),
	MOJODAY("Mojoday", Season.DISCORD, 5),
	DISCOFLUX("Discoflux", Season.DISCORD, 50),
	SYADAY("Syaday", Season.CONFUSION, 5),
	CONFUFLUX("Confuflux", Season.CONFUSION, 50),
	ZARADAY("Zaraday", Season.BUREAUCRACY, 5),
	BUREFLUX("Bureflux", Season.BUREAUCRACY, 50),
	MALADAY("Maladay", Season.AFTERMATH, 5),
	AFFLUX("Afflux", Season.AFTERMATH, 50);
	
	private String _name;
	private Season _season;
	private int _dos; //day of season

	/**
	 * 
	 * @param name
	 * @param month 0=January
	 * @param day_of_month
	 */
	HolyDay(String name, Season season, int day_of_season) {
		_name = name;
		_season = season;
		_dos = day_of_season;
	}
	
	/**
	 * 
	 * @return holyday name
	 */
	public String getName() {
		return(_name);
	}
	
	/**
	 * 
	 * @return
	 */
	public Season getSeason() {
		return(_season);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getDayOfSeason() {
		return(_dos);
	}
}

/*
 * Copyright 2009 Digital Burro, INC
 * Created on Aug 15, 2009 by gsc
 */