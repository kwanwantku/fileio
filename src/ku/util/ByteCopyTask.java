package ku.util;

import java.io.IOException;

/**
 * The byte copy task for copying per one byte to new files.
 * @author pranger54
 * @version 1.0
 * @since 3.3.2017
 */
public class ByteCopyTask extends FileCopyTask {
	/**
	 * The attributes of the byte copy task that have input and output filename.
	 * @param infilename is the input filename.
	 * @param outfilename is the output filename.
	 */
	public ByteCopyTask (String infilename,String outfilename) {
		super(infilename,outfilename);
	}
	
	/**
	 * The run methods that make the task copy.
	 * @throws IOException is throws the problem of the input and output files.
	 */
	public void run() {
		try {
			FileUtil.copy(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Detail for the byte copy task
	 * @return the detail of this task.
	 */
	public String toString() {
		return "Copy file one byte at a time.";
	}
	

}
