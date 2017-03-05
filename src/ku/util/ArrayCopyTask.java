package ku.util;

import java.io.IOException;

public class ArrayCopyTask extends FileCopyTask {
	private int blocksize;
	
		public ArrayCopyTask (String infilename,String outfilename,int blocksize) {
			setInput(infilename);
			setOutput(outfilename);
			this.blocksize = blocksize;
		}
		
		public void run() {
			try {
				FileUtil.copy(in, out,blocksize*1024);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public String toString() {
			return "Copy file"+ this.blocksize/1024 +"byte at a time.";
		}

}
