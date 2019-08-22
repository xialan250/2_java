
package com.itmayiedu;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.itmayiedu.entity.User;

public class Test005 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		// Ϊuser����˽�����Ը�ֵ
		Class<?> classUser = Class.forName("com.itmayiedu.entity.User");
		// ��ȡ����ǰ����������
		Field[] fields = classUser.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		// ��ȡ��ǰ���еķ���
		Method[] declaredMethods = classUser.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
		// ��ʼ������
		User user = (User) classUser.newInstance();
		Field declaredField = classUser.getDeclaredField("id");
		// ���Ϊtrue �����丳ֵ
		declaredField.setAccessible(true);
		declaredField.set(user, "20");
		System.out.println("ʹ�÷�����Ƹ�id��ֵΪ:"+user.getId());

	}

}
