package com.P183_8;

import java.util.Scanner;

class JZs {
	int n, m;
	int[][] a;

	public JZs(int n, int m) {
		this.n = n;
		this.m = m;
		a = new int[n][m];
	}

	void Creat() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = (int) (Math.random() * 10);
	}

	void print(JZs b) {
		System.out.println("矩阵为:");
		for (int i = 0; i < b.n; i++) {
			for (int j = 0; j < b.m; j++)
				System.out.print(b.a[i][j] + " ");
			System.out.println();
		}
	}

	void Add(JZs b) {
		JZs c = new JZs(n, m);
		int t = n > b.n ? n : b.n;
		int s = m > b.m ? m : b.m;
		try {
			for (int i = 0; i < t; i++)
				for (int j = 0; j < s; j++)
					c.a[i][j] = a[i][j] + b.a[i][j];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n这两个矩阵不能相加\n");
			return;
		}
		System.out.print("相加后");
		print(c);
	}

	void Multi(JZs b) {
		JZs c = new JZs(n, b.m);
		int t = m > b.n ? m : b.n;
		try {
			for (int i = 0; i < n; i++)
				for (int j = 0; j < b.m; j++)
					for (int k = 0; k < t; k++)
						c.a[i][j] += a[i][k] * b.a[k][j];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\n这两个矩阵不能相乘");
			return;
		}
		System.out.print("相乘后");
		print(c);
	}
}

public class AAndM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("输入要建立第一个矩阵的行、列:");
			int n = s.nextInt();
			int m = s.nextInt();
			while (n <= 0 || m <= 0) {
				System.out.println("矩阵大小输入有误，请重新输入:");
				n = s.nextInt();
				m = s.nextInt();
			}
			JZs a = new JZs(n, m);
			a.Creat();
			a.print(a);
			System.out.println("输入要建立第二个矩阵的行、列:");
			n = s.nextInt();
			m = s.nextInt();
			while (n <= 0 || m <= 0) {
				System.out.println("矩阵大小输入有误，请重新输入:");
				n = s.nextInt();
				m = s.nextInt();
			}
			JZs b = new JZs(n, m);
			b.Creat();
			b.print(b);
			a.Add(b);
			a.Multi(b);
			System.out.println("inout n to quit:");
			String c = s.next();
			char o = c.charAt(0);
			if(c.length() == 1&&(o == 'n' || o == 'N')) {
				System.out.println("already quit");
				return;
			}
		}
	}
}