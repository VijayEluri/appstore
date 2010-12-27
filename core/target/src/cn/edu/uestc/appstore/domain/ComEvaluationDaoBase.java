// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringHibernateDaoBase.vsl in andromda-spring-cartridge.
//
package cn.edu.uestc.appstore.domain;

/**
 * <p>
 * Base Spring DAO Class: is able to create, update, remove, load, and find
 * objects of type <code>cn.edu.uestc.appstore.domain.ComEvaluation</code>.
 * </p>
 *
 * @see cn.edu.uestc.appstore.domain.ComEvaluation
 */
public abstract class ComEvaluationDaoBase
    extends org.springframework.orm.hibernate3.support.HibernateDaoSupport
    implements cn.edu.uestc.appstore.domain.ComEvaluationDao
{

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#load(int, java.lang.Long)
     */
    public java.lang.Object load(final int transform, final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "ComEvaluation.load - 'id' can not be null");
        }
        final java.lang.Object entity = this.getHibernateTemplate().get(cn.edu.uestc.appstore.domain.ComEvaluationImpl.class, id);
        return transformEntity(transform, (cn.edu.uestc.appstore.domain.ComEvaluation)entity);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#load(java.lang.Long)
     */
    public cn.edu.uestc.appstore.domain.ComEvaluation load(java.lang.Long id)
    {
        return (cn.edu.uestc.appstore.domain.ComEvaluation)this.load(TRANSFORM_NONE, id);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#loadAll()
     */
    public java.util.Collection loadAll()
    {
        return this.loadAll(TRANSFORM_NONE);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#loadAll(int)
     */
    public java.util.Collection loadAll(final int transform)
    {
        return this.loadAll(transform, -1, -1);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#loadAll(int, int)
     */
    public java.util.Collection loadAll(final int pageNumber, final int pageSize)
    {
        return this.loadAll(TRANSFORM_NONE, pageNumber, pageSize);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#loadAll(int, int, int)
     */
    public java.util.Collection loadAll(final int transform, final int pageNumber, final int pageSize)
    {
        try
        {
            final org.hibernate.Criteria criteria = this.getSession(false).createCriteria(cn.edu.uestc.appstore.domain.ComEvaluationImpl.class);
            if (pageNumber > 0 && pageSize > 0)
            {
                criteria.setFirstResult(this.calculateFirstResult(pageNumber, pageSize));
                criteria.setMaxResults(pageSize);
            }
            final java.util.Collection results = criteria.list();
            this.transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    protected int calculateFirstResult(int pageNumber, int pageSize)
    {
        int firstResult = 0;
        if (pageNumber > 0)
        {
            firstResult = (pageNumber - 1) * pageSize;
        }
        return firstResult;
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#create(cn.edu.uestc.appstore.domain.ComEvaluation)
     */
    public cn.edu.uestc.appstore.domain.ComEvaluation create(cn.edu.uestc.appstore.domain.ComEvaluation comEvaluation)
    {
        return (cn.edu.uestc.appstore.domain.ComEvaluation)this.create(TRANSFORM_NONE, comEvaluation);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#create(int transform, cn.edu.uestc.appstore.domain.ComEvaluation)
     */
    public java.lang.Object create(final int transform, final cn.edu.uestc.appstore.domain.ComEvaluation comEvaluation)
    {
        if (comEvaluation == null)
        {
            throw new IllegalArgumentException(
                "ComEvaluation.create - 'comEvaluation' can not be null");
        }
        this.getHibernateTemplate().save(comEvaluation);
        return this.transformEntity(transform, comEvaluation);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#create(java.util.Collection)
     */
    public java.util.Collection create(final java.util.Collection entities)
    {
        return create(TRANSFORM_NONE, entities);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#create(int, java.util.Collection)
     */
    public java.util.Collection create(final int transform, final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "ComEvaluation.create - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        create(transform, (cn.edu.uestc.appstore.domain.ComEvaluation)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
        return entities;
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#create(java.lang.String, java.util.Date)
     */
    public cn.edu.uestc.appstore.domain.ComEvaluation create(
        java.lang.String content,
        java.util.Date pubTime)
    {
        return (cn.edu.uestc.appstore.domain.ComEvaluation)this.create(TRANSFORM_NONE, content, pubTime);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#create(int, java.lang.String, java.util.Date)
     */
    public java.lang.Object create(
        final int transform,
        java.lang.String content,
        java.util.Date pubTime)
    {
        cn.edu.uestc.appstore.domain.ComEvaluation entity = new cn.edu.uestc.appstore.domain.ComEvaluationImpl();
        entity.setContent(content);
        entity.setPubTime(pubTime);
        return this.create(transform, entity);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#create(cn.edu.uestc.appstore.domain.ComDegree, cn.edu.uestc.appstore.domain.Commodity, cn.edu.uestc.appstore.domain.Consumer, java.lang.String, java.util.Date)
     */
    public cn.edu.uestc.appstore.domain.ComEvaluation create(
        cn.edu.uestc.appstore.domain.ComDegree comDegree,
        cn.edu.uestc.appstore.domain.Commodity commodity,
        cn.edu.uestc.appstore.domain.Consumer consumer,
        java.lang.String content,
        java.util.Date pubTime)
    {
        return (cn.edu.uestc.appstore.domain.ComEvaluation)this.create(TRANSFORM_NONE, comDegree, commodity, consumer, content, pubTime);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#create(int, cn.edu.uestc.appstore.domain.ComDegree, cn.edu.uestc.appstore.domain.Commodity, cn.edu.uestc.appstore.domain.Consumer, java.lang.String, java.util.Date)
     */
    public java.lang.Object create(
        final int transform,
        cn.edu.uestc.appstore.domain.ComDegree comDegree,
        cn.edu.uestc.appstore.domain.Commodity commodity,
        cn.edu.uestc.appstore.domain.Consumer consumer,
        java.lang.String content,
        java.util.Date pubTime)
    {
        cn.edu.uestc.appstore.domain.ComEvaluation entity = new cn.edu.uestc.appstore.domain.ComEvaluationImpl();
        entity.setComDegree(comDegree);
        entity.setCommodity(commodity);
        entity.setConsumer(consumer);
        entity.setContent(content);
        entity.setPubTime(pubTime);
        return this.create(transform, entity);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#update(cn.edu.uestc.appstore.domain.ComEvaluation)
     */
    public void update(cn.edu.uestc.appstore.domain.ComEvaluation comEvaluation)
    {
        if (comEvaluation == null)
        {
            throw new IllegalArgumentException(
                "ComEvaluation.update - 'comEvaluation' can not be null");
        }
        this.getHibernateTemplate().update(comEvaluation);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#update(java.util.Collection)
     */
    public void update(final java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "ComEvaluation.update - 'entities' can not be null");
        }
        this.getHibernateTemplate().execute(
            new org.springframework.orm.hibernate3.HibernateCallback()
            {
                public java.lang.Object doInHibernate(org.hibernate.Session session)
                    throws org.hibernate.HibernateException
                {
                    for (java.util.Iterator entityIterator = entities.iterator(); entityIterator.hasNext();)
                    {
                        update((cn.edu.uestc.appstore.domain.ComEvaluation)entityIterator.next());
                    }
                    return null;
                }
            },
            true);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#remove(cn.edu.uestc.appstore.domain.ComEvaluation)
     */
    public void remove(cn.edu.uestc.appstore.domain.ComEvaluation comEvaluation)
    {
        if (comEvaluation == null)
        {
            throw new IllegalArgumentException(
                "ComEvaluation.remove - 'comEvaluation' can not be null");
        }
        this.getHibernateTemplate().delete(comEvaluation);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#remove(java.lang.Long)
     */
    public void remove(java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "ComEvaluation.remove - 'id' can not be null");
        }
        cn.edu.uestc.appstore.domain.ComEvaluation entity = this.load(id);
        if (entity != null)
        {
            this.remove(entity);
        }
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#remove(java.util.Collection)
     */
    public void remove(java.util.Collection entities)
    {
        if (entities == null)
        {
            throw new IllegalArgumentException(
                "ComEvaluation.remove - 'entities' can not be null");
        }
        this.getHibernateTemplate().deleteAll(entities);
    }
    /**
     * Allows transformation of entities into value objects
     * (or something else for that matter), when the <code>transform</code>
     * flag is set to one of the constants defined in <code>cn.edu.uestc.appstore.domain.ComEvaluationDao</code>, please note
     * that the {@link #TRANSFORM_NONE} constant denotes no transformation, so the entity itself
     * will be returned.
     *
     * If the integer argument value is unknown {@link #TRANSFORM_NONE} is assumed.
     *
     * @param transform one of the constants declared in {@link cn.edu.uestc.appstore.domain.ComEvaluationDao}
     * @param entity an entity that was found
     * @return the transformed entity (i.e. new value object, etc)
     * @see #transformEntities(int,java.util.Collection)
     */
    protected java.lang.Object transformEntity(final int transform, final cn.edu.uestc.appstore.domain.ComEvaluation entity)
    {
        java.lang.Object target = null;
        if (entity != null)
        {
            switch (transform)
            {
                case TRANSFORM_NONE : // fall-through
                default:
                    target = entity;
            }
        }
        return target;
    }

    /**
     * Transforms a collection of entities using the
     * {@link #transformEntity(int,cn.edu.uestc.appstore.domain.ComEvaluation)}
     * method. This method does not instantiate a new collection.
     * <p>
     * This method is to be used internally only.
     *
     * @param transform one of the constants declared in <code>cn.edu.uestc.appstore.domain.ComEvaluationDao</code>
     * @param entities the collection of entities to transform
     * @see #transformEntity(int,cn.edu.uestc.appstore.domain.ComEvaluation)
     */
    protected void transformEntities(final int transform, final java.util.Collection entities)
    {
        switch (transform)
        {
            case TRANSFORM_NONE : // fall-through
                default:
                // do nothing;
        }
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#toEntities(java.util.Collection)
     */
    public void toEntities(final java.util.Collection results)
    {
        if (results != null)
        {
            org.apache.commons.collections.CollectionUtils.transform(results, ENTITYTRANSFORMER);
        }
    }

    /**
     * This anonymous transformer is designed to transform report query results
     * (which result in an array of entities) to {@link cn.edu.uestc.appstore.domain.ComEvaluation}
     * using the Jakarta Commons-Collections Transformation API.
     */
    private org.apache.commons.collections.Transformer ENTITYTRANSFORMER =
        new org.apache.commons.collections.Transformer()
        {
            public java.lang.Object transform(java.lang.Object input)
            {
                java.lang.Object result = null;
                if (input instanceof java.lang.Object[])
                {
                    result = toEntity((java.lang.Object[])input);
                }
                else if (input instanceof cn.edu.uestc.appstore.domain.ComEvaluation)
                {
                    result = input;
                }
                return result;
            }
        };

    protected cn.edu.uestc.appstore.domain.ComEvaluation toEntity(java.lang.Object[] row)
    {
        cn.edu.uestc.appstore.domain.ComEvaluation target = null;
        if (row != null)
        {
            final int numberOfObjects = row.length;
            for (int ctr = 0; ctr < numberOfObjects; ctr++)
            {
                final java.lang.Object object = row[ctr];
                if (object instanceof cn.edu.uestc.appstore.domain.ComEvaluation)
                {
                    target = (cn.edu.uestc.appstore.domain.ComEvaluation)object;
                    break;
                }
            }
        }
        return target;
    }

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return cn.edu.uestc.appstore.PrincipalStore.get();
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#search(int, int, int, cn.edu.uestc.appstore.Search)
     */
    public cn.edu.uestc.appstore.PaginationResult search(final int transform, final int pageNumber, final int pageSize, final cn.edu.uestc.appstore.Search search)
    {
        try
        {
            search.setPageNumber(pageNumber);
            search.setPageSize(pageSize);
            final cn.edu.uestc.appstore.PropertySearch propertySearch = new cn.edu.uestc.appstore.PropertySearch(
                this.getSession(false), cn.edu.uestc.appstore.domain.ComEvaluationImpl.class, search);
            final java.util.List results = propertySearch.executeAsList();
            this.transformEntities(transform, results);
            return new cn.edu.uestc.appstore.PaginationResult(results.toArray(new java.lang.Object[0]), propertySearch.getTotalCount());
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#search(int, int, cn.edu.uestc.appstore.Search)
     */
    public cn.edu.uestc.appstore.PaginationResult search(final int pageNumber, final int pageSize, final cn.edu.uestc.appstore.Search search)
    {
        return this.search(TRANSFORM_NONE, pageNumber, pageSize, search);
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#search(int, cn.edu.uestc.appstore.Search)
     */
    public java.util.Set search(final int transform, final cn.edu.uestc.appstore.Search search)
    {
        try
        {
            final cn.edu.uestc.appstore.PropertySearch propertySearch = new cn.edu.uestc.appstore.PropertySearch(
                this.getSession(false), cn.edu.uestc.appstore.domain.ComEvaluationImpl.class, search);
            final java.util.Set results = propertySearch.executeAsSet();
            this.transformEntities(transform, results);
            return results;
        }
        catch (org.hibernate.HibernateException ex)
        {
            throw super.convertHibernateAccessException(ex);
        }
    }

    /**
     * @see cn.edu.uestc.appstore.domain.ComEvaluationDao#search(cn.edu.uestc.appstore.Search)
     */
    public java.util.Set search(final cn.edu.uestc.appstore.Search search)
    {
        return this.search(TRANSFORM_NONE, search);
    }

    // spring-hibernate-dao-base merge-point
}