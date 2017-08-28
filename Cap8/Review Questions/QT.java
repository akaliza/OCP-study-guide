import java.io.*;

public class QT{
	
	private static void q5() throws IOException{
		String line;
		Console c = System.console();
		Writer w = c.writer();
		if ((line = c.readLine()) != null)
			w.append(line);
		w.flush();
		
	} 
	
	public static void deleteTree(File file) {
		if(!file.isFile())
			for(File entry: file.listFiles())
				deleteTree(entry);
		else file.delete();
	}
	
	private void echo() throws IOException {
		try (FileReader fileReader = new FileReader("zoo-data.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			System.out.println(bufferedReader.readLine());
		}
	}
	
	public static String pullBytes(InputStream is, int count) throws IOException{
		is.mark(count);
		final StringBuilder sb = new StringBuilder();
		for(int i=0; i<count; i++)
			sb.append((char)is.read());
		is.reset();
		is.skip(1);
		sb.append((char)is.read());
		return sb.toString();
	}

	
	public static void main(String[] args){
		int i = 3; 
	    try{
		   InputStream is = new FileInputStream("C://test.txt");
		    BufferedInputStream bis = new BufferedInputStream(is);
		   System.out.println(is.markSupported());
		   System.out.println(bis.markSupported());
		  
		   System.out.println(pullBytes(bis,i));
		}catch(IOException e ){
			e.printStackTrace();
		}
	}
	
}