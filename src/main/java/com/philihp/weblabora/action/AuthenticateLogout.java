package com.philihp.weblabora.action;

import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import antlr.StringUtils;

import com.philihp.weblabora.jpa.User;
import com.philihp.weblabora.util.Facebook;
import com.philihp.weblabora.util.FacebookCredentials;

public class AuthenticateLogout extends BaseAction {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response, User user) throws Exception {
		
		request.getSession().setAttribute("user", null);

		return mapping.findForward("root");
	}

}
