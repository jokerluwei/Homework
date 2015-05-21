package com.P183_8;
import java.util.Scanner;

class JZ {
	int n, m;
	int[][] a;

	public JZ(int n, int m) {
		this.n = n;
		this.m = m;
		a = new int[n][m];
	}

	void Creat() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = (int) (Math.random() * 10);
	}

	void print(JZ b) {
		System.out.println("����Ϊ:");
		for (int i = 0; i < b.n; i++) {
			for (int j = 0; j < b.m; j++)
				System.out.print(b.a[i][j] + " ");
			System.out.println();
		}
	}

	void Add(JZ b) {
		JZ c = new JZ(n, m);
		if (b.n != n || b.m != m) {
			System.out.println("���������������");
			return;
		}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				c.a[i][j] = a[i][j] + b.a[i][j];
		System.out.print("��Ӻ�");
		print(c);
	}

	void Multi(JZ b) {
		JZ c = new JZ(n, b.m);
		if (m != b.n) {
			System.out.println("���������������");
			return;
		}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < b.m; j++)
				for (int k = 0; k < m; k++)
					c.a[i][j] += a[i][k] * b.a[k][j];
		System.out.print("��˺�");
		print(c);
	}
}

public class AddAndMulti {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("����Ҫ������һ��������С���:");
			int n = s.nextInt();
			int m = s.nextInt();
			JZ a = new JZ(n, m);
			a.Creat();
			System.out.println("����Ҫ�����ڶ���������С���:");
			n = s.nextInt();
			m = s.nextInt();
			JZ b = new JZ(n, m);
			b.Creat();
			a.print(a);
			b.print(b);
			a.Add(b);
			a.Multi(b);
			System.out.println("inout n to quit:");
			String c = s.next();
			char o = c.charAt(0);
			if (o == 'n' || o == 'N') {
				System.out.println("already quit");
				return;
			}
		}
	}
}