package com.jvs.jee.samples.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

	static public void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println("Value: " + value + " Pattern: " + pattern + " Output: " + output);
	}

	static public void main(String[] args) {

		customFormat("###,###.###", 123456.789);
		customFormat("###.##", 123456.789);
		customFormat("000000.000", 123.78);
		customFormat("$###,###.###", 12345.67);
	}
}
