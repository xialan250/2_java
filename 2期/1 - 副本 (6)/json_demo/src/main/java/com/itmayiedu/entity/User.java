
package com.itmayiedu.entity;

import java.util.List;

public class User  extends Object{

	private String id;
	private String name;
	private List<Item> items;

    public User(String id){
    	System.out.println("����ͨ���вι��캯����ʼ�� id:"+id);
    	this.id=id;
    }
    public User(){
    	System.out.println("�����޲������캯����ʼ��");
    }
	public String getId() {

		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public List<Item> getItems() {

		return items;
	}

	public void setItems(List<Item> items) {

		this.items = items;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", items=" + items + "]";
	}

}
