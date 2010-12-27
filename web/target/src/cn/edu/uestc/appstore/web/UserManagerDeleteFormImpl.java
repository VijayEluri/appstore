// license-header java merge-point
package cn.edu.uestc.appstore.web;

public class UserManagerDeleteFormImpl
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
        , cn.edu.uestc.appstore.web.DeleteUserForm
        , cn.edu.uestc.appstore.web.PopulateUserScreenForm
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 10747246971L;

    private cn.edu.uestc.appstore.vo.UserVO[] userVOs = null;
    private java.lang.Object[] userVOsValueList;
    private java.lang.Object[] userVOsLabelList;
    private java.lang.Long userId;
    private java.lang.Object[] userIdValueList;
    private java.lang.Object[] userIdLabelList;

    public UserManagerDeleteFormImpl()
    {
    }

    /**
     * Resets the given <code>userVOs</code>.
     */
    public void resetUserVOs()
    {
        this.userVOs = null;
    }

    public void setUserVOs(cn.edu.uestc.appstore.vo.UserVO[] userVOs)
    {
        this.userVOs = userVOs;
    }

    /**
     * 
     */
    public cn.edu.uestc.appstore.vo.UserVO[] getUserVOs()
    {
        return this.userVOs;
    }
    
    public java.lang.Object[] getUserVOsBackingList()
    {
        java.lang.Object[] values = this.userVOsValueList;
        java.lang.Object[] labels = this.userVOsLabelList;

        if (values == null || values.length == 0)
        {
            return values;
        }

        if (labels == null || labels.length == 0)
        {
            labels = values;
        }

        final int length = java.lang.Math.min(labels.length, values.length);
        java.lang.Object[] backingList = new java.lang.Object[length];

        for (int i=0; i<length; i++)
        {
            backingList[i] = new LabelValue(labels[i], values[i]);
        }

        return backingList;
    }

    public java.lang.Object[] getUserVOsValueList()
    {
        return this.userVOsValueList;
    }

    public void setUserVOsValueList(java.lang.Object[] userVOsValueList)
    {
        this.userVOsValueList = userVOsValueList;
    }

    public java.lang.Object[] getUserVOsLabelList()
    {
        return this.userVOsLabelList;
    }

    public void setUserVOsLabelList(java.lang.Object[] userVOsLabelList)
    {
        this.userVOsLabelList = userVOsLabelList;
    }

    public void setUserVOsBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("UserManagerDeleteFormImpl.setUserVOsBackingList requires non-null property arguments");
        }

        this.userVOsValueList = null;
        this.userVOsLabelList = null;

        if (items != null)
        {
            this.userVOsValueList = new java.lang.Object[items.size()];
            this.userVOsLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.userVOsValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.userVOsLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("UserManagerDeleteFormImpl.setUserVOsBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>userId</code>.
     */
    public void resetUserId()
    {
        this.userId = null;
    }

    public void setUserId(java.lang.Long userId)
    {
        this.userId = userId;
    }

    /**
     * 
     */
    public java.lang.Long getUserId()
    {
        return this.userId;
    }
    
    public java.lang.Object[] getUserIdBackingList()
    {
        java.lang.Object[] values = this.userIdValueList;
        java.lang.Object[] labels = this.userIdLabelList;

        if (values == null || values.length == 0)
        {
            return values;
        }

        if (labels == null || labels.length == 0)
        {
            labels = values;
        }

        final int length = java.lang.Math.min(labels.length, values.length);
        java.lang.Object[] backingList = new java.lang.Object[length];

        for (int i=0; i<length; i++)
        {
            backingList[i] = new LabelValue(labels[i], values[i]);
        }

        return backingList;
    }

    public java.lang.Object[] getUserIdValueList()
    {
        return this.userIdValueList;
    }

    public void setUserIdValueList(java.lang.Object[] userIdValueList)
    {
        this.userIdValueList = userIdValueList;
    }

    public java.lang.Object[] getUserIdLabelList()
    {
        return this.userIdLabelList;
    }

    public void setUserIdLabelList(java.lang.Object[] userIdLabelList)
    {
        this.userIdLabelList = userIdLabelList;
    }

    public void setUserIdBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("UserManagerDeleteFormImpl.setUserIdBackingList requires non-null property arguments");
        }

        this.userIdValueList = null;
        this.userIdLabelList = null;

        if (items != null)
        {
            this.userIdValueList = new java.lang.Object[items.size()];
            this.userIdLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.userIdValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.userIdLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("UserManagerDeleteFormImpl.setUserIdBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        this.userVOs = null;
    }

    public java.lang.String toString()
    {
        org.apache.commons.lang.builder.ToStringBuilder builder =
            new org.apache.commons.lang.builder.ToStringBuilder(this);
        builder.append("userVOs", this.userVOs);
        builder.append("userId", this.userId);
        return builder.toString();
    }

    /**
     * Allows you to clean all values from this form. Objects will be set to <code>null</code>, numeric values will be
     * set to zero and boolean values will be set to <code>false</code>. Backinglists for selectable fields will
     * also be set to <code>null</code>.
     */
    public void clean()
    {
        this.userVOs = null;
        this.userVOsValueList = null;
        this.userVOsLabelList = null;
        this.userId = null;
        this.userIdValueList = null;
        this.userIdLabelList = null;
    }

    /**
     * Override to provide population of current form with request parameters when validation fails.
     *
     * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public org.apache.struts.action.ActionErrors validate(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
        final org.apache.struts.action.ActionErrors errors = super.validate(mapping, request);
        if (errors != null && !errors.isEmpty())
        {
            // we populate the current form with only the request parameters
            Object currentForm = request.getSession().getAttribute("form");
            // if we can't get the 'form' from the session, try from the request
            if (currentForm == null)
            {
                currentForm = request.getAttribute("form");
            }
            if (currentForm != null)
            {
                final java.util.Map parameters = new java.util.HashMap();
                for (final java.util.Enumeration names = request.getParameterNames(); names.hasMoreElements();)
                {
                    final String name = String.valueOf(names.nextElement());
                    final String[] values = request.getParameterValues(name);

                    if (values.length == 1)
                    {
                        parameters.put(name, values[0]);
                    }
                    else
                    {
                        parameters.put(name, values);
                    }
                }
                try
                {
                    org.apache.commons.beanutils.BeanUtils.populate(currentForm, parameters);
                }
                catch (java.lang.Exception populateException)
                {
                    // ignore if we have an exception here (we just don't populate).
                }
            }
        }
        return errors;
    }

    public final static class LabelValue
    {
        private java.lang.Object label = null;
        private java.lang.Object value = null;

        public LabelValue(Object label, java.lang.Object value)
        {
            this.label = label;
            this.value = value;
        }

        public java.lang.Object getLabel()
        {
            return this.label;
        }

        public java.lang.Object getValue()
        {
            return this.value;
        }

        public java.lang.String toString()
        {
            return label + "=" + value;
        }
    }
}