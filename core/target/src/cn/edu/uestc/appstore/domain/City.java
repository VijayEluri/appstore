// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package cn.edu.uestc.appstore.domain;

/**
 * 
 */
public abstract class City
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 6013516899668408085L;

    private java.lang.String name;

    /**
     * 
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.String code;

    /**
     * 
     */
    public java.lang.String getCode()
    {
        return this.code;
    }

    public void setCode(java.lang.String code)
    {
        this.code = code;
    }

    private java.lang.String provinceCode;

    /**
     * 
     */
    public java.lang.String getProvinceCode()
    {
        return this.provinceCode;
    }

    public void setProvinceCode(java.lang.String provinceCode)
    {
        this.provinceCode = provinceCode;
    }

    private java.lang.String provinceName;

    /**
     * 
     */
    public java.lang.String getProvinceName()
    {
        return this.provinceName;
    }

    public void setProvinceName(java.lang.String provinceName)
    {
        this.provinceName = provinceName;
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

    private java.util.Collection consumers = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getConsumers()
    {
        return this.consumers;
    }

    public void setConsumers(java.util.Collection consumers)
    {
        this.consumers = consumers;
    }

    private java.util.Collection personServProvs = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getPersonServProvs()
    {
        return this.personServProvs;
    }

    public void setPersonServProvs(java.util.Collection personServProvs)
    {
        this.personServProvs = personServProvs;
    }

    private java.util.Collection entServProvs = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getEntServProvs()
    {
        return this.entServProvs;
    }

    public void setEntServProvs(java.util.Collection entServProvs)
    {
        this.entServProvs = entServProvs;
    }

    /**
     * Returns <code>true</code> if the argument is an City instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof City))
        {
            return false;
        }
        final City that = (City)object;
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
     * Constructs new instances of {@link cn.edu.uestc.appstore.domain.City}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.City}.
         */
        public static cn.edu.uestc.appstore.domain.City newInstance()
        {
            return new cn.edu.uestc.appstore.domain.CityImpl();
        }

        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.City}, taking all required and/or
         * read-only properties as arguments.
         */
        public static cn.edu.uestc.appstore.domain.City newInstance(java.lang.String name, java.lang.String code, java.lang.String provinceCode, java.lang.String provinceName)
        {
            final cn.edu.uestc.appstore.domain.City entity = new cn.edu.uestc.appstore.domain.CityImpl();
            entity.setName(name);
            entity.setCode(code);
            entity.setProvinceCode(provinceCode);
            entity.setProvinceName(provinceName);
            return entity;
        }

        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.City}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static cn.edu.uestc.appstore.domain.City newInstance(java.lang.String name, java.lang.String code, java.lang.String provinceCode, java.lang.String provinceName, java.util.Collection consumers, java.util.Collection personServProvs, java.util.Collection entServProvs)
        {
            final cn.edu.uestc.appstore.domain.City entity = new cn.edu.uestc.appstore.domain.CityImpl();
            entity.setName(name);
            entity.setCode(code);
            entity.setProvinceCode(provinceCode);
            entity.setProvinceName(provinceName);
            entity.setConsumers(consumers);
            entity.setPersonServProvs(personServProvs);
            entity.setEntServProvs(entServProvs);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}