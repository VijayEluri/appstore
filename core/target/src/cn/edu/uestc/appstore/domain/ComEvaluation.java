// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package cn.edu.uestc.appstore.domain;

/**
 * 
 */
public abstract class ComEvaluation
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -1196786632335260818L;

    private java.lang.String content;

    /**
     * 
     */
    public java.lang.String getContent()
    {
        return this.content;
    }

    public void setContent(java.lang.String content)
    {
        this.content = content;
    }

    private java.util.Date pubTime;

    /**
     * 
     */
    public java.util.Date getPubTime()
    {
        return this.pubTime;
    }

    public void setPubTime(java.util.Date pubTime)
    {
        this.pubTime = pubTime;
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private cn.edu.uestc.appstore.domain.Consumer consumer;

    /**
     * 
     */
    public cn.edu.uestc.appstore.domain.Consumer getConsumer()
    {
        return this.consumer;
    }

    public void setConsumer(cn.edu.uestc.appstore.domain.Consumer consumer)
    {
        this.consumer = consumer;
    }

    private cn.edu.uestc.appstore.domain.Commodity commodity;

    /**
     * 
     */
    public cn.edu.uestc.appstore.domain.Commodity getCommodity()
    {
        return this.commodity;
    }

    public void setCommodity(cn.edu.uestc.appstore.domain.Commodity commodity)
    {
        this.commodity = commodity;
    }

    private cn.edu.uestc.appstore.domain.ComDegree comDegree;

    /**
     * 
     */
    public cn.edu.uestc.appstore.domain.ComDegree getComDegree()
    {
        return this.comDegree;
    }

    public void setComDegree(cn.edu.uestc.appstore.domain.ComDegree comDegree)
    {
        this.comDegree = comDegree;
    }

    /**
     * Returns <code>true</code> if the argument is an ComEvaluation instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof ComEvaluation))
        {
            return false;
        }
        final ComEvaluation that = (ComEvaluation)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link cn.edu.uestc.appstore.domain.ComEvaluation}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.ComEvaluation}.
         */
        public static cn.edu.uestc.appstore.domain.ComEvaluation newInstance()
        {
            return new cn.edu.uestc.appstore.domain.ComEvaluationImpl();
        }


        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.ComEvaluation}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static cn.edu.uestc.appstore.domain.ComEvaluation newInstance(java.lang.String content, java.util.Date pubTime, cn.edu.uestc.appstore.domain.Consumer consumer, cn.edu.uestc.appstore.domain.Commodity commodity, cn.edu.uestc.appstore.domain.ComDegree comDegree)
        {
            final cn.edu.uestc.appstore.domain.ComEvaluation entity = new cn.edu.uestc.appstore.domain.ComEvaluationImpl();
            entity.setContent(content);
            entity.setPubTime(pubTime);
            entity.setConsumer(consumer);
            entity.setCommodity(commodity);
            entity.setComDegree(comDegree);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}