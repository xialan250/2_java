
package com.itmayiedu;

import java.util.ArrayList;
import java.util.List;

import com.itmayiedu.entity.UserEntity;

class UserSendThread implements Runnable {
	private List<UserEntity> listUser;

	public UserSendThread(List<UserEntity> listUser) {
		this.listUser = listUser;
	}
	
	public void run() {
		for (UserEntity userEntity : listUser) {
			System.out.println(Thread.currentThread().getName() + "," + userEntity.toString());
		}
		System.out.println();
	}

//	@Override
//	public void run(){
//		for (UserEntity userEntity : listUser) {
//			System.out.println(Thread.currentThread().getName()+","+userEntity.toString());
//		}
//		System.out.println();
//	}
}

public class BatchSms {

	public static void main(String[] args) {
		// 1.��ʼ������
		List<UserEntity> initUser = initUser();
		// 2.����ÿ���̷߳������ʹ�С
		int userCount = 2;
		// 3.����ÿ������Ҫ�����ܵ�����
		List<List<UserEntity>> splitList = ListUtils.splitList(initUser, userCount);
		for (int i = 0; i < splitList.size(); i++) {
			List<UserEntity> list = splitList.get(i);
			UserSendThread userSendThread = new UserSendThread(list);
			// 4.���䷢��
			Thread thread = new Thread(userSendThread, "�߳�" + i);
			thread.start();
		}

	}

	static private List<UserEntity> initUser() {
		List<UserEntity> list = new ArrayList<UserEntity>();
		for (int i = 1; i <= 11; i++) {
			list.add(new UserEntity("userId:" + i, "userName:" + i));
		}
		return list;
	}

}
