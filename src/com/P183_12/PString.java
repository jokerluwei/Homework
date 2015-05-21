package com.P183_12;

import java.io.*;


public class PString {
	public static void main(String[] args) {
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s = null;
			String c = null;
			try {
				System.out.println("输入要检索的字符串:");
				s = k.readLine();
				if(s.length()==0)
					continue;
				System.out.println("输入要检索的字符:");
				c = k.readLine();
				while(c.length()!=1){
					System.out.println("输入字符有误，请重新输入:");
					c=k.readLine();
				}
				char a = c.charAt(0);
				int n = 0;
				int i = 0;
				while (n >= 0) {
					n = s.indexOf(a);
					if (n >= 0) {
						s = s.substring(n + 1);
						i++;
					}
				}
				System.out.println("所检索的频率为:" + i);
				System.out.println("input n to quit:");
				c = k.readLine();
				while(c.length()!=1){
					System.out.println("输入字符有误，请重新输入:");
					c=k.readLine();
				}
				a = c.charAt(0);
				if (a == 'n' || a == 'N') {
					System.out.println("already quit");
					return;
				}
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (IOException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
