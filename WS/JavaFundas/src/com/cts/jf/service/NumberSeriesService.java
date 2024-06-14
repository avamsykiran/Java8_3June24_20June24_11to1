package com.cts.jf.service;

public class NumberSeriesService implements Runnable {

	private int start;
	private int end;
	
	public NumberSeriesService(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=start;i<=end;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t.getName() + ">> "+ i);
		}
	}
	
}
