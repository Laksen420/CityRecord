package edu.sdse.csvparser;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class Reader  
{  
	
public static void main(String[] args)   
{  
String line = "";  
String splitBy = ",";  
try   
{  
//parsing a CSV file into BufferedReader class constructor  
BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Gustav\\eclipse-workspace\\CSVParser\\data\\Cities.csv"));  
br.readLine();
//String line1=null;
while ((line = br.readLine()) != null)   //returns a Boolean value  
{  
String[] employee = line.split(splitBy);    // use comma as separator  
System.out.println(" ID: " + employee[0] + ", Year " + employee[1] + ", City: " + employee[2].substring(1, employee[2].length()-1) + ", Population: " + employee[3] + ""); 
}  
}   
catch (IOException e)   
{  
e.printStackTrace();  
}  
}  
}

v