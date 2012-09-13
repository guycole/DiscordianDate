package com.digiburo.discordia.date;

/**
 * Gregorian To Discordian Date Conversion
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Gregorian To Discordian Date Conversion
 *
 * @author gsc
 */
public class DateFactory {
	private GregorianCalendar _raw_date;
	
	private Day _day = Day.ST_TIB;
	private Season _season = Season.CHAOS;
	private HolyDay _holy_day = HolyDay.NONE;
	
	private int _year;
	private int _day_of_season;
	
	/**
	 * Convert for today
	 * 
	 * @return
	 */
	public DiscordianDate convertDate() {
		calculateDiscordianDate(new GregorianCalendar());
		return(dateLoader());
	}
	
	/**
	 * 
	 * @param year
	 * @param month
	 * @param day
	 */
	public DiscordianDate convertDate(int year, int month, int day) {
		calculateDiscordianDate(new GregorianCalendar(year, month, day));
		return(dateLoader());
	}

	/**
	 * 
	 * @param arg
	 */
	public DiscordianDate convertDate(GregorianCalendar arg) {
		calculateDiscordianDate(arg);	
		return(dateLoader());
	}
	
	/**
	 * 
	 * @return
	 */
	private DiscordianDate dateLoader() {
		return(new DiscordianDate(_day, _season, _day_of_season, _year, _holy_day, _raw_date));
	}
	
	/**
	 * 
	 * @param arg
	 */
	private void calculateDiscordianDate(GregorianCalendar arg) {
		_raw_date = arg;
	
		_year = arg.get(Calendar.YEAR) + 1166;
		
		int day_of_year = arg.get(Calendar.DAY_OF_YEAR);
		int year = arg.get(Calendar.YEAR);

		_day = Day.ST_TIB;
		_season = Season.CHAOS;
		_holy_day = HolyDay.NONE;
			
		/*
		 * leap year, feb 29 = St. Tibs Day
		 * does not interrupt day rotation (day of year must decrement by 1)
		 */
		if (arg.isLeapYear(year)) {
			if (day_of_year == 60) {
				//all done, defaults are for St. Tibs day
				return;
			} else if (day_of_year > 60) {
				day_of_year -= 1;
			}
		}
		
		_day = doyToEnum(day_of_year);
		
		while (day_of_year > 73) {
			day_of_year -= 73;
			_season = getNextSeason(_season);
		}
		
		_day_of_season = day_of_year;
		

		HolyDay[] argz = HolyDay.values();

		for (int ii = 0; ii < argz.length; ii++) {
			if ((argz[ii].getSeason().equals(_season)) && (argz[ii].getDayOfSeason() == _day_of_season)) {
				_holy_day = argz[ii];
			}
		}
	}

	/**
	 * Convert day of year to enumerated day
	 * @param ndx
	 * @return
	 */
	private Day doyToEnum(int ndx) {
		Day[] argz = Day.values();
		int ndx2 = (ndx-1) % (argz.length-1);
	//	System.out.println(ndx2 + "//" + argz[ndx2]);
		return(argz[ndx2]);
	}
	
	/**
	 * Return the next enumerated season
	 * 
	 * @param arg current season
	 * @return next season
	 */
	private Season getNextSeason(Season arg) {
		int ndx = arg.ordinal() + 1;
		
		Season[] argz = Season.values();
		if (ndx < argz.length) {
			return(argz[ndx]);
		}
		
		return(argz[0]);
	}
}

/*
 * Copyright 2009 Digital Burro, INC
 * Created on Aug 14, 2009 by gsc
 */