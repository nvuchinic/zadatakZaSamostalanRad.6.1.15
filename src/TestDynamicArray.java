
public class TestDynamicArray {
public static void main(String[] args) {
	String s1="nermin";
	String s2="haris";
	String s3="Sanela";
	String s4="amra";
	String s5="nedim";
	
	DynamicStringArray dsa=new DynamicStringArray(8);
	dsa.add(s1);
	dsa.add(s2);
	dsa.add(s3);
	dsa.add(s4);
	dsa.add(s5);
	dsa.array=dsa.toArray();
	for(int i=0;i<dsa.array.length;i++)
		System.out.println(dsa.toArray()[i]);

	
}
}
