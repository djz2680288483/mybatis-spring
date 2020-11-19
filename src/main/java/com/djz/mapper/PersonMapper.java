package com.djz.mapper;

import com.djz.pojo.Person;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/18 -15:58
 */
public interface PersonMapper {
    public   List<Person> selectPerson();
    public   void addPerson(Person person);
    public   void deletePerson(int id);
    public void updatePerson(Person person);
}
