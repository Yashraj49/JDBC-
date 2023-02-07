import java.sql.*; //1
// JDBC is part od ODBC which is created using C lang 
class Database
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/ppa41";
        String Username = "root";
        String Password = "root";
        String Query = "select * from student";
        
       //Class.forName("com.mysql.jdbc.Driver");
        Connection cobj = DriverManager.getConnection(URL,Username,Password); //2

        Statement sobj = cobj.createStatement();    //3

        ResultSet robj = sobj.executeQuery(Query);  //4

        while(robj.next()) //5         
        {
            System.out.println("RID : "+robj.getInt("RID"));
            System.out.println("Name : "+robj.getString("Name"));
            System.out.println("City : "+robj.getString("City"));
            System.out.println("Marks : "+robj.getInt("Marks"));                                    
        }
    }
}


// execute()                Create Table
// executeQuery()           select
// executeUpdate()          delete/ update / alter / insert