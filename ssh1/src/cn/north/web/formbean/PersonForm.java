package cn.north.web.formbean;

import org.apache.struts.action.ActionForm;

/**
 * 带有请求参数 method=add name 和 id
 * @author young
 *
 */
public class PersonForm extends ActionForm{
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
