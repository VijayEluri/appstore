// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package cn.edu.uestc.appstore.service;

import java.util.Collection;

import cn.edu.uestc.appstore.domain.UserDao;
import cn.edu.uestc.appstore.vo.UserVO;

/**
 * @see cn.edu.uestc.appstore.service.UserService
 */
public class UserServiceImpl
    extends cn.edu.uestc.appstore.service.UserServiceBase
{

    /**
     * @see cn.edu.uestc.appstore.service.UserService#getAllUsers()
     */
    protected  cn.edu.uestc.appstore.vo.UserVO[] handleGetAllUsers()
        throws java.lang.Exception
    {
    	Collection userVOs = this.getUserDao().loadAll(UserDao.TRANSFORM_USERVO);
    	return (UserVO[]) userVOs.toArray(new UserVO[0]);
    }

    /**
     * @see cn.edu.uestc.appstore.service.UserService#getUser(java.lang.String)
     */
    protected  cn.edu.uestc.appstore.vo.UserVO handleGetUser(java.lang.String username)
        throws java.lang.Exception
    {
        // @todo implement protected  cn.edu.uestc.appstore.vo.UserVO handleGetUser(java.lang.String username)
        throw new java.lang.UnsupportedOperationException("cn.edu.uestc.appstore.service.UserService.handleGetUser(java.lang.String username) Not implemented!");
    }

    /**
     * @see cn.edu.uestc.appstore.service.UserService#regUser(java.lang.String, java.lang.String)
     */
    protected  void handleRegUser(java.lang.String username, java.lang.String password)
        throws java.lang.Exception
    {
        // @todo implement protected  void handleRegUser(java.lang.String username, java.lang.String password)
        throw new java.lang.UnsupportedOperationException("cn.edu.uestc.appstore.service.UserService.handleRegUser(java.lang.String username, java.lang.String password) Not implemented!");
    }

    /**
     * @see cn.edu.uestc.appstore.service.UserService#deleteUser(java.lang.Long)
     */
    protected  void handleDeleteUser(java.lang.Long userId)
        throws java.lang.Exception
    {
        // @todo implement protected  void handleDeleteUser(java.lang.Long userId)
        throw new java.lang.UnsupportedOperationException("cn.edu.uestc.appstore.service.UserService.handleDeleteUser(java.lang.Long userId) Not implemented!");
    }

    /**
     * @see cn.edu.uestc.appstore.service.UserService#updateUser(cn.edu.uestc.appstore.vo.UserVO)
     */
    protected  void handleUpdateUser(cn.edu.uestc.appstore.vo.UserVO userVO)
        throws java.lang.Exception
    {
        // @todo implement protected  void handleUpdateUser(cn.edu.uestc.appstore.vo.UserVO userVO)
        throw new java.lang.UnsupportedOperationException("cn.edu.uestc.appstore.service.UserService.handleUpdateUser(cn.edu.uestc.appstore.vo.UserVO userVO) Not implemented!");
    }

    /**
     * @see cn.edu.uestc.appstore.service.UserService#activeUser(java.lang.String, java.lang.Boolean)
     */
    protected  void handleActiveUser(java.lang.String username, java.lang.Boolean isActive)
        throws java.lang.Exception
    {
        // @todo implement protected  void handleActiveUser(java.lang.String username, java.lang.Boolean isActive)
        throw new java.lang.UnsupportedOperationException("cn.edu.uestc.appstore.service.UserService.handleActiveUser(java.lang.String username, java.lang.Boolean isActive) Not implemented!");
    }

}