// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package cn.edu.uestc.appstore.domain;
/**
 * @see cn.edu.uestc.appstore.domain.Resource
 */
public class ResourceDaoImpl
    extends cn.edu.uestc.appstore.domain.ResourceDaoBase
{
    /**
     * @see cn.edu.uestc.appstore.domain.ResourceDao#toResourceVO(cn.edu.uestc.appstore.domain.Resource, cn.edu.uestc.appstore.vo.ResourceVO)
     */
    public void toResourceVO(
        cn.edu.uestc.appstore.domain.Resource source,
        cn.edu.uestc.appstore.vo.ResourceVO target)
    {
    	target.setFirstCategoryName(source.getComFirstCategory().getName());
    	target.setSecondCategoryName(source.getComSecondCategory().getName());
    	target.setResourceStateName(source.getResourceState().getName());

    	target.setResourceTest(java.util.Arrays.asList(source.getResourceTests().toArray()));
        super.toResourceVO(source, target);
    }


    /**
     * @see cn.edu.uestc.appstore.domain.ResourceDao#toResourceVO(cn.edu.uestc.appstore.domain.Resource)
     */
    public cn.edu.uestc.appstore.vo.ResourceVO toResourceVO(final cn.edu.uestc.appstore.domain.Resource entity)
    {
        // @todo verify behavior of toResourceVO
        return super.toResourceVO(entity);
    }


    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private cn.edu.uestc.appstore.domain.Resource loadResourceFromResourceVO(cn.edu.uestc.appstore.vo.ResourceVO resourceVO)
    {
        // @todo implement loadResourceFromResourceVO
        throw new java.lang.UnsupportedOperationException("cn.edu.uestc.appstore.domain.loadResourceFromResourceVO(cn.edu.uestc.appstore.vo.ResourceVO) not yet implemented.");

        /* A typical implementation looks like this:
        cn.edu.uestc.appstore.domain.Resource resource = this.load(resourceVO.getId());
        if (resource == null)
        {
            resource = cn.edu.uestc.appstore.domain.Resource.Factory.newInstance();
        }
        return resource;
        */
    }

    
    /**
     * @see cn.edu.uestc.appstore.domain.ResourceDao#resourceVOToEntity(cn.edu.uestc.appstore.vo.ResourceVO)
     */
    public cn.edu.uestc.appstore.domain.Resource resourceVOToEntity(cn.edu.uestc.appstore.vo.ResourceVO resourceVO)
    {
        // @todo verify behavior of resourceVOToEntity
        cn.edu.uestc.appstore.domain.Resource entity = this.loadResourceFromResourceVO(resourceVO);
        this.resourceVOToEntity(resourceVO, entity, true);
        return entity;
    }


    /**
     * @see cn.edu.uestc.appstore.domain.ResourceDao#resourceVOToEntity(cn.edu.uestc.appstore.vo.ResourceVO, cn.edu.uestc.appstore.domain.Resource)
     */
    public void resourceVOToEntity(
        cn.edu.uestc.appstore.vo.ResourceVO source,
        cn.edu.uestc.appstore.domain.Resource target,
        boolean copyIfNull)
    {
        // @todo verify behavior of resourceVOToEntity
        super.resourceVOToEntity(source, target, copyIfNull);
    }

}