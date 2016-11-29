public class Aloha{
     static void main(String args[]){
	     try{
	     String name;
	     String msg = "さんアロハ";
		     File f = new File("result.txt");
		     FileWriter bw = new FileWriter(f);
                     BufferedWriter bw = new BufferedWriter(fw);
		     PrintWriter pw = new PrintWriter(bw);

		     pw.printtln(msg);
	     }
	     pw.close();
     } catch (IOException e) {
	     System.out.println(ファイル書き込みエラー);
	     e.printStackTrace();
     }
}
