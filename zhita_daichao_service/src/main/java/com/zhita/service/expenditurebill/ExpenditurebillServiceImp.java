package com.zhita.service.expenditurebill;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhita.dao.manage.ExpenditureBillMapper;
import com.zhita.model.manage.DayBill;
import com.zhita.model.manage.ExpenditureBill;

@Service
public class ExpenditurebillServiceImp implements IntexpenditurebillService{
	@Autowired
	private ExpenditureBillMapper expenditureBillMapper;
	
    //添加支出账单信息
    public int addExpenditureBill(ExpenditureBill expenditureBill) {
    	int count=expenditureBillMapper.addExpenditureBill(expenditureBill);
    	return count;
    }
    //通过时间模糊查询   当前用户  当前月 所有支出金额总和
    public BigDecimal queryTotalMoney(Integer userid,String time,String company) {
    	BigDecimal sum=expenditureBillMapper.queryTotalMoney(userid, time,company);
    	return sum;
    }
    
    //通过时间模糊查询出当前用户  当前月 每一天  的支出详细信息
    public List<ExpenditureBill> queryAllByTimeLike(Integer userid,String time,String company){
    	List<ExpenditureBill> list=expenditureBillMapper.queryAllByTimeLike(userid, time,company);
    	return list;
    }
    
    //通过时间准确查询出当前用户  当前月 每一天  的支出详细信息
    public List<ExpenditureBill> queryAllByTime(Integer userid,String time,String company){
    	List<ExpenditureBill> list=expenditureBillMapper.queryAllByTime(userid, time,company);
    	return list;
    }
    
    //通过时间模糊查询出当前用户  当前月 每一天  的支出总和
    public List<DayBill> querySumByTimeLike(Integer userid,String time,String company) {
    	List<DayBill> listexpenditurelike=expenditureBillMapper.querySumByTimeLike(userid, time,company);
    	return listexpenditurelike;
    }
}