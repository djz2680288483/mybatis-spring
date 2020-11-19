package com.djz.service;

import com.djz.mapper.PersonMapper;
import com.djz.pojo.Person;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/19 -9:14
 */
public class PersonMapperImpl2 extends SqlSessionDaoSupport implements PersonMapper {

    public List<Person> selectPerson() {
        SqlSession session=getSqlSession();
      PersonMapper mapper=  session.getMapper(PersonMapper.class);

        return mapper.selectPerson();
    }

    public void addPerson(Person person) {
        SqlSession session=getSqlSession();
        PersonMapper mapper=  session.getMapper(PersonMapper.class);
        mapper.addPerson(person);
    }

    public void deletePerson(int id) {
        SqlSession session=getSqlSession();
        PersonMapper mapper=  session.getMapper(PersonMapper.class);
        mapper.deletePerson(id);

    }

    public void updatePerson(Person person) {
        SqlSession session=getSqlSession();
        PersonMapper mapper=  session.getMapper(PersonMapper.class);
        mapper.updatePerson(person);
    }
}
