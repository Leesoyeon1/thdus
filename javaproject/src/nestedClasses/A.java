package nestedClasses;

public class A {//바깥클래스/
	A() {
		System.out.println("A객체가 생성됨");
	}


class B {//인스턴스 멤버 클래스/

	B() {
		System.out.println("B객체가 생성됨");
	}

	int field1;

	// static int field2
	void method1() {}
	// static void method2(){}
}

	static class C {//정적 멤버 클래스
	C() {
		System.out.println("C객체가 생성됨");
	}

	int field1;
	static int field2;

	void method1() {}
	
	static void method2() {}
	}
	void method() {
		class D {//로컬클래스

			D() {
				System.out.println("D객체가 생성됨");
			}

			int field1;

			// static int field2;
			void method1() {
			}
			// static void method2(){}
		}

		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
