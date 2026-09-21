import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class UserInputExample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Welcome to DAV IT Club ***");
		System.out.println("Enter the following details to join the club");
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("Enter your semseter");
		String semester = sc.next();
		System.out.println("Enter your faculty:");
		String faculty = sc.next();
		File f = new File("/home/spongybucket/Documents/sem2Java/Java/lab9/club.txt");
		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bin;
		BufferedOutputStream bout;
		try{
			in = new FileInputStream(f);
			out = new FileOutputStream(f, true);
			bin = new BufferedInputStream(in);
			bout = new BufferedOutputStream(out);
			String data = "\n" + name + "   " + semester + " " + faculty;
			int file_data;
			System.out.println("Current Club Member");
			while((file_data =  bin.read())!= -1){
				System.out.print((char)file_data);
			}
			bout.write(data.getBytes());
			bout.flush();
			System.out.println("Thank you for joining the club. Your details have been saved successfully.");
		} catch(IOException e){
			System.out.println("An error occurred while processing the file: " + e.getMessage());
		}finally{
			try{
				if( in != null) in.close();
				if( out != null) out.close();
			} catch(IOException e){
				System.out.println("An error occurred while closing the streams:" + e.getMessage());
			}
		}
		sc.close();
	}
}








