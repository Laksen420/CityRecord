import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CityRecord {
	public String City;
	public int Population;
	public int Year;
	public int ID;
	
	public CityRecord(String City, int Population, int ID, int Year) {
		this.City = City;
		this.Year = Year;
		this.Population = Population;
		this.ID = ID;
		
	
	}
	
	@Override
	public String toString() {
		return " ID: " + ID + ", Year: " + Year + ", City: " + City.substring(1, City.length() -1) + ", Population: " + Population + "";
	}
	
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
				CityRecord cr = new CityRecord(employee[2], Integer.parseInt(employee[3]), Integer.parseInt(employee[0]), Integer.parseInt((employee[1])));
				System.out.println(cr);
				//System.out.println(" ID: " + employee[0] + ", Year " + employee[1] + ", City: " + employee[2].substring(1, employee[2].length()-1) + ", Population: " + employee[3] + ""); 
			}  
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();  
		}  
	}  
}	


