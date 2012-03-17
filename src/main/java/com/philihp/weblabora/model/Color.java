package com.philihp.weblabora.model;

public enum Color {
	RED, GREEN, BLUE, WHITE;
	
	public static Color toColor(char c) {
		switch (c) {
		case '0':
		case 'R':
			return RED;
		case '1':
		case 'G':
			return GREEN;
		case '2':
		case 'B':
			return BLUE;
		case '3':
		case 'W':
			return WHITE;
		}
		return null;
	}
}
