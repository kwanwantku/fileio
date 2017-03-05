package ku.util;

import java.io.IOException;

public class ByteCopyTask extends FileCopyTask {
	public ByteCopyTask (String infilename,String outfilename) {
		setInput(infilename);
		setOutput(outfilename);
	}
	
	public void run() {
		try {
			FileUtil.copy(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return "Copy file one byte at a time.";
	}
	

}
