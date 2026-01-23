package Multithreading;

class Spotify1 {
	public synchronized void playSongs(int n,String type) {
		for(int i=1;i<=n;i++) {
			System.out.println(type+i+" played");
		}
	}
}

class MyList_1 implements Runnable {
	int n;
	String type;
	Spotify1 spotify;
	public MyList_1(int n, String type, Spotify1 spotify) {
		this.n = n;
		this.type = type;
		this.spotify = spotify;
	}
	@Override
	public void run() {
		spotify.playSongs(n, type);
	}
}
class MyList_2 implements Runnable {
	int n;
	String type;
	Spotify1 spotify;
	public MyList_2(int n, String type, Spotify1 spotify) {
		this.n = n;
		this.type = type;
		this.spotify = spotify;
	}
	@Override
	public void run() {
		spotify.playSongs(n, type);
	}
}

public class With_synchronization {
    public static void main(String[] args) {
    	Spotify1 spotify = new Spotify1();
    	MyList_1 m1 = new MyList_1(4, "Sad song ", spotify);
    	MyList_2 m2 = new MyList_2(4, "Love song ", spotify);
    	
    	Thread t1 = new Thread(m1);
    	Thread t2 = new Thread(m2);
    	t1.start();
    	t2.start();
    	
    

}


}