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


public class FileUtil {
	
	public static void copy(InputStream in,OutputStream out) throws IOException {
			int readin = in.read();
			while(readin != -1) {
				 out.write(readin);
			}
			in.close();
			out.close();
	}
	
	public static void copy(InputStream in,OutputStream out,int blocksize) throws IOException {
		byte[] buffer = new byte[blocksize];
		int readin = in.read(buffer);
			while (readin != -1) {
			    out.write(buffer);
			}
			in.close();
			out.close();
		
	}
	
	public static void bcopy(InputStream in,OutputStream out) throws IOException {
		InputStreamReader inputstreamreader =  new InputStreamReader(in);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		PrintWriter print = new PrintWriter(out);
		String readline = bufferreader.readLine();
			while(!readline.equals(null)) {
				print.write(readline);
			}
			bufferreader.close();
			print.close();
	}
}
