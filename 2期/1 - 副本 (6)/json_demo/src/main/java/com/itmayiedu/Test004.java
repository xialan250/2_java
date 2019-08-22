
package com.itmayiedu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.itmayiedu.entity.User;

public class Test004 {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		// 1.��ȡ��ǰ��class��ַ ������� ��˽�����Ը���
		// User user = new User();
		// 2.ͨ���������ʵ�������� <bean id="user" class="com.itmayiedu.entity.User">
		Class<?> classUser = Class.forName("com.itmayiedu.entity.User");
		// ʹ�÷�����ƴ�������
		System.out.println("ʹ��java������ƴ�������");
		// newInstance(ʹ��Ĭ���޲ι��캯����ʼ������)
		// User user = (User) classUser.newInstance();
		// user.setId("1");
		// user.setName("����");
		// System.out.println(user.getId()+"---"+user.getName());
		Constructor<?> constructor = classUser.getConstructor(String.class);
		User user = (com.itmayiedu.entity.User) constructor.newInstance("1");
		System.out.println(user.getId());
	}

}
