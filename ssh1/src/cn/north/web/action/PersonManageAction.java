package cn.north.web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import cn.north.bean.Person;
import cn.north.service.PersonService;
import cn.north.web.formbean.PersonForm;

public class PersonManageAction extends DispatchAction {
	@Resource PersonService personService;
	
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		PersonForm formbean = (PersonForm)form;
		personService.save(new Person(formbean.getName()));
		request.setAttribute("message", "添加成功");
		return mapping.findForward("message");
	}
}
