package com.javaex.oop.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	private static final int MAX_CHANNEL = 255;
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_VOLUME = 100;
	private static final int MIN_VOLUME = 0;
	
	
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
		if (!power || channel < MAX_CHANNEL ||
		 channel > MAX_CHANNEL)
			return ;
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if (!power)
			return;
		if (up) {
			++channel;
			if (channel > MAX_CHANNEL)
				channel = MIN_CHANNEL;
		} else {
			--channel;
			if (channel < MIN_CHANNEL)
				channel = MAX_CHANNEL;
		}
	}
	
	public void volume(int volume) {
		if (!power)
			return;
		if (volume > MAX_VOLUME)
			this.volume = MAX_VOLUME;
		else if (volume < MIN_VOLUME)
			this.volume = MIN_VOLUME;
		else
			this.volume = volume;
	}
	
	public void volume(boolean up) {
		if (!power)
			return;
		if (up) {
			++volume;
			if (volume > MAX_VOLUME)
				volume = MAX_VOLUME;
		} else {
			--volume;
			if (volume < MIN_VOLUME)
				volume = MIN_VOLUME;
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
