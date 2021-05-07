package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.HelloMapper;
import org.example.model.Hello;


import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class Main {

        public static void main(String[] args) throws IOException {
            LogFactory.useLog4JLogging();
            InputStream inputStream = Resources.getResourceAsStream("mybatics/mybatics.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            inputStream.close();
//            int john = 0;
//            int ken = 0;
            int bin = 0;
            try {
                SqlSession session = sqlSessionFactory.openSession();
                HelloMapper helloMapper = session.getMapper(HelloMapper.class);

//                Hello John = Hello.builder()
//                        .id(1)
//                        .content("Hello, I'm John !")
//                        .number(12)
//                        .name("John Calvin")
//                        .build();
//
//                Hello Ken = Hello.builder()
//                        .id(2)
//                        .content("Hello, I'm Ken !")
//                        .number(45)
//                        .name("Ken Zimba")
//                        .build();
//
//
//
//                john = helloMapper.insertHello(John);
//                ken = helloMapper.insertHello(Ken);

                Hello Bin = Hello.builder()
                        .id(3)
                        .content("Hello. I'm Bin Heen!")
                        .name("Bin Heen")
                        .number(34)
                        .build();

                bin = helloMapper.updateHello(Bin);
//                System.out.println("Bin: " + bin);

//                helloMapper.selectAllHello().forEach(hello -> System.out.println(hello.toString()));
                session.commit();
                session.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            finally {
//                System.out.println("John: " + john);
//                System.out.println("Ken: " + ken);
//                System.out.println("End");
            }
//            System.out.println(bin);

    }

}
