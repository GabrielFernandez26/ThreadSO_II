package controller;

public class ThreadController extends Thread {
	
	private int tid;
	
	public ThreadController(int tid) {
		this.tid = tid;
	}

	@Override
	public void run() {
		System.out.println(tid);
	}
	
	
}
