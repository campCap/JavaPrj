package data.jadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		out: 
		while (true) {

			switch (inputMenu()) {
			case 1: // �Խñ� �Է�
				inputNotice();
				break;
			case 2: // �Խñ� ��ȸ
				listNotice();
				break;
			case 3:
				System.out.println("\tSystem : ���α׷� ����");
				break out;
			}
		}

	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������������������������������");
		System.out.println("��         �Ͱ� �޴�         ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1.�Խñ� �Է�  ");
		System.out.println("\t2.�Խñ� ��ȸ  ");
		System.out.println("\t3.  ��	��  ");
		System.out.print("\t>>_ ");
		int menu = scan.nextInt();
		return menu;
	}

	private static void listNotice() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";
		// ����̹� �ε�
		Class.forName("oracle.jdbc.OracleDriver");
		// ���� / ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		// ����
		Statement st = con.createStatement();
		// �����������
		ResultSet rs = st.executeQuery(sql);
		while (rs.next())
			System.out.printf("ID : %s   TITLE : %s 	CONTENT : %s\n", rs.getString("ID"), rs.getString("title"),
					rs.getString("CONTENT"));

		rs.close();
		st.close();
		con.close();

	}

	private static void inputNotice() throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String id = scan.nextLine();
		System.out.print("�� ��  �Է� : ");
		String title = scan.nextLine();
		System.out.print("�� ��  �Է� : ");
		String content = scan.nextLine();
		System.out.print("�ۼ��� �Է� : ");
		String writer = scan.nextLine();

		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "INSERT INTO NOTICE(ID, TITLE, CONTENT, WRITER_ID, HIT)" + " VALUES('" + id + "','" + title + "','"
				+ content + "','" + writer + "'," + 0 + ")";

		// ����̹� �ε�
		Class.forName("oracle.jdbc.OracleDriver");
		// ���� / ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		// ����
		Statement st = con.createStatement();

		st.executeUpdate(sql);
		st.close();
		con.close();

	}

}
