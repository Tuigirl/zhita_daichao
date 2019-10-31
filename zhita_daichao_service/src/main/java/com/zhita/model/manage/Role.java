package com.zhita.model.manage;

import java.util.List;

//角色表
public class Role {
    private Integer id;//角色id

    private String rolename;//角色名称

    private String rolemiaoshu;//角色描述

    private String deleted;//角色状态（ 1:已禁用 0:已启用）
    
    private String company;//公司名
    
    private List<Functions> listfunction;//一个角色对应多个功能
    
    private List<String> listfunctionId;//做添加操作时   存权限id的集合
    
    private String listfunctionIdString;//做添加操作时   存权限id的字符串
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolemiaoshu() {
        return rolemiaoshu;
    }

    public void setRolemiaoshu(String rolemiaoshu) {
        this.rolemiaoshu = rolemiaoshu == null ? null : rolemiaoshu.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }
    
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<Functions> getListfunction() {
		return listfunction;
	}

	public void setListfunction(List<Functions> listfunction) {
		this.listfunction = listfunction;
	}

	public List<String> getListfunctionId() {
		return listfunctionId;
	}

	public void setListfunctionId(List<String> listfunctionId) {
		this.listfunctionId = listfunctionId;
	}

	public String getListfunctionIdString() {
		return listfunctionIdString;
	}

	public void setListfunctionIdString(String listfunctionIdString) {
		this.listfunctionIdString = listfunctionIdString;
	}

    
}