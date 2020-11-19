package com.djz.service;

import com.djz.mapper.PersonMapper;
import com.djz.pojo.Person;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author djz
 * @date 2020/11/19 -8:32
 */
public class PersonMapperImpl implements PersonMapper {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Person> selectPerson() {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
//sqlSession.selectList(null)
        return mapper.selectPerson();
    }

    public void addPerson(Person person) {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
         mapper.addPerson(person);
    }

    public void deletePerson(int id) {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
     mapper.deletePerson(id);
    }

    public void updatePerson(Person person) {
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        mapper.updatePerson(person);
    }
}
