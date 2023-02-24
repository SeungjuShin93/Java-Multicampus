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
        	System.out.println("usertbl 테이블에 값 추가하기 .....");
        	System.out.print("사원번호 입력 : ");
        	sabun = br.readLine();
            System.out.print("사원부서 입력 : ");
            deptname = br.readLine();
            System.out.print("이름 입력 : ");
            irum = br.readLine();
            System.out.print("성별 입력 : ");
            gender = br.readLine();
            System.out.print("이메일 입력 : ");
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
            System.out.println("\n데이터 삽입 성공!!!\n");
        }
        catch(Exception e) {
            System.out.println("데이터베이스 연결 실패! = "+e.getMessage());
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
		// 데이터베이스 내용은 반드시 try 안에 넣어야 함, 규칙
		try {
			Class.forName(driver); // JDBC 드라이버를 로드 한다
			con = DriverManager.getConnection(url, id, pw); // DB에 연결 한다
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
//			System.out.printf("\t\t 총사원수 : %d\n\n", count );
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
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
        	System.out.println("sawonbl 테이블에 값 수정하기 .....");
        	System.out.print("사원번호 입력 : ");
        	sabun = br.readLine();
            System.out.print("수정할 부서 입력 : ");
            deptname = br.readLine(); // 수정
            System.out.print("수정할 이메일 입력 : ");
            email = br.readLine(); // 수정
            
            String sql = "Update usertbl Set deptname = ?, email = ? Where sabun = ?";
            System.out.println(sql);
            
            Class.forName(driver);
            con = DriverManager.getConnection(url, id, pw);
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptname);
            pstmt.setString(2, email);
            pstmt.setString(3, sabun);
            pstmt.executeUpdate();
            System.out.println("\n사원정보 수정 성공!!!!!!\n");
        }
        catch(Exception e) {
            System.out.println("데이터베이스 연결 실패! = "+e.getMessage());
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
            System.out.println("sawon 테이블 값 삭제하기 .....");
            System.out.print("삭제할 아이디 입력 : ");
            sabun = br.readLine( );

            String sql = "Delete From sawon Where sabun = ?";
            System.out.println(sql);

            Class.forName(driver);
            con = DriverManager.getConnection(url, id, pw);
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sabun);
            pstmt.executeUpdate();
            System.out.println("\n데이터베이스 내용 삭제 성공!\n");
        }
        catch(Exception e) {
            System.out.println("데이터베이스 연결 실패!"+e.getMessage());
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