package com.zz.utils;

import com.zz.pojo.Book;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author zwh
 * @Date 2020/8/3 10:14
 * @Version 1.0
 **/
public class Dom4jXml {

    private static ArrayList<Book> list = new ArrayList<>();

    /**
     * 迭代器
     */
    public void dom4jXml() {
        // 解析books.xml文件
        // 创建SAXReader的对象reader
        SAXReader reader = new SAXReader();
        try {
            // 通过reader对象的read方法加载books.xml文件,获取docuemnt对象。
            Document document = reader.read(new File("src/main/resources/books.xml"));
            // 通过document对象获取根节点bookstore
            Element bookStore = document.getRootElement();
            // 通过element对象的elementIterator方法获取迭代器
            Iterator it = bookStore.elementIterator();
            List elements = bookStore.elements();
            // 遍历迭代器，获取根节点中的信息（书籍）
            while (it.hasNext()) {
                list.add(method1(it));
            }
            for (Book book : list) {
                System.out.println("book = " + book);
            }
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private Book method1(Iterator it) {
        System.out.println("=====开始遍历某一本书=====");
        Element book = (Element) it.next();
        // 获取book的属性名以及 属性值
        List<Attribute> bookAttrs = book.attributes();
        for (Attribute attr : bookAttrs) {
            System.out.println("属性名：" + attr.getName() + "--属性值："
                    + attr.getValue());
        }
        Iterator itt = book.elementIterator();
        Book book1 = new Book();
        while (itt.hasNext()) {
            Element bookChild = (Element) itt.next();
            if ("name".equals(bookChild.getName())) {
                book1.setName(bookChild.getStringValue());
            } else if ("author".equals(bookChild.getName())) {
                book1.setAuthor(bookChild.getStringValue());
            } else if ("year".equals(bookChild.getName())) {
                book1.setYear(bookChild.getStringValue());
            } else if ("price".equals(bookChild.getName())) {
                book1.setPrice(bookChild.getStringValue());
            }

            System.out.println("节点名：" + bookChild.getName() + "--节点值：" + bookChild.getStringValue());
        }
        System.out.println("=====结束遍历某一本书=====");
        return book1;
    }

    public static void main(String[] args) throws DocumentException {
        Dom4jXml dom4jXml = new Dom4jXml();
//        dom4jXml.dom4jXml();
        Dom4jXml.newDom4jXml();
//        Dom4jXml.XpathXml();
    }

    public static void newDom4jXml1() {
        try {
            Document document = new SAXReader().read("src/main/resources/xml/everyday.xml");
            Element rootElement = document.getRootElement();
            System.out.println(rootElement.getName() + "..根.." + rootElement.getStringValue());
            List<Element> elements = rootElement.elements();
            for (Element element : elements) {
                List<Attribute> attributes = element.attributes();
                for (Attribute attribute : attributes) {
                    System.out.println(attribute.getName() + "..getValue.." + attribute.getValue());
//                    System.out.println(attribute.getName()+"..getStringValue.."+attribute.getStringValue());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void newDom4jXml() {
        try {
            Document document = new SAXReader().read("src/main/resources/xml/books.xml");
            Element rootElement = document.getRootElement();
            System.out.println("createDate = " + rootElement.attributeValue("createDate"));
            Iterator it = rootElement.elementIterator();
            while (it.hasNext()) {
                Element ele = (Element) it.next();
                List<Attribute> attributes = ele.attributes();
                for (Attribute attribute : attributes) {
                    System.out.println(attribute.getName() + "..." + attribute.getStringValue());
                }
                Iterator itt = ele.elementIterator();
                while (itt.hasNext()) {
                    Element ele1 = (Element) itt.next();
                    List<Attribute> attributes1 = ele1.attributes();
                    for (Attribute attribute : attributes1) {
                        System.out.println(attribute.getName() + "..." + attribute.getStringValue());
                    }
                    Iterator ittt = ele1.elementIterator();
                    while (ittt.hasNext()) {
                        Element next = (Element) ittt.next();
                        List<Attribute> attributes2 = next.attributes();
                        for (Attribute att : attributes2) {
                            System.out.println(att.getName() + "..." + att.getStringValue());
                        }
                    }
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * XPath读取xml
     */
    public static void XpathXml() {
        try {
            Document document = new SAXReader().read("src/main/resources/xml/everyday.xml");
            List<Element> list = document.selectNodes("//rule/when/get");
            for (Element ele : list) {
                List<Attribute> attributes = ele.attributes();
                for (Attribute attribute : attributes) {
                    System.out.println(attribute.getName()+"..."+attribute.getStringValue());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

