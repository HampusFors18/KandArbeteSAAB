package AnalysProgram;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ReadBinary {
	public static void main (String [] args) {

		try {
			FileInputStream fileIs= new FileInputStream("exjobb871.raw");
			BufferedInputStream in =new BufferedInputStream(fileIs);
			
			byte[] InData= new byte[49];
			int BytesRead=0;

			byte[] FSPEC = new byte[9];
			in.read(FSPEC, 0, 9);

			byte[] Range = new byte[2];
			in.read(Range, 0, 2);

			short r = ByteBuffer.wrap(Range).order(ByteOrder.LITTLE_ENDIAN).getShort();
			System.out.println(r);
			
			in.read(InData,0,49);

			for(int i = 0; i < 49; i++) {
				System.out.println(String.format("0x%02X", Byte.toUnsignedInt(InData[i])));
			}
			
			in.close();
			
		}
		catch (FileNotFoundException e1) {
			System.err.println("Error - File is not found");
			
		}
		catch (IOException e2) {
			System.err.println("Error - IO Exception");
		}
		
	}
}

