/*
 * Class cricketer
 * int playerid, name, bool isBaller, float strikerate
 * int runs
 * private fields
 * gettersetters
 */
package com.practice;

public class Cricketer {
	
	private int playerId;
	private String name;
	private boolean isBaller;
	private float strikerRate;
	private int runs;
	
	Cricketer(){
		
	}
	Cricketer(int playerId, String name, boolean isBaller, float strikerRate, int runs){
		this.playerId = playerId;
		this.name = name;
		this.isBaller = isBaller;
		this.strikerRate = strikerRate;
		this.runs =runs;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getIsBaller() {
		return isBaller;
	}
	public void setIsBaller(boolean isBaller) {
		this.isBaller = isBaller;
	}
	
	public float getStrikerRate() {
		return strikerRate;
	}
	public void setStrikerRate(float strikerRate) {
		this.strikerRate = strikerRate;
	}
	
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		return ("Cricketer [ playerId="+playerId+", name = "+ name+", isBaller = "+isBaller+", strikerRate ="+strikerRate+", runs = "+runs+" ]");
	}

}
