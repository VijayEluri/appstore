// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package cn.edu.uestc.appstore.service;

import java.util.Collection;
import java.util.Date;

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
    	return (UserVO) this.getUserDao().findByUsername(UserDao.TRANSFORM_USERVO, username);
    }

    /**
     * @see cn.edu.uestc.appstore.service.UserService#regUser(java.lang.String, java.lang.String)
     */
    protected  void handleRegUser(java.lang.String username, java.lang.String password)
        throws java.lang.Exception
    {
    	UserVO userVO = new UserVO();
    	userVO.setUsername(username);
    	userVO.setPassword(password);
    	userVO.setCreateTime(new Date());
    	userVO.setPoint(0.0);
    	//userVO.setRole();
    	this.getUserDao().create(this.getUserDao().userVOToEntity(userVO));
    }

    /**
     * @see cn.edu.uestc.appstore.service.UserService#deleteUser(java.lang.Long)
     */
    protected  void handleDeleteUser(java.lang.Long userId)
        throws java.lang.Exception
    {    	
    	this.getUserDao().remove(userId);
    }

    /**
     * @see cn.edu.uestc.appstore.service.UserService#updateUser(cn.edu.uestc.appstore.vo.UserVO)
     */
    protected  void handleUpdateUser(cn.edu.uestc.appstore.vo.UserVO userVO)
        throws java.lang.Exception
    {
    	this.getUserDao().update(this.getUserDao().userVOToEntity(userVO));
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