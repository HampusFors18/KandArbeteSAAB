package AnalysProgram;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinary {
<<<<<<< HEAD
	public static void main (String [] args) {

		try {
			FileInputStream fileIs= new FileInputStream("exjobb871.raw");
			BufferedInputStream in =new BufferedInputStream(fileIs);
			
			byte[] InData= new byte[100];
			int BytesRead=0;
			
			in.read(InData,0,BytesRead);
			
			System.out.print(InData);
			
			in.close();
			
		}
		catch (FileNotFoundException e1) {
			System.err.println("Error - File not found");
			
		}
		catch (IOException e2) {
			System.err.println("Error - IO Exception");
		}
		
	}
	}
=======
    //important comment
	System.out.println("Important message... Very importante")
    private int importantVariable;
}
>>>>>>> branch 'master' of https://github.com/HampusFors18/KandArbeteSAAB
