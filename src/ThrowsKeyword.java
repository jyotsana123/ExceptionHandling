import java.io.IOException;

//https://beginnersbook.com/2013/04/java-throws/
public class ThrowsKeyword {
	 
		  void myMethod(int num)throws IOException, ClassNotFoundException
		  { 
		     if(num==1)
		        throw new IOException("IOException Occurred");
		     else
		        throw new ClassNotFoundException("ClassNotFoundException");
		  } 
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{ 
		     ThrowsKeyword obj=new ThrowsKeyword(); 
		     obj.myMethod(1); 
		   }
		catch(Exception ex)
		{
		     System.out.println(ex);
		     
		}

	}
}


