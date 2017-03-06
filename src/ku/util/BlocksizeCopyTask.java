package ku.util;

import java.io.IOException;

/**
 * The byte copy task for copying per block size to new files.
 * @author pranger54
 * @version 1.0
 * @since 3.3.2017
 */
public class BlocksizeCopyTask extends FileCopyTask {
	private int blocksize;
	
	/**
	 * The attributes of the byte copy task that have input and output filename.
	 * @param infilename is the input filename.
	 * @param outfilename is the output filename.
	 * @param blocksize is the number of block size want to convert.
	 */
	public BlocksizeCopyTask (String infilename,String outfilename,int blocksize) {
		super(infilename,outfilename);
		this.blocksize = blocksize;
	}
		
	/**
	  * The run methods that make the task copy and convert block size to byte by multiply 1024.
	  * One block size is equal to 1024 bytes.
	  * @throws IOException is throws the problem of the input and output files.
	  */
	public void run() {
		try {
			FileUtil.copy(in, out,this.blocksize*1024);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	/**
	  * Detail for the block size copy task
	  * @return the detail of this task and number of blocksize.
	  */
	public String toString() {
		return "Copy file "+ this.blocksize +" byte at a time.";
	}

}
