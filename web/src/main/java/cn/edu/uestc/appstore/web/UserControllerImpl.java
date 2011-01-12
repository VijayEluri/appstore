// license-header java merge-point
package cn.edu.uestc.appstore.web;

import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @see cn.edu.uestc.appstore.web.UserController
 */
public class UserControllerImpl extends UserController
{
    /**
     * @see cn.edu.uestc.appstore.web.UserController#populateUserScreen(org.apache.struts.action.ActionMapping, cn.edu.uestc.appstore.web.PopulateUserScreenForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public final void populateUserScreen(ActionMapping mapping, cn.edu.uestc.appstore.web.PopulateUserScreenForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
    	((UserManagerFormImpl) form).setUserVOs(this.getUserService().getAllUsers());
    }

    /**
     * @see cn.edu.uestc.appstore.web.UserController#deleteUser(org.apache.struts.action.ActionMapping, cn.edu.uestc.appstore.web.DeleteUserForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public final void deleteUser(ActionMapping mapping, cn.edu.uestc.appstore.web.DeleteUserForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
    	System.out.println(form.getId());
        this.getUserService().deleteUser(form.getId());
    }

    /**
     * @see cn.edu.uestc.appstore.web.UserController#initializeUserId(org.apache.struts.action.ActionMapping, cn.edu.uestc.appstore.web.InitializeUserIdForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public final void initializeUserId(ActionMapping mapping, cn.edu.uestc.appstore.web.InitializeUserIdForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        // this property receives a default value, just to have the application running on dummy data
        form.setId(new Long((long)3355));
        
    }

    /**
     * This dummy variable is used to populate the "userVOs" table.
     * You may delete it when you add you own code in this controller.
     */
    private static final cn.edu.uestc.appstore.vo.UserVO[] userVOsDummyList =
        new cn.edu.uestc.appstore.vo.UserVO[]
        {
            new cn.edu.uestc.appstore.vo.UserVO(null, "username-1", "password-1", "realName-1", "email-1", "phone-1", "address-1", null, "picture-1", "question-1", "answer-1", null, false, new java.util.Date(), "memo-1"),
            new cn.edu.uestc.appstore.vo.UserVO(null, "username-2", "password-2", "realName-2", "email-2", "phone-2", "address-2", null, "picture-2", "question-2", "answer-2", null, false, new java.util.Date(), "memo-2"),
            new cn.edu.uestc.appstore.vo.UserVO(null, "username-3", "password-3", "realName-3", "email-3", "phone-3", "address-3", null, "picture-3", "question-3", "answer-3", null, false, new java.util.Date(), "memo-3"),
            new cn.edu.uestc.appstore.vo.UserVO(null, "username-4", "password-4", "realName-4", "email-4", "phone-4", "address-4", null, "picture-4", "question-4", "answer-4", null, false, new java.util.Date(), "memo-4"),
            new cn.edu.uestc.appstore.vo.UserVO(null, "username-5", "password-5", "realName-5", "email-5", "phone-5", "address-5", null, "picture-5", "question-5", "answer-5", null, false, new java.util.Date(), "memo-5")
        };
}