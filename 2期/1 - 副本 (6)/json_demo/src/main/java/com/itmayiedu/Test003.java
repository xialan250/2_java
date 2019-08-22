
package com.itmayiedu;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test003 {

	public static void main(String[] args) throws DocumentException {
		// ����SAXReader
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File("F:\\student.xml"));
		Element rootElement = document.getRootElement();
		getNodes(rootElement);
	}

	public static void getNodes(Element element) {
		System.out.println("��ǰ�ڵ�����:" + element.getName());
		// ��ȡ��ǰ�ڵ���������
		List<Attribute> attributes = element.attributes();
		for (Attribute attribute : attributes) {
			System.out.println(attribute.getName() + "--" + attribute.getText());
		}
		String textTrim = element.getTextTrim();
		if(!textTrim.equals("")){
			System.out.println("��ǰ�ڵ�����:"+textTrim);
		}
		// ��ȡ��ǰ�ӽڵ�
		Iterator<Element> elementIterator = element.elementIterator();
		while (elementIterator.hasNext()) {
			Element next = elementIterator.next();
			getNodes(next);
		}
	}

}
