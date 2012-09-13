package com.digiburo.discordia;

import java.io.Serializable;

import java.util.GregorianCalendar;

/**
 * Discordian Date Container
 *
 * @author gsc
 */
public class DiscordianDate implements Serializable {

	private GregorianCalendar _raw_date;
	
	private Day _day = Day.ST_TIB;
	private Season _season = Season.CHAOS;
	
	private int _year;
	private int _day_of_season;
	
	private HolyDay _holy_day = HolyDay.NONE;

	/**
	 * 
	 * @param day
	 * @param season
	 * @param dos
	 * @param year
	 * @param holy_day
	 * @param raw_date
	 */
	public DiscordianDate(Day day, Season season, int dos, int year, HolyDay holy_day, GregorianCalendar raw_date) {
		_day = day;
		_season = season;
		_day_of_season = dos;
		_year = year;
		_holy_day = holy_day;
		_raw_date = raw_date;
	}
	
	/**
	 * 
	 * @return
	 */
	public Day getDay() {
		return(_day);
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
		return(_day_of_season);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getYear() {
		return(_year);
	}
	
	/**
	 * Determine if today is a holy day
	 * 
	 * @return holy day name or null if not holy
	 */
	public HolyDay getHolyDay() {
		return(_holy_day);
	}
	
	/**
	 * 
	 * @return
	 */
	public GregorianCalendar getGregorian() {
		return(_raw_date);
	}
	
	/**
	 * 
	 */
	public String toString() {
		String result;
		
		if (_day.equals(Day.ST_TIB)) {
			result = _day.getFullName() + ", " + _year + " YOLD";
		} else {
			result = _day.getFullName() + ", " + _season.getFullName() + " " + _day_of_season + ", " + _year + " YOLD";
		}
		
		return(result);
	}
	
	/**
	 * eclipse generated
	 */
	private static final long serialVersionUID = 4937334273273362824L;
}

/*
 * Copyright 2009 Digital Burro, INC
 * Created on Aug 14, 2009 by gsc
 */