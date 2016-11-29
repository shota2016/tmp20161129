import java.io.*;

public class CopyByteFile{
	public static void main(String args[]){
		FileInputStream in = null;
		FileOutputStream out = null;

		try{
			in = new FileInputStream("3.jpeg");
			out = new FileOutputStream("4.jpeg");

			int d;
				while((d = in.read()) != -1){
					out.write(d);
				}
			System.out.println("コピー終わり");
			System.out.println(d);
		}catch(IOException e) {
			System.out.println("IOエラーです");
		}finally {
			try{
				in.close();
				out.close();
			}catch (IOException e) {
				System.out.println("IOエラーです");
		   }
	    }
      }
}
