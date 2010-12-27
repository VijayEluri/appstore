// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package cn.edu.uestc.appstore.domain;

/**
 * 
 */
public abstract class RunEnvironment
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 870747920966846958L;

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

    /**
     * Returns <code>true</code> if the argument is an RunEnvironment instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof RunEnvironment))
        {
            return false;
        }
        final RunEnvironment that = (RunEnvironment)object;
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
     * Constructs new instances of {@link cn.edu.uestc.appstore.domain.RunEnvironment}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.RunEnvironment}.
         */
        public static cn.edu.uestc.appstore.domain.RunEnvironment newInstance()
        {
            return new cn.edu.uestc.appstore.domain.RunEnvironmentImpl();
        }


        /**
         * Constructs a new instance of {@link cn.edu.uestc.appstore.domain.RunEnvironment}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static cn.edu.uestc.appstore.domain.RunEnvironment newInstance(java.lang.String name, java.lang.String code)
        {
            final cn.edu.uestc.appstore.domain.RunEnvironment entity = new cn.edu.uestc.appstore.domain.RunEnvironmentImpl();
            entity.setName(name);
            entity.setCode(code);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}