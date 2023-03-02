import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class JavaMenu{
 
    public static void main(String []args) throws Exception {
        int id ,salary;
        String desig,name,add;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter eid,ename,designation,salary,address");
        id = sc.nextInt();
        name = sc.next();
        desig = sc.next();
        salary = sc.nextInt();
        add = sc.next();

        sc.close();
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Registered");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","mysql");
        System.out.println("Driver manager");
        String sql = "insert into employee values('"+id+"','"+name+"','"+desig+"','"+salary+"','"+add+"')";
        Statement st = con.createStatement();
        int i = st.executeUpdate(sql);

        if(i > 0){
            System.out.println("Save successfully");
        }
        else{
            System.out.println("Not saved");
        }

        st.close();
        con.close();
     }   
}