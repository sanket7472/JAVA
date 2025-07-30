package wrapperClass;

public class AutoWrapping {

	public static void main(String[] args) {
		
		 Byte b = 127;//boxing
		 byte b1 = b;//unboxing
		 System.out.println(b+"--------->"+b1);
		 
		 Short s = 100;
		 short s1 = s;
		 System.out.println(s+"--------->"+s1);
		 
		 Integer i = 1500;
		 int i1 = i;
		 System.out.println(i+"--------->"+i1);
		 
		 Long l = 1000l;
		 long l1 = l;
		 System.out.println(l+"--------->"+l1);
		 
		 Character c = 'a';
		 char ch = c;
		 System.out.println(c+"--------->"+ch);
		 
		 Float f = 3.14f;
		 float f1 = f;
		 System.out.println(f+"--------->"+f1);
		 
		 Double d = 111.11;
		 double d1 = d;
		 System.out.println(d+"--------->"+d1);
		 
		 Boolean a = true;
		 boolean a1 = a;
		 System.out.println(a+"--------->"+a1);
		 
	}
}
