package ku.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;


/**
 * Program is making copy the text from the one file to another files.
 * By using 3 copies methods.
 * @author pranger54
 * @version 1.0
 * @since 3.3.2017
 */
public class FileUtil {
	
	
	/**
	 * The copy of the the text that input and convert the text to output for each one byte.
	 * @param in is a input text that want to convert for copy to new files.
	 * @param out is a output text that show the text that copy from input in new files.
	 * @throws IOException is throws the problem of the input and output files.
	 */
	public static void copy(InputStream in,OutputStream out) throws IOException {
			int readin = in.read();
			while(readin != -1) {
				 out.write(readin);
				 readin = in.read();
			}
			in.close();
			out.close();
	}
	
	/**
	 * The copy of the the text that input and convert the text to output for each block size.
	 * One block size is equal to 1024 bytes.
	 * @param in is a input text that want to convert for copy to new files.
	 * @param out is a output text that show the text that copy from input in new files.
	 * @throws IOException is throws the problem of the input and output files.
	 */
	public static void copy(InputStream in,OutputStream out,int blocksize) throws IOException {
		byte[] buffer = new byte[blocksize];
		int readin = in.read(buffer);
			while (readin != -1) {
			    out.write(buffer);
			    readin = in.read(buffer);
			}
			in.close();
			out.close();
		
	}
	
	/**
	 * The copy of the the text that input and convert the text to output for each one line.
	 * @param in is a input text that want to convert for copy to new files.
	 * @param out is a output text that show the text that copy from input in new files.
	 * @throws IOException is throws the problem of the input and output files.
	 */
	public static void bcopy(InputStream in,OutputStream out) throws IOException {
		InputStreamReader inputstreamreader =  new InputStreamReader(in);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		PrintWriter print = new PrintWriter(out);
		String readline = bufferreader.readLine();
			while(!readline.equals(null)) {
				readline = bufferreader.readLine()+"\n";
				print.write(readline);
			}
			bufferreader.close();
			print.close();
	}
}
