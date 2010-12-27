// license-header java merge-point
package cn.edu.uestc.appstore.web;

public class UserControllerFactory
{
    private final static UserController INSTANCE = new UserControllerImpl();

    public final static UserController getUserControllerInstance()
    {
        return INSTANCE;
    }
}