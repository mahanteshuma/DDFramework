package objectTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleParameter {
	
	@Test(dataProvider="getData")
	public void LoginData(String username, String password) {
		System.out.println("UserName used:" +username+"  PassWord used:" +password);
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		
		data[0][0]="mahantesh";
		data[0][1]="9481";
		
		data[1][0]="uma";
		data[1][1]="6360";
		
		data[2][0]="prakash";
		data[2][1]="7480";
		return data;
		
	}

}
