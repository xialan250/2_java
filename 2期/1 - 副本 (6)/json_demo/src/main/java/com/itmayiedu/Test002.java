//
//package com.itmayiedu;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.itmayiedu.entity.Item;
//import com.itmayiedu.entity.User;
//
//public class Test002 {
//
//	public static void main(String[] args) {
//		// 1.json api ��װjson
//		JSONObject root = new JSONObject();
//		root.put("id", "01");
//		root.put("name", "����");
//		JSONArray arrayList = new JSONArray();
//		JSONObject object1 = new JSONObject();
//		object1.put("itemId", "20");
//		object1.put("itemName", "���Ͽ���");
//		JSONObject object2 = new JSONObject();
//		object2.put("itemId", "30");
//		object2.put("itemName", "ÿ��ѧԺ");
//		arrayList.add(object1); 
//		arrayList.add(object2);
//		root.put("items", arrayList);
//		System.out.println(root.toJSONString());
//		//2.������ת����json�ַ���
//		User user = new User();
//		user.setId("01");
//		user.setName("����");
//		List<Item> items =new ArrayList<Item>();
//		Item item1 = new Item();
//		item1.setItemId("20");
//		item1.setItemName("���Ͽ���");
//		Item item2 = new Item();
//		item2.setItemId("30");
//		item2.setItemName("ÿ��ѧԺ");
//		items.add(item1);
//		items.add(item2);
//		user.setItems(items);
//		System.out.println(new JSONObject().toJSONString(user));
//	}
//
//}
