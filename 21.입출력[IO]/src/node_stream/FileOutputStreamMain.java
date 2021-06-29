package node_stream;

import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("fileOut.png");
		
		
		/*
		public abstract void write(int b) throws IOException;
		 	- Writes the specified byte to this output stream.
		 	- The general contract for write is that one byte is written to the output stream.
		 	- The byte to be written is the eight low-order bits of the argument b.
		 	- The 24 high-order bits of b are ignored.
			- Subclasses of OutputStream must provide an implementation for this method. 
		 */
		/*
		 00000000|00000000|00000000|01000001
		 */
		fos.write(65);
		/*
		 00000000|00000000|00000000|01000010
		 */
		fos.write(66);
		 /*
		 01111111|11111111|11111111|11111111
		 */
		fos.write(2147483647);
		/*
		 * 00000000|00000000|00000000|00000000 -->0
		 *  ~
		 * 00000000|00000000|00000000|11111111 -->255
		 */
		for(int i=0;i<256;i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println("FileOutputStream.write --> fileOut.dat");
		

	}

}
