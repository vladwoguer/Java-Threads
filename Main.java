class MinhaThread extends Thread {
	private int meuId;

	public MinhaThread(int id) {
		this.meuId = id;
	}	

	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Ola eu sou a Thread " + meuId);
	}
}

public class Main {
	public static void main(String args[]) {
		Thread[] minhaThread = new MinhaThread[1000];

		for(int i = 0; i < 1000; i++) {
			minhaThread[i] = new MinhaThread(i);
		}
		for(int i = 0; i < 500; i++) {
			minhaThread[i].start();
		}
		System.out.println("Ola eu sou a Thread " + "Main");
		for(int i = 500; i < 1000; i++) {
			minhaThread[i].start();
		}
	}
}