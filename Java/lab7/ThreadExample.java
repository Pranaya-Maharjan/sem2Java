class ThreadExample extends Thread{
	private String threadName;
	ThreadExample(String name){
		threadName = name;
	}
	public void run(){
		System.out.println(threadName + " is running.");
	        try{
			for(int i = 0 ; i< 5; i++){
				System.out.println(threadName + ":" + i);
				Thread.sleep(5000);
				if( i==2 && threadName.equals("Thread1")){
					this.setPriority(Thread.MAX_PRIORITY);
					System.out.println(threadName + " priority set to MAX.");
				}
				else if(i==2 && threadName.equals("Thread2")){
					this.setPriority(Thread.MIN_PRIORITY);
					System.out.println(threadName + "priority set to MIN.");
				}
			}
		} catch(InterruptedException e){
			System.out.println(threadName + " interupted.");
		}
		System.out.println(threadName + " has finished execution.");
	}
	public static void main(String[] args){
		ThreadExample thread1 = new ThreadExample("Thread 1");
		ThreadExample thread2 = new ThreadExample("Thread 2");
		thread1.start();
		thread2.start();
		System.out.println("Thread priorities: " + thread1.getName() + " = " + thread1.getPriority() + " , " + thread2.getName() + " = " + thread2.getPriority());
	}
}

