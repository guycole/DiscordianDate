package com.digiburo.discordia;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 * demonstrate use of discordian date routines
 *
 * @author gsc
 */
public class DiscordiaDriver {
	
	/**
	 * Return today 
	 * 
	 * @return
	 */
	public String convert() {
		DateFactory dc = new DateFactory();
		DiscordianDate dd = dc.convertDate();
		return(formatResult(dd));
	}
	
	/**
	 * Return specified day
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public String convert(int year, int month, int day) {
		DateFactory dc = new DateFactory();
		DiscordianDate dd = dc.convertDate(year, month, day);
		return(formatResult(dd));
	}
	
	/**
	 * Return an entire year
	 * 
	 * @param year
	 */
	public void dumpYear(int year) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		GregorianCalendar gregcal = new GregorianCalendar(year, 0, 1);
		
		DateFactory dc = new DateFactory();
		
		do {
			String gregstr = sdf.format(new Date(gregcal.getTimeInMillis()));
			
			DiscordianDate dd = dc.convertDate(gregcal);
			
			System.out.println(gregstr + "//" + formatResult(dd));
			
			gregcal.add(Calendar.DAY_OF_YEAR, 1);
		} while (gregcal.get(Calendar.YEAR) == year);	
	}
	
	/**
	 * 
	 * @return
	 */
	public String praiseToday() {
		String today = convert();
		String praise = getRandomPraise();
		String result = today + " - " + praise;
		return(result);
	}
	
	/**
	 * 
	 * @param arg
	 * @return
	 */
	private String formatResult(DiscordianDate arg) {
		String result = "Today is: " + arg.toString();
		if (arg.getHolyDay() != HolyDay.NONE) {
			result += " Celebrate " + arg.getHolyDay().getName();
		}
		
		return(result);
	}

	/**
	 * Return random praise
	 * 
	 * @return random praise
	 */
	private String getRandomPraise() {
		Praise[] argz = Praise.values();
		int ndx = _random.nextInt(argz.length);		
		return(argz[ndx].toString());
	}
	
	/**
	 * 
	 */
	Random _random = new Random();
	
	public static void main(String[] args) {
		System.out.println("begin");
		
		DiscordiaDriver dd = new DiscordiaDriver();
		System.out.println(dd.convert());
		System.out.println(dd.convert(2008, 1, 28));
		System.out.println(dd.convert(2008, 1, 29));
		System.out.println(dd.convert(2008, 2, 1));
		System.out.println(dd.praiseToday());
		
		/*
		System.out.println("--------------------------------------");
		dd.dumpYear(2008);
		System.out.println("--------------------------------------");
		dd.dumpYear(2009);
		*/
		
		System.out.println("end");
	}
}

/*
 * Copyright 2009 Digital Burro, INC
 * Created on Aug 14, 2009 by gsc
 */