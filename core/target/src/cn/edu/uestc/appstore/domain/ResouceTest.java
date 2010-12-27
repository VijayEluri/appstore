// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package cn.edu.uestc.appstore.domain;

/**
 * 
 */
public abstract class ResouceTest
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 2160170596318372548L;

    private java.lang.String description;

    /**
     * 
     */
    public java.lang.String getDescription()
    {
        return this.description;
    }

    public void setDescription(java.lang.String description)
    {
        this.description = description;
    }

    private java.util.Date beginTime;

    /**
     * 
     */
    public java.util.Date getBeginTime()
    {
        return this.beginTime;
    }

    public void setBeginTime(java.util.Date beginTime)
    {
        this.beginTime = beginTime;
    }

    private java.util.Date endTime;

    /**
     * 
     */
    public java.util.Date getEndTime()
    {
        return this.endTime;
    }

    public void setEndTime(java.util.Date endTime)
    {
        this.endTime = endTime;
    }

    private java.lang.String reportURL;

    /**
     * 
     */
    public java.lang.String getReportURL()
    {
        return this.reportURL;
    }

    public void setReportURL(java.lang.String reportURL)
    {
        this.reportURL = reportURL;
    }

    private java.lang.String review;

    /**
     * 
     */
    public java.lang.String getReview()
    {
        return this.review;
    }

    public void setReview(java.lang.String review)
    {
        this.review = review;
    }

    private java.lang.Integer mark;

    /**
     * 
     */
    public java.lang.Integer getMark()
    {
        return this.mark;
    }

    public void setMark(java.lang.Integer mark)
    {
        this.mark = mark;
    }

    private java.lang.String result;

    /**
     * 
     */
    public java.lang.String getResult()
    {
        return this.result;
    }

    public void setResult(java.lang.String result)
    {
        this.result = result;
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

    private cn.edu.uestc.appstore.domain.Resouce resouce;

    /**
     * 
     */
    public cn.edu.uestc.appstore.domain.Resouce getResouce()
    {
        return this.resouce;
    }

    public void setResouce(cn.edu.uestc.appstore.domain.Resouce resouce)
    {
        this.resouce = resouce;
    }

    /**
     * Returns <code>true</code> if the argument is an ResouceTest instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof ResouceTest))
        {
            return false;
        }
        final ResouceTest that = (ResouceTest)object;
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
     * Constructs new instances of {@link cn.edu.uestc.appstore.domain.ResouceTest}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.ResouceTest}.
         */
        public static cn.edu.uestc.appstore.domain.ResouceTest newInstance()
        {
            return new cn.edu.uestc.appstore.domain.ResouceTestImpl();
        }

        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.ResouceTest}, taking all required and/or
         * read-only properties as arguments.
         */
        public static cn.edu.uestc.appstore.domain.ResouceTest newInstance(java.lang.Integer mark, java.lang.String result, cn.edu.uestc.appstore.domain.Resouce resouce)
        {
            final cn.edu.uestc.appstore.domain.ResouceTest entity = new cn.edu.uestc.appstore.domain.ResouceTestImpl();
            entity.setMark(mark);
            entity.setResult(result);
            entity.setResouce(resouce);
            return entity;
        }

        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.ResouceTest}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static cn.edu.uestc.appstore.domain.ResouceTest newInstance(java.lang.String description, java.util.Date beginTime, java.util.Date endTime, java.lang.String reportURL, java.lang.String review, java.lang.Integer mark, java.lang.String result, cn.edu.uestc.appstore.domain.Resouce resouce)
        {
            final cn.edu.uestc.appstore.domain.ResouceTest entity = new cn.edu.uestc.appstore.domain.ResouceTestImpl();
            entity.setDescription(description);
            entity.setBeginTime(beginTime);
            entity.setEndTime(endTime);
            entity.setReportURL(reportURL);
            entity.setReview(review);
            entity.setMark(mark);
            entity.setResult(result);
            entity.setResouce(resouce);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}