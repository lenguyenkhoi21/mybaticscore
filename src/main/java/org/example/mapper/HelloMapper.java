package org.example.mapper;

import org.example.model.Hello;

import java.util.List;


public interface HelloMapper {
    Hello selectHello(Hello hello);
    List<Hello> selectAllHello();
    int insertHello(Hello hello);
    int updateHello(Hello hello);
    int deleteHello(Hello hello);
}
