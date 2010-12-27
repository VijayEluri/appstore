// license-header java merge-point
package cn.edu.uestc.appstore.web;

/**
 * This form encapsulates the fields that are used in the execution of the
 * <code>deleteUser</code> method, which is located on the
 * <code>cn.edu.uestc.appstore.web.UserController</code> controller.
 *
 * 
 *
 * @see cn.edu.uestc.appstore.web.UserController#deleteUser
 */
public interface DeleteUserForm
{
    /**
     * Sets the <code>userId</code> field.
     *
     * 
     */
    public void setUserId(java.lang.Long userId);

    /**
     * Gets the <code>userId</code> field.
     *
     * 
     */
    public java.lang.Long getUserId();
    
    /**
     * Resets the <code>userId</code> field.
     */
    public void resetUserId();

}
