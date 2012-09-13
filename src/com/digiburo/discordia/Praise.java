
package com.digiburo.discordia.praise;

/**
 * Random non-sequiturs of praise
 */
import java.io.Serializable;

/**
 * Random non-sequiturs of praise
 *
 * @author gsc
 */
public enum Praise implements Serializable {
	ALL_HAIL("All Hail Discordia!"),
	COMMERCIAL("Buy me for your iPhone or Android mobile"),
	FNORD("Fnord."),
	FRINK("Frink!"),
	GRUDNUK("Grudnuk demand sustenance!"),
	HAIL_ERIS("Hail Eris!"),
	KALLISTI("Kallisti!"),
	KILL_ME("Or kill me."),
	LASAGNA("Keep the Lasagna flying!"),
	OR_NOT("Or not."),
	PRAISE_BOB("Praise \"Bob\"!"),
	PTANG("P'tang!"),
	PZAT("Pzat!"), 
	SLACK("Slack!"),
	WIBBLE("Wibble.");
	
	/**
	 * Praise string
	 */
	private final String _praise;
	
	/**
	 * ctor
	 * 
	 * @param arg
	 */
	Praise(String arg) {
		_praise = arg;
	}
	
	/**
	 * Return praise string
	 */
	public String toString() {
		return(_praise);
	}
}

/*
 * Copyright 2009 Digital Burro, INC
 * Created on Aug 14, 2009 by gsc
 */