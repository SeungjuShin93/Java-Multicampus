import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ObjectExample9 {
	public static void main(String args[]) {
		Sungjuk obj = new Sungjuk();
		Class cls = obj.getClass();
		String name = cls.getName();
		System.out.println("Ŭ���� �̸�: " + name);
		Class superCls = cls.getSuperclass();
		String superName = superCls.getName();
		System.out.println("����Ŭ���� �̸�: " + superName);
		Field field[] = cls.getDeclaredFields();
		System.out.println("�ʵ�: ");
		for (int cnt = 0; cnt < field.length; cnt++)
			System.out.println(" " + field[cnt]);
		Method method[] = cls.getDeclaredMethods();
		System.out.println("�޼ҵ�: ");
		for (int cnt = 0; cnt < method.length; cnt++)
			System.out.println(" " + method[cnt]);
	}
}