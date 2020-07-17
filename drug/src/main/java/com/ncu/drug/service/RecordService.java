package com.ncu.drug.service;


import com.ncu.drug.mapper.RecordMapper;
import com.ncu.drug.pojo.MedicalList;
import com.ncu.drug.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {
    @Autowired(required = false)
    RecordMapper recordMapper;

    public List<Record> findRecordById(Record record){
        return recordMapper.select(record);
    }
}
