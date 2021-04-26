import java.sql.connections;
import java.sql.DriverManager;
import java.sql.SqlExceptions;
public class databaseConnection {
	private static final String Driver1="org.apache.derby.jdbx.EmbeddedDriver";
	private static final String JDBC_URL="jdbc:derby:SVB;create=true";
	Connection connect;
	public  databaseConnection()
	{
		try {
			this.conn=DriverManager.getConnection(JDBC_URL);
			if(this.conn!=NULL)
			{
				System.out.println("Done");
			}
			catch(Exception e)
			{
				System.out.println("Not working");
			}
		}
	}




"
			
	

	
	
		


