package com.vk.limitsservice.bean;

public class LimitServiceConfig {

	private int min;
	private int max;
	
	
	public LimitServiceConfig(int min, int max) {
		this.min=min;
		this.max=max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
}
