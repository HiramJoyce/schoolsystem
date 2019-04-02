package com.school.system.service;

import com.school.system.domain.Clazz;

import java.util.List;

public interface ClazzService {
    List<Clazz> getAllClazzs();

    Clazz getClazzById(String id);

    int updateClazz(Clazz clazz);

    int insertClazz(Clazz clazz);

    int deleteById(int id);
}
