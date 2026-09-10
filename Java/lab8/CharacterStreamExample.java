import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
class CharacterStreamExample{
	public static void main(String args[]){
		String file_path = "/home/spongybucket/Documents/sem2Java/Java/lab8/subject.txt";
		FileReader reader = null;
		try{
                        File f = new File(file_path);
		        reader = new FileReader(f);
			for(int i = 0; i < f.length(); i++){
				int data = reader.read();
				if(data == -1){
					break;
				}
				System.out.print((char)data);
			}
		File fnew = new File("/home/spongybucket/Documents/sem2Java/Java/lab8/subject_new.txt");
		String data = "lab 8: Character Stream Example. \nThis is a new file created using FIleWriter class.\n";
		FileWriter writer = new FileWriter(fnew);
		writer.write(data);
		writer.close();
		System.out.println("\nData written to the file successfully.");
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(reader != null){
					reader.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
  
