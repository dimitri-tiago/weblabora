package com.philihp.weblabora.model;

import com.philihp.weblabora.model.building.AbstractBuilding;
import com.philihp.weblabora.model.building.Card;

public class UsageParam {
	private int peat = 0;
	private int penny = 0;
	private int clay = 0;
	private int wood = 0;
	private int grain = 0;
	private int sheep = 0;

	private int stone = 0;
	private int flour = 0;
	private int grapes = 0;
	private int nickel = 0;
	private int hops = 0;

	private int coal = 0;
	private int book = 0;
	private int pottery = 0;
	private int whiskey = 0;
	private int straw = 0;
	private int meat = 0;
	private int ornament = 0;
	private int bread = 0;
	private int wine = 0;
	private int beer = 0;
	private int reliquary = 0;

	private Card card = null;
	
	private boolean withJoker = false;

	private UsageParam() {
	}

	public static UsageParam is() {
		return new UsageParam();
	}

	public UsageParam peat(int quantity) {
		peat += quantity;
		return this;
	}

	public UsageParam penny(int quantity) {
		penny += quantity;
		return this;
	}

	public UsageParam clay(int quantity) {
		clay += quantity;
		return this;
	}

	public UsageParam wood(int quantity) {
		wood += quantity;
		return this;
	}

	public UsageParam grain(int quantity) {
		grain += quantity;
		return this;
	}

	public UsageParam sheep(int quantity) {
		sheep += quantity;
		return this;
	}

	public UsageParam stone(int quantity) {
		stone += quantity;
		return this;
	}

	public UsageParam flour(int quantity) {
		flour += quantity;
		return this;
	}

	public UsageParam grapes(int quantity) {
		grapes += quantity;
		return this;
	}

	public UsageParam nickel(int quantity) {
		nickel += quantity;
		return this;
	}

	public UsageParam hops(int quantity) {
		hops += quantity;
		return this;
	}

	public UsageParam coal(int quantity) {
		coal += quantity;
		return this;
	}

	public UsageParam book(int quantity) {
		book += quantity;
		return this;
	}

	public UsageParam pottery(int quantity) {
		pottery += quantity;
		return this;
	}

	public UsageParam whiskey(int quantity) {
		whiskey += quantity;
		return this;
	}

	public UsageParam straw(int quantity) {
		straw += quantity;
		return this;
	}

	public UsageParam meat(int quantity) {
		meat += quantity;
		return this;
	}

	public UsageParam ornament(int quantity) {
		ornament += quantity;
		return this;
	}

	public UsageParam bread(int quantity) {
		bread += quantity;
		return this;
	}

	public UsageParam wine(int quantity) {
		wine += quantity;
		return this;
	}

	public UsageParam beer(int quantity) {
		beer += quantity;
		return this;
	}

	public UsageParam reliquary(int quantity) {
		reliquary += quantity;
		return this;
	}

	public UsageParam card(Card card) {
		this.card = card;
		return this;
	}

	public int getPeat() {
		return peat;
	}

	public int getPenny() {
		return penny;
	}

	public int getClay() {
		return clay;
	}

	public int getWood() {
		return wood;
	}

	public int getGrain() {
		return grain;
	}

	public int getSheep() {
		return sheep;
	}

	public int getStone() {
		return stone;
	}

	public int getFlour() {
		return flour;
	}

	public int getGrapes() {
		return grapes;
	}

	public int getNickel() {
		return nickel;
	}

	public int getHops() {
		return hops;
	}

	public int getCoal() {
		return coal;
	}

	public int getBook() {
		return book;
	}

	public int getPottery() {
		return pottery;
	}

	public int getWhiskey() {
		return whiskey;
	}

	public int getStraw() {
		return straw;
	}

	public int getMeat() {
		return meat;
	}

	public int getOrnament() {
		return ornament;
	}

	public int getBread() {
		return bread;
	}

	public int getWine() {
		return wine;
	}

	public int getBeer() {
		return beer;
	}

	public int getReliquary() {
		return reliquary;
	}

	public Card getCard() {
		return card;
	}
	
	public void setWithJoker(boolean withJoker) {
		this.withJoker = withJoker;
	}
	
	public boolean isWithJoker() {
		return withJoker;
	}

}