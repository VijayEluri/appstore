// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package cn.edu.uestc.appstore.service;

import cn.edu.uestc.appstore.domain.ResourceDao;
import cn.edu.uestc.appstore.vo.ResourceVO;

/**
 * @see cn.edu.uestc.appstore.service.ResourceService
 */
public class ResourceServiceImpl
    extends cn.edu.uestc.appstore.service.ResourceServiceBase
{

    /**
     * @see cn.edu.uestc.appstore.service.ResourceService#getResources()
     */
    protected  cn.edu.uestc.appstore.vo.ResourceVO[] handleGetResources()
        throws java.lang.Exception
    {
    	return (ResourceVO[]) this.getResourceDao().loadAll(ResourceDao.TRANSFORM_RESOURCEVO).toArray(new ResourceVO[0]);
    }

    /**
     * @see cn.edu.uestc.appstore.service.ResourceService#getResourceById(long)
     */
    protected  cn.edu.uestc.appstore.vo.ResourceVO handleGetResourceById(long resourceId)
        throws java.lang.Exception
    {
    	return (ResourceVO) this.getResourceDao().load(ResourceDao.TRANSFORM_RESOURCEVO, resourceId);
    }

}