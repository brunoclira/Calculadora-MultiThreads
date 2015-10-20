package MultiThreads;

public class Main_Thread {

	public static void main(String[] args) {
		
		Calc_Thread[] thread = new Calc_Thread[5];
		
		for(int i=0; i!=5 ; i++){
			
			thread[i]= new Calc_Thread();
			thread[i].run();
		
		}

	}

}
