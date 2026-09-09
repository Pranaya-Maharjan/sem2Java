import java.util.Scanner;

public class InterThreadCommunicationExample extends Thread{
	private String threadName;
	private static final Object lock = new Object();
	private static boolean isPlaying = false;
	private static boolean isPaused = false;
	private static final String musicFilePath = "~/Videos/wantu.mp3";
	public InterThreadCommunicationExample(String name){
		threadName = name;
	}
	public void run(){
		if (threadName.equals("MusicPlayer")){
			playMusic();
		}
		else if(threadName.equals("MusicController")){
			controlMusic();
		}
	}
	public void playMusic(){
		synchronized(lock){
			while(true){
				try{
					if(!isPlaying){
						System.out.println("MusicPlayer: waiting for the music to be played...");
						lock.wait();
					}
					System.out.println("MusicPlayer: Playing music from" + musicFilePath);
					isPlaying = true;
					isPaused = false;
					Thread.sleep(500);
					System.out.println("MusicPlayer: Music is playing.");
					isPlaying = false;
					lock.notify();
				}
				catch(InterruptedException e){
					System.out.println("MusicPlayer interrupted.");
				}
				catch(Exception e){
					System.out.println("MusicPlayer:Error palying music - " + e.getMessage());
				}
			}
		}
	}
	public void controlMusic(){
		synchronized(lock){
			while(true){
				try{
					if(!isPlaying){
						System.out.println("MusicController: waiting for the music to be played...");
						lock.wait();
					}
					System.out.println("MusicController: Pausing music...");
					isPaused = true;
					isPlaying = false;
					lock.notify();
					Thread.sleep(2000);
					System.out.println("MusicController: Resume music.....");
					isPaused = false;
					isPlaying = true;
					lock.notify();
				}
				catch(InterruptedException e){
					System.out.println("MusicController interrupted.");
				}
			}
		}
	}
	public static void main(String[] args){
		InterThreadCommunicationExample musicPlayer = new InterThreadCommunicationExample("MusicPlayer");
		InterThreadCommunicationExample musicController = new InterThreadCommunicationExample("MusicController");
		musicPlayer.start();
		musicController.start();
		isPlaying = true;
		isPaused = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 'play to play the music, 'pause' to pause the music and 'resume' to resume the music.");
		String input = scanner.next();
		while(!input.equals("exit")){
			synchronized(lock){
				if (input.equals("play")){
					if(!isPlaying){
						System.out.println("Main thread: notifying MusicPlayer to play music.");
						lock.notify();
					}
					else{
						System.out.println("Main thread: Music player is already playing.");
					}
				}
				else if( input.equals("pause")){
					if(isPlaying && !isPaused){
						System.out.println("Main thread: Notifying MusicController to pause music.");
						lock.notify();
					}
					else{
						System.out.println("Main Thread: Music is not playing or already paused.");
					}
				}
				else if(input.equals("resume")){
					if(isPaused){
						System.out.println("Main thread: Notifying MusicController to resume music.");
						lock.notify();
					}
					else{
						System.out.println("Main thread: Music is already playing.");
					}
				}
				else{
					System.out.println("Invalid input, Please enter 'play', 'pause', 'resume' or 'exit'.");
				}
			}
			input = scanner.next();
		}
		scanner.close();
	}
}




