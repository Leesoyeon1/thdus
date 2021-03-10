package Object2.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods();//Service클래스에 선언된 메소드 얻기(리플렉션)
		Constructor[] constructors = Service.class.getDeclaredConstructors();
		java.lang.reflect.Field[] fields = Service.class.getDeclaredFields();
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				System.out.println("["+method.getName()+ "]");
				
				for(int i = 0; i<printAnnotation.number(); i++) {
					System.out.println(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new Service());
				}catch(Exception e) {}
				System.out.println();
				}
			}
		}	
	}
	
	


