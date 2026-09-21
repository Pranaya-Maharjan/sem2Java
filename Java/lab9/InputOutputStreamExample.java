import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ByteArrayOutputStream;

class InputOutputStream{
	public static void main(String[] args){
		File f = new File("/home/spongybucket/Documents/sem2Java/Java/lab9/course.txt");
		InputStream in = null;
		OutputStream out = null;
		BufferedOutputStream bout = new BufferedOutputStream(out);
		BufferedInputStream bin = new BufferedInputStream(in);
		try{
			in = new FileInputStream(f);
			bin = new BufferedInputStream(in);
			String output_file = "/home/spongybucket/Documents/sem2Java/Java/lab9/course_copy.txt";
			out = new FileOutputStream(output_file);
			bout = new BufferedOutputStream(out);
		        System.out.println("***Copying file content to " + output_file);
			int data;
			while((data = bin.read()) != -1){
				System.out.println((char) data);
				bout.write(data);
			}
			bout.flush();
		        System.out.println("\n**File content copied successfully to" + output_file);
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(in !=null){
					in.close();
				}
				if(bin != null){
					bin.close();
				}
				if(bout != null){
					bout.close();
				}
			        if (out != null){
					out.close();
				}
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}
				


		
