package org.Inbuild;

public class Strings {
        public static void main(String[] args) {
			String a = "Chintu";
			char charAt = a.charAt(0);
			System.out.println(charAt);
			
			int indexOf = a.indexOf("t");
			System.out.println(indexOf);
			
			int last = a.lastIndexOf("u");
			System.out.println(last);
			
			int length = a.length();
			System.out.println(length);
			
			boolean empty = a.isEmpty();
			System.out.println(empty);
			
			boolean contains = a.contains("v");
			System.out.println(contains);
			
			boolean startsWith = a.startsWith("ch");
			System.out.println(startsWith);
			
			
			boolean endsWith = a.endsWith("tu");
			System.out.println(endsWith);
			
			String upperCase = a.toUpperCase();
			System.out.println(upperCase);
			
			String lowerCase = a.toLowerCase();
			System.out.println(lowerCase);
			
			String q="hattori";
			String w="umikoo";
			boolean equals = q.equals(w);
			System.out.println(equals);
			
			
			boolean equalsIgnoreCase = q.equalsIgnoreCase(w);
			System.out.println(equalsIgnoreCase );
			
			String replace = q.replace("tt", "yy");
			System.out.println(replace);
			
			String replaceAll = q.replaceAll("hattori", "chinsoo");
			System.out.println(replaceAll);
			
			String substring = q.substring(3);
			System.out.println(substring);
			
			String substring2 = w.substring(1, 3);
			System.out.println(substring2);
			
			int compare = q.compareTo(w);
			System.out.println(compare);
			
			
			
			
			
			
			
		}
}
