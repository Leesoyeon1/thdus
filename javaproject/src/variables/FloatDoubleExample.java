package variables;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		double var2 = 3.15F;
		
		double result = var1 + var2;
		
		double var4 = 0.1234567890123456789;
		double var5 = 0.1234567890123456789F;
		System.out.println("doubleŸ��:" + var4);
		System.out.println("floatŸ��:" + var5);
		double var7 =3e-6;
		System.out.println(var7);
		
		boolean b1 = (10 <5);
//		if (10<5) {
//			System.out.println("�����Դϴ�.");
//		}
		
		b1 = false;
		
		if(b1) {
			System.out.println("������ ���Դϴ�.");
		}else {
			System.out.println("������ �����Դϴ�.");
		}
		
	}

}
