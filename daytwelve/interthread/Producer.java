package daytwelve.interthread;

public class Producer extends Thread {
	
	Q obj;

	public Producer(Q obj) {

		this.obj = obj;
		start();
	}
	
	public void run() {
		int i=0;
		
		while(true) {
			try {
				Thread.sleep(300);
			}catch(Exception e) {
				System.out.println(e);
			}
			
			obj.put(i);
			i++;
		}
	}
	
	

}