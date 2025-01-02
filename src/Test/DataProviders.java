package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	@Test(dataProvider="getData")
	public void ti(String firstname,String lastname) {
		System.out.println(firstname+" "+lastname);
		
	}
	@DataProvider
	public Object[][] getData(){
		Object [][]data=new Object[3][2];
		data[0][0]="1stName";
		data[1][0]="2ndName";
		data[2][0]="3rdName";
		data[0][1]="1stLastName";
		data[1][1]="2ndLastName";
		data[2][1]="3rdLastName";
		return data;
			
	}

}
