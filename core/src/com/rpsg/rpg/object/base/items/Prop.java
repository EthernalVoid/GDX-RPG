package com.rpsg.rpg.object.base.items;

import java.io.Serializable;

import com.badlogic.gdx.math.MathUtils;

public class Prop implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String type;
	public String formula;
	public String floatRate;
	
	public int rate(int val){
		int min = 0,max = 0;
		if(floatRate.endsWith("%")){
			int rate = Integer.valueOf(floatRate.split("%")[0]);
			min = val - (val * rate);
			min = val + (val * rate);
		}else{
			min = val - Integer.valueOf(floatRate);
			min = val + Integer.valueOf(floatRate); 
		}
		return MathUtils.random(min,max);
	}
	
}
