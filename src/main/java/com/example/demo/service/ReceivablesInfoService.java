package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.mapper.ReceivablesInfoMapper;
import com.example.demo.model.entity.ReceivablesInfo;

public interface ReceivablesInfoService extends ReceivablesInfoMapper{

	List<ReceivablesInfo> listReceivablesInfo();
}
