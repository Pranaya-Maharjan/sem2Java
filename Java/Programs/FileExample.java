import java.io.File;
class FileExample{
	public void main(String[] args){
		System.out.println("****** File & Directory Creation, Deletion & Manipulation in java ******");
		try{
			File fnew = new File("/home/spongybucket/Documents/sem2Java/Java/Programs/test.txt");
			if(fnew.exists()){
				System.out.println("File" + fnew.getName() + "already exists.");
			}
			else{
				fnew.createNewFile();
				System.out.println("File" + fnew.getName() + "is created successfully.");
			}
		} catch (Exception e){
			System.out.println("An error ocurred while creating the file.");
			e.printStackTrace();
		}
		File fcheck = new File("/home/spongybucket/Documents/sem2Java/Java/Programs/test.txt");
		if(fcheck.exists()){
			System.out.println("File" + fcheck.getName() + "exists.");
			if(fcheck.isFile()){
				System.out.println(fcheck.getName() + "is a File.");
			}
			else if(fcheck.isDirectory()){
				System.out.println(fcheck.getName() + " is a directory.");
			}
		}else{
			System.out.println("File" + fcheck.getName() + "does not exist.");
		
		}
		File dnew = new File("/home/spongybucket/Documents/sem2Java/Java/Programs/NewDir");
		if(dnew.exists()){
			System.out.println("Directory" + dnew.getName() + " already exists.");
		}
		else{
			dnew.mkdir();
			System.out.println("Directory" + dnew.getName() + " is created successfully.");
		}
		File dlist = new File("/home/spongybucket/Documents/sem2Java/Java/Programs");
		String[] fileList = dlist.list();
		System.out.println("Lists of files and directories in " + dlist.getPath() + ":");
		for(String fileName : fileList){
			System.out.println(fileName);
		}
	}
}
	
