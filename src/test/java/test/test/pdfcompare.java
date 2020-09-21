package test.test;

import java.io.IOException;

import de.redsix.pdfcompare.PdfComparator;

public class pdfcompare 

{
public static void main(String args[]) throws IOException 

{
String f1="C:\\Users\\1645\\Desktop\\tc43.pdf";
String f2="C:\\Users\\1645\\Desktop\\tc4.pdf";
String result="C:\\Users\\1645\\Desktop\\comp";

new PdfComparator(f1, f2).compare().writeTo(result);

System.out.println("Done");

	
	
}

}
