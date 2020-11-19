package com.djz.test;

import com.djz.mapper.PersonMapper;
import com.djz.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/19 -8:44
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
          PersonMapper mapper=  context.getBean("personMapper2", PersonMapper.class);
//          List<Person> persons= mapper.selectPerson();
//          for (Person p:persons){
//              System.out.println(p);
//          }
//        Person person=new Person(4,"libai",35);
//        mapper.addPerson(person);


    }
}
