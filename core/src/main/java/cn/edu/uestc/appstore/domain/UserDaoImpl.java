// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package cn.edu.uestc.appstore.domain;
/**
 * @see cn.edu.uestc.appstore.domain.User
 */
public class UserDaoImpl
    extends cn.edu.uestc.appstore.domain.UserDaoBase
{
    /**
     * @see cn.edu.uestc.appstore.domain.UserDao#toUserVO(cn.edu.uestc.appstore.domain.User, cn.edu.uestc.appstore.vo.UserVO)
     */
    public void toUserVO(
        cn.edu.uestc.appstore.domain.User source,
        cn.edu.uestc.appstore.vo.UserVO target)
    {
    	target.setUserId(source.getId());
        super.toUserVO(source, target);
    }


    /**
     * @see cn.edu.uestc.appstore.domain.UserDao#toUserVO(cn.edu.uestc.appstore.domain.User)
     */
    public cn.edu.uestc.appstore.vo.UserVO toUserVO(final cn.edu.uestc.appstore.domain.User entity)
    {
        // @todo verify behavior of toUserVO
        return super.toUserVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private cn.edu.uestc.appstore.domain.User loadUserFromUserVO(cn.edu.uestc.appstore.vo.UserVO userVO)
    {
        // @todo implement loadUserFromUserVO
        throw new java.lang.UnsupportedOperationException("cn.edu.uestc.appstore.domain.loadUserFromUserVO(cn.edu.uestc.appstore.vo.UserVO) not yet implemented.");

        /* A typical implementation looks like this:
        cn.edu.uestc.appstore.domain.User user = this.load(userVO.getId());
        if (user == null)
        {
            user = cn.edu.uestc.appstore.domain.User.Factory.newInstance();
        }
        return user;
        */
    }

    
    /**
     * @see cn.edu.uestc.appstore.domain.UserDao#userVOToEntity(cn.edu.uestc.appstore.vo.UserVO)
     */
    public cn.edu.uestc.appstore.domain.User userVOToEntity(cn.edu.uestc.appstore.vo.UserVO userVO)
    {
        // @todo verify behavior of userVOToEntity
        cn.edu.uestc.appstore.domain.User entity = this.loadUserFromUserVO(userVO);
        this.userVOToEntity(userVO, entity, true);
        return entity;
    }


    /**
     * @see cn.edu.uestc.appstore.domain.UserDao#userVOToEntity(cn.edu.uestc.appstore.vo.UserVO, cn.edu.uestc.appstore.domain.User)
     */
    public void userVOToEntity(
        cn.edu.uestc.appstore.vo.UserVO source,
        cn.edu.uestc.appstore.domain.User target,
        boolean copyIfNull)
    {
        // @todo verify behavior of userVOToEntity
        super.userVOToEntity(source, target, copyIfNull);
    }

}