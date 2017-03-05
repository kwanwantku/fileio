package ku.util;

import java.io.IOException;

public class LineCopyTask extends FileCopyTask {

		public LineCopyTask (String infilename,String outfilename) {
			setInput(infilename);
			setOutput(outfilename);
		}
		
		public void run() {
			try {
				FileUtil.bcopy(super.in, super.out);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public String toString() {
			return "Copy file one line at a time.";
		}

}
