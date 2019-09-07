package com.my.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.my.dto.MyBoardDto;

public class MyBoardDao {
	
	public List<MyBoardDto> selectList(){
		// 1. driver 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. driver 연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("1. driever 연결 오류");
			e.printStackTrace();
		}
	
		// 2. 계정 연결
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 계정 연결 완료");
			
		} catch (SQLException e) {
			System.out.println("2. 계정 연결 오류");
			e.printStackTrace();
		}
		
		// 3. query 준비
		Statement stmt = null;
		ResultSet rs = null;
		List<MyBoardDto> list = new ArrayList<MyBoardDto>();
		
		String sql = " SELECT MYNO, MYNAME, MYTITLE, MYCONTENT, MYDATE FROM MYBOARD ";
		// 4. query 실행 및 연결
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				MyBoardDto dto = new MyBoardDto();
				dto.setMyno(rs.getInt(1));
				dto.setMyname(rs.getString(2));
				dto.setMytitle(rs.getString(3));
				dto.setMycontent(rs.getString(4));
				dto.setMydate(rs.getDate(5));		
				
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("3, 4. query문 오류");
			e.printStackTrace();
		} finally {
			try {
				// 5. db 종료
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("5. close 오류");
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public MyBoardDto selectOne(int myno) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver 연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("driver 연결 오류");
			e.printStackTrace();
		}
		
		Connection con = null;
		
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("계정 연결 완료");
		} catch (SQLException e) {
			System.out.println("계정 연결 오류");
			e.printStackTrace();
		}
		
		ResultSet rs = null;
		PreparedStatement pstm = null;
		MyBoardDto dto = new MyBoardDto();
		
		String sql = " SELECT MYNO, MYNAME, MYTITLE, MYCONTENT, MYDATE FROM MYBOARD WHERE MYNO = ? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, myno);
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				dto.setMyno(rs.getInt(1));
				dto.setMyname(rs.getString(2));
				dto.setMytitle(rs.getString(3));
				dto.setMycontent(rs.getString(4));
				dto.setMydate(rs.getDate(5));				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return dto;		
	}
	
	public int insert(MyBoardDto dto) {
		
		try {
			Class.forName("oracle.jdbc.driver.Oracle.Driver");
			System.out.println("driver 연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("driver 연결 오류");
			e.printStackTrace();
		}
		
		Connection con = null;
		
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("계정 연결 완료");
		} catch (SQLException e) {
			System.out.println("계정 연결 오류");
			e.printStackTrace();
		}
		
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " INSERT INTO MYBOARD VALUES(MYSEQ.NEXTVAL, ?, ?, ?, SYSDATE) ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, dto.getMyname());
			pstm.setString(2, dto.getMytitle());
			pstm.setString(3, dto.getMytitle());
			
			res = pstm.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return res;	
	}
	
	public int update(MyBoardDto dto) {
		try {
			Class.forName("oracle.jdbc.driver.Oracle.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "kh", "kh");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " UPDATE MYBOARD SET MYTITLE = ?, MYCONTENT = ?, MYDATE = SYSDATE WHERE MYNO = ? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1,  dto.getMytitle());
			pstm.setString(2,  dto.getMycontent());
			pstm.setInt(3, dto.getMyno());
			
			res = pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return res;
	}
	
	public int delete(int myno) {
		
		try {
			Class.forName("oracle.jdbc.driver.Oracle.Driver");
			System.out.println("driver 연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("driver 연결 오류");
			e.printStackTrace();
		}
		
		Connection con = null;
		
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		try {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("계정 연결 완료");
		} catch (SQLException e) {
			System.out.println("계정 연결 오류");
			e.printStackTrace();
		}
		
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " DELETE FROM MYBOARD WHERE MYNO = ? ";
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, myno);
			
			res = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		return res;		
	}
	
	
}
