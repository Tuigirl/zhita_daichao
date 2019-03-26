package com.zhita.service.bill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhita.dao.manage.UnitPriceMapper;
import com.zhita.model.manage.UnitPrice;

@Service
public class UnitPriceServiceImp implements UnitPriceService{

	@Autowired
	UnitPriceMapper unitPriceMapper;

	@Override
	public int setunitprice(int sourceId, int businessesId, String firmType, String account, int price, String accountType,String registrationTime,String company) {
		int number = unitPriceMapper.setunitprice(sourceId,businessesId,firmType,account,price,accountType,registrationTime,company);
		return number;
	}

	@Override
	public int updateUnitPrice(int sourceId, int businessesId, String firmType, String account, int price, String accountType,int id,String registrationTime) {
		int number = unitPriceMapper.updateUnitPrice(sourceId,businessesId,firmType,account,price,accountType,id,registrationTime);
		return number;
	}

	@Override
	public int deleteUnitPrice(int id,String registrationTime) {
		int number = unitPriceMapper.deleteUnitPrice(id,registrationTime);
		return number;
	}

	@Override
	public int deleteFirm(int sourceId, String account, String registrationTime,String company) {
		int number = unitPriceMapper.deleteFirm(sourceId,account,registrationTime,company);
		return number;
	}

	@Override
	public List<String> getaccount(String firm, String firmType) {
		List<String> list = unitPriceMapper.getaccount(firm,firmType);
		return list;
	}

	@Override
	public List<Integer> getprice(String account) {
		List<Integer> list = unitPriceMapper.getprice(account);
		return list;
	}

	@Override
	public List<UnitPrice> getunitprice(int sourceId,String company) {
		List<UnitPrice> accountList = unitPriceMapper.getunitprice(sourceId,company);
		return accountList;
	}

}