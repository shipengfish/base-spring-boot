package com.springboot.boot.web;

import com.springboot.common.web.WebParamUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * to find userId in the spring web environment
 *
 * @author liubo
 * @see WebParamUtil
 */
public final class UserParamUtil {
    //use a
    public static final String UID = "uid";
    public static final String PARAM_USER_ID = WebParamUtil.PARAM_PREFIX + UID;
    public static final String HEADER_COOKIE_USER_ID = WebParamUtil.HEADER_COOKIE_PREFIX + UID;

    public static Long currentUserId() {
        return currentUserId(WebParamUtil.currentRequest());
    }

    public static Long currentUserId(HttpServletRequest request) {
        String strUserId = WebParamUtil.findWebParam(request, new WebParamUtil.WebParamObject(HEADER_COOKIE_USER_ID, PARAM_USER_ID));
        return Long.valueOf(strUserId);
    }
}
