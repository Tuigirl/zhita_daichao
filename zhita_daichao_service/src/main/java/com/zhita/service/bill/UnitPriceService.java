package com.zhita.service.bill;

import java.util.List;

import com.zhita.model.manage.UnitPrice;

public interface UnitPriceService {

	int setunitprice(int sourceId, int businessesId, String firmType, String account, int price, String accountType, String registrationTime, String company);

	int updateUnitPrice(int sourceId, int businessesId, String firmType, String account, int price, String accountType, int id, String registrationTime, String company);

	int deleteUnitPrice(int id, String registrationTime);

	int deleteFirm(int sourceId, String account, String registrationTime, String company);

	List<String> getaccount(String firm, String firmType);

	List<Integer> getprice(String account);

	List<UnitPrice> getunitprice(int sourceId, String company, int pages, int pageSize);

	int getbusinessesId(String account, String company);

	List<UnitPrice> getaccountBySourceId(String company, Integer sourceId, String firmType, int pages, int pageSize);

	List<Object> getaccountById(int sourceId, String company);

	int setunitprice1(UnitPrice unitPrice);

	int pageCountUnitprice(int sourceId, String company);

	String getaccountType(String company, String account);

	List<Object> getPrice(String company, String account);

	Integer getSourceTo(String company, String account);

	int pageCountUnitprice1(Integer businessesId, String company);

	List<UnitPrice> getunitprice1(Integer businessesId, String company, int pages, int pageSize);




}