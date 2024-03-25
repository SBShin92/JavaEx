package com.javaex.oop.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {
		channel = 7;
		volume = 20;
		power = false;
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public void power(boolean on) {
		if (on)
			power = true;
		else
			power = false;
	}
	
	public void channel(int channel) {
		if (!power)
			return;
		if (channel < 1 || channel > 255)
			return ;
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if (!power)
			return;
		if (up) {
			++channel;
			if (channel > 255)
				channel = 1;
		} else {
			--channel;
			if (channel < 1)
				channel = 255;
		}
	}
	
	public void volume(int volume) {
		if (!power)
			return;
		if (volume > 100)
			this.volume = 100;
		else if (volume < 0)
			this.volume = 0;
		else
			this.volume = volume;
	}
	
	public void volume(boolean up) {
		if (!power)
			return;
		if (up) {
			++volume;
			if (volume > 100)
				volume = 100;
		} else {
			--volume;
			if (volume < 0)
				volume = 0;
		}
	}
	
	public void status() {
		if (power) {
			System.out.printf("TV 작동중. channel: %d, vol.: %d\n",
					channel, volume);
		} else {
			System.out.println("TV가 꺼져있습니다.");
		}
	}
}
