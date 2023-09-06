package com.main;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Mainapp {

	public static void main(String[] args)throws SQLException {
		Scanner sc=new Scanner(System.in);

		int b = 0;

		do{

		System.out.println("===================="); System.out.println("1.Adduser\n2.Updateuser\n3.Deleteuser\n4.Viewuser\n5. Exit"); 
		System.out.println("take your action here");

		b=sc.nextInt();

		if(b==1) { 
			Adduser();}
		}

		while(b<=5);
		
	}
		public static Connection getConnection() { 

			Connection connection=null;

			try {

			String url="jdbc:mysql://localhost:3306/jdbc";

			String uname="root";

			String pass="Grs@1281";

			Class.forName("com.mysql.cj.jdbc.Driver"); 
			connection=DriverManager.getConnection (url, uname, pass);
			}
			catch (Exception e) {
			e.printStackTrace();
			}
			return connection;
		}
		public static int Adduser() throws SQLException {

			Connection connection=null;
			Scanner sc= new Scanner(System.in);

			try {

			int patient_id;

			System.out.println("enter the patient_id"); 
			patient_id=sc.nextInt();

			String patient_name;

			System.out.println("enter the patient_name");

			patient_name=sc.next();
			 String patient_disease;

			System.out.println("enter the patient disease");

			patient_disease=sc.next();
			int patient_age; System.out.println("enter the patient age");
			patient_age=sc.nextInt(); 
			String patient_insurance;

			System.out.println("enter the patient insurance");

			patient_insurance=sc.next();
			
			//we need to enter the query here
			
			String query ="insert into patient values (?,?,?,?,?)";

			connection=Mainapp.getConnection();

			PreparedStatement psmt= connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

			psmt.setInt(1, patient_id);

			psmt.setString(2, patient_name); psmt.setString(3, patient_disease);

			psmt.setInt(4, patient_age);

			psmt.setString(5, patient_insurance); int count=psmt.executeUpdate();

			if(count >0) {

			System.out.println("Inserted Successfully");
			}

			else {
			System.out.println("Failed to Insert");
			}
			catch (Exception e) {

			e.printStackTrace();

			}
			finally {

				try {
				if((connection!=null)&(connection. isClosed())) {
				 connection.close();
				}
				catch (Exception e) {

				e.printStackTrace();

				}
				finally {

				int choise; 
				System.out.println("1)Add More Values\n2)Exit");

				choise= sc.nextInt();

				if(choise==1) { Adduser();

				}else {

				System.out.println("Thanks for using our application");

				}

				}

				} return 0;

				}
			}
			*/
/*
import java.sql.Connection;
import java.lang.String;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Mainapp {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        int b = 0;

        do {
            System.out.println("====================");
            System.out.println("1.Adduser\n2.Updateuser\n3.Deleteuser\n4.Viewuser\n5. Exit");
            System.out.println("take your action here");

            b = sc.nextInt();

            if (b == 1) {
                Adduser();
            }

        } while (b <= 5);

        sc.close();
    }

    public static Connection getConnection() {

        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String uname = "root";
            String pass = "Grs@1281";

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, uname, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static int Adduser() throws SQLException {
        Connection connection = null;
        Scanner sc = new Scanner(System.in);

        try {
            int patient_id;
            System.out.println("enter the patient_id");
            patient_id = sc.nextInt();

            String patient_name;
            System.out.println("enter the patient_name");
            patient_name = sc.next();

            String patient_disease;
            System.out.println("enter the patient disease");
            patient_disease = sc.next();

            int patient_age;
            System.out.println("enter the patient age");
            patient_age = sc.nextInt();
          
   

            String patient_insurance;
            System.out.println("enter the patient insurance");
            patient_insurance = sc.next();

            String query = "insert into patient values (?,?,?,?,?)";

            connection = Mainapp.getConnection();
            PreparedStatement psmt = connection.prepareStatement(query);

            psmt.setInt(1, patient_id);
            psmt.setString(2, patient_name);
            psmt.setString(3, patient_disease);
            psmt.setInt(4, patient_age);
            psmt.setString(5, patient_insurance);

            int count = psmt.executeUpdate();

            if (count > 0) {
                System.out.println("Inserted Successfully");
            } else {
                System.out.println("Failed to Insert");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                int choice;
                System.out.println("1) Add More Values\n2) Exit");
                choice = sc.nextInt();

                if (choice == 1) {
                    Adduser();
                } else {
                    System.out.println("Thanks for using our application");
                }
            }  
        }return 0;
    }*/


import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.Scanner;

 

public class Mainapp {

 

    public static void main(String[] args) throws SQLException {

        

        Scanner sc=new Scanner(System.in);

        int b = 0;

        

        do{

        System.out.println("=================================");    

        System.out.println("1.Adduser\n2.Updateuser\n3.Deleteuser\n4.Viewuser\n5.Exit");

        System.out.println("take your action here");

    

         b=sc.nextInt();

         

         if(b==1) {

             Adduser();

         }

        

         if(b==2) {

             Updateuser();

         }

         if(b==3) {

             Deleteuser();

         }

         if(b==4) {

             Viewuser();

         }

        

        }while(b<=5);

    

        

 

    }

    

    public static Connection getConnection() {

        

        Connection connection=null;

        

        try {

            

            String url="jdbc:mysql://localhost:3306/jdbc";

            String uname="root";

            String pass="Grs@1281";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection=DriverManager.getConnection(url,uname,pass);

            

            

        }catch (Exception e) {

            

        

            e.printStackTrace();

        }

        

        return connection;

        

    }

    

 

    public static int  Adduser() throws SQLException {

        

 

        

    Connection connection=null;

        Scanner sc= new Scanner(System.in);

        

        try {

            int patient_id;

            System.out.println("enter the patient_id");

            patient_id=sc.nextInt();

            String patient_name;

            System.out.println("enter the patient_name");

            patient_name=sc.next();

            String patient_disease;

            System.out.println("enter the patient_disease");

            patient_disease=sc.next();

            int patient_age;

            System.out.println("enter the patient_age");

            patient_age=sc.nextInt();

            String patient_insurance;

            System.out.println("enter the patient_insurance");

            patient_insurance=sc.next();

            

//we need to enter the query here     .        

    

            String query="insert into patient values(?,?,?,?,?)";

            connection=Mainapp.getConnection();

            PreparedStatement psmt = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

            psmt.setInt(1, patient_id);

            psmt.setString(2, patient_name);

            psmt.setString(3, patient_disease);

            psmt.setInt(4, patient_age);

            psmt.setString(5, patient_insurance);

            

            int count=psmt.executeUpdate();

            

            if(count>0) {

                System.out.println("Inserted Successfully");

            }else {

                System.out.println("Failed to Insert");

            }

            

            

        }catch (Exception e) {

            

        

            e.printStackTrace();

        }

         finally {

             

             try {

                 

                 if((connection!=null)&(connection.isClosed())){

                     connection.close();

                     

                 }

                 

             }catch (Exception e) {

                 

                e.printStackTrace();

            }finally {

                int choise;

                System.out.println("1)Add More Values\n2)Exit");

                choise = sc.nextInt();

                if(choise==1) {

                    Adduser();

                }else {

                    System.out.println("Thanks for using our application");

                    

                }

            }

        }

        return 0;

 

        

    }

    

    public static int  Updateuser() {

        

        Scanner sc=new Scanner(System.in);

        Connection connection=null;

        

        

        try {

            

            String patient_name;

            System.out.println("update the patient_name");

            patient_name=sc.next();

            String patient_disease;

            System.out.println("update the patient_disease");

            patient_disease=sc.next();

            int patient_age;

            System.out.println("update the patient_age");

            patient_age=sc.nextInt();

            String patient_insurance;

            System.out.println("update the patient_insurance");

            patient_insurance=sc.next();

            int patient_id;

            System.out.println("update the patient_id");

            patient_id=sc.nextInt();

            

            String query="update patient  set patient_name=?,patient_disease=?,patient_age=?,patient_insurance=? where patient_id="+ patient_id;

            connection=Mainapp.getConnection();

            PreparedStatement psmt = connection.prepareStatement(query);

            

            psmt.setString(1, patient_name);

            psmt.setString(2, patient_disease);

            psmt.setInt(3, patient_age);

            psmt.setString(4, patient_insurance);

 

            

            int count=psmt.executeUpdate();

            

            if(count>0) {

                System.out.println("Inserted Successfully");

            }else {

                System.out.println("Failed to Insert");

            }

            

            

            

        }catch (Exception e) {

            e.printStackTrace();

        }finally {

            

            try {

            

                if((connection!=null)&(connection.isClosed())){

                     connection.close();

                     

                 }

                

            }catch (Exception e) {

                

                e.printStackTrace();

                

        }

        return 0;

        

        }

    }

    

    public static int Deleteuser() {

        

        

        Connection connection=null;

        

        try {

            

            System.out.println("Enter the patient id to delete ");

            Scanner sc=new Scanner(System.in);

            int patient_id=sc.nextInt();

            String query="delete from patient where patient_id ="+patient_id;

            connection=Mainapp.getConnection();

            PreparedStatement ps=connection.prepareStatement(query);

            int result=ps.executeUpdate();

            if(result>0) {

                System.out.println("record deleted sucessfully");

            }

            

        }catch (Exception e) {

            

            e.printStackTrace();

        }finally {

            

            try {

                

                connection.close();

                 

                

            }catch (Exception e) {

                e.printStackTrace();

            }

        }

        return 0;

    }

    

    public static int  Viewuser() {

        

        Scanner sc=new Scanner(System.in);

        Connection connection=null;

        try {

            System.out.println("enter the id");

            int patient_id = sc.nextInt();

            String query="select * from patient where patient_id=" + patient_id ;

            

            connection=Mainapp.getConnection();

            Statement st=connection.createStatement();

            

            ResultSet rs=st.executeQuery(query);

            

                while(rs.next()) {

                System.out.println(rs.getString("patient_id"));

                System.out.println(rs.getString("patient_name"));

                System.out.println(rs.getString("patient_disease"));

                System.out.println(rs.getString("patien_age"));

                System.out.println(rs.getString("patient_insurance"));

                System.out.println();

            }

            

            

        }catch (Exception e) {

            

            e.printStackTrace();

        }finally {

            try {

                connection.close();

            }catch (Exception e) {

                e.printStackTrace();

            }

        }

        return 0;

        

 

    }

 

}
