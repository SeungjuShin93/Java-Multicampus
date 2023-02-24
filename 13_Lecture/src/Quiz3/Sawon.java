package Quiz3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class Sawon {
	String sabun, deptname, irum, gender, email;

	Sawon() {
	}

	void inputData() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";
        Connection con = null;
        PreparedStatement pstmt = null;
        
        String sql = "Insert Into sawon(sabun, deptname, irum, gender, email) Values (?,?,?,?,?)";
   
        
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("usertbl ���̺� �� �߰��ϱ� .....");
        	System.out.print("�����ȣ �Է� : ");
        	sabun = br.readLine();
            System.out.print("����μ� �Է� : ");
            deptname = br.readLine();
            System.out.print("�̸� �Է� : ");
            irum = br.readLine();
            System.out.print("���� �Է� : ");
            gender = br.readLine();
            System.out.print("�̸��� �Է� : ");
            email = br.readLine();
            

            System.out.println(sql);
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, id, pw);
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sabun);
            pstmt.setString(2, deptname);
            pstmt.setString(3, irum);
            pstmt.setString(4, gender);
            pstmt.setString(5, email);
            pstmt.executeUpdate();
            System.out.println("\n������ ���� ����!!!\n");
        }
        catch(Exception e) {
            System.out.println("�����ͺ��̽� ���� ����! = "+e.getMessage());
        }
        finally {
            try {
                if(con != null) con.close( );
                if(pstmt != null) pstmt.close( );
            }
            catch(Exception e) {
                System.out.println(e.getMessage( ));
            }
        }
	}

	public void outputData() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "Select * From sawon";
		String count = "SELECT COUNT(*) FROM sawon";
		// �����ͺ��̽� ������ �ݵ�� try �ȿ� �־�� ��, ��Ģ
		try {
			Class.forName(driver); // JDBC ����̹��� �ε� �Ѵ�
			con = DriverManager.getConnection(url, id, pw); // DB�� ���� �Ѵ�
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("sabun   deptname   irum   gender   email");
			System.out.println("-------------------------------------------------------------------");
			while (rs.next()) {
				System.out.print(rs.getString("sabun") + "   ");
				System.out.print(rs.getString("deptname") + "   ");
				System.out.print(rs.getString("irum") + "   ");
				System.out.print(rs.getString("gender") + "   ");
				System.out.print(rs.getString("email") + "   \n");
			}
			
//			stmt.executeUpdate(count);
//			System.out.println("=====================================");
//			System.out.printf("\t\t �ѻ���� : %d\n\n", count );
		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ����!");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void updateData() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";
        Connection con = null;
        PreparedStatement pstmt = null;
        
        String sabun, deptname, email;
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("sawonbl ���̺� �� �����ϱ� .....");
        	System.out.print("�����ȣ �Է� : ");
        	sabun = br.readLine();
            System.out.print("������ �μ� �Է� : ");
            deptname = br.readLine(); // ����
            System.out.print("������ �̸��� �Է� : ");
            email = br.readLine(); // ����
            
            String sql = "Update usertbl Set deptname = ?, email = ? Where sabun = ?";
            System.out.println(sql);
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, id, pw);
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptname);
            pstmt.setString(2, email);
            pstmt.setString(3, sabun);
            pstmt.executeUpdate();
            System.out.println("\n������� ���� ����!!!!!!\n");
        }
        catch(Exception e) {
            System.out.println("�����ͺ��̽� ���� ����! = "+e.getMessage());
        }
        finally {
            try {
                if(con != null) con.close( );
                if(pstmt != null) pstmt.close( );
            }
            catch(Exception e) {
                System.out.println(e.getMessage( ));
            }
        }
	}
	
	public void deleteData() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tabledb?serverTimezone=UTC";
		String id = "root";
		String pw = "123456";
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("sawon ���̺� �� �����ϱ� .....");
            System.out.print("������ ���̵� �Է� : ");
            sabun = br.readLine( );

            String sql = "Delete From sawon Where sabun = ?";
            System.out.println(sql);

            Class.forName(driver);
            con = DriverManager.getConnection(url, id, pw);
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sabun);
            pstmt.executeUpdate();
            System.out.println("\n�����ͺ��̽� ���� ���� ����!\n");
        }
        catch(Exception e) {
            System.out.println("�����ͺ��̽� ���� ����!"+e.getMessage());
        }

        finally {
            try {
                if(pstmt != null) pstmt.close( );
                if(con != null) con.close( );
            }
            catch(Exception e) {
                System.out.println(e.getMessage( ));
            }
        }
	}
}