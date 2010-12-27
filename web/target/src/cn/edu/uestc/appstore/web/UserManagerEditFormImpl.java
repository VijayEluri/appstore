// license-header java merge-point
package cn.edu.uestc.appstore.web;

public class UserManagerEditFormImpl
    extends org.apache.struts.validator.ValidatorForm
    implements java.io.Serializable
        , cn.edu.uestc.appstore.web.EditUserForm
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = -12155431761L;

    private java.lang.String username;
    private java.lang.Object[] usernameValueList;
    private java.lang.Object[] usernameLabelList;
    private java.lang.Long userId;
    private java.lang.Object[] userIdValueList;
    private java.lang.Object[] userIdLabelList;
    private java.lang.String realName;
    private java.lang.Object[] realNameValueList;
    private java.lang.Object[] realNameLabelList;
    private java.lang.String password;
    private java.lang.Object[] passwordValueList;
    private java.lang.Object[] passwordLabelList;

    public UserManagerEditFormImpl()
    {
    }

    /**
     * Resets the given <code>username</code>.
     */
    public void resetUsername()
    {
        this.username = null;
    }

    public void setUsername(java.lang.String username)
    {
        this.username = username;
    }

    /**
     * 
     */
    public java.lang.String getUsername()
    {
        return this.username;
    }
    
    public java.lang.Object[] getUsernameBackingList()
    {
        java.lang.Object[] values = this.usernameValueList;
        java.lang.Object[] labels = this.usernameLabelList;

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

    public java.lang.Object[] getUsernameValueList()
    {
        return this.usernameValueList;
    }

    public void setUsernameValueList(java.lang.Object[] usernameValueList)
    {
        this.usernameValueList = usernameValueList;
    }

    public java.lang.Object[] getUsernameLabelList()
    {
        return this.usernameLabelList;
    }

    public void setUsernameLabelList(java.lang.Object[] usernameLabelList)
    {
        this.usernameLabelList = usernameLabelList;
    }

    public void setUsernameBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("UserManagerEditFormImpl.setUsernameBackingList requires non-null property arguments");
        }

        this.usernameValueList = null;
        this.usernameLabelList = null;

        if (items != null)
        {
            this.usernameValueList = new java.lang.Object[items.size()];
            this.usernameLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.usernameValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.usernameLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("UserManagerEditFormImpl.setUsernameBackingList encountered an exception", ex);
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
            throw new IllegalArgumentException("UserManagerEditFormImpl.setUserIdBackingList requires non-null property arguments");
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
                throw new java.lang.RuntimeException("UserManagerEditFormImpl.setUserIdBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>realName</code>.
     */
    public void resetRealName()
    {
        this.realName = null;
    }

    public void setRealName(java.lang.String realName)
    {
        this.realName = realName;
    }

    /**
     * 
     */
    public java.lang.String getRealName()
    {
        return this.realName;
    }
    
    public java.lang.Object[] getRealNameBackingList()
    {
        java.lang.Object[] values = this.realNameValueList;
        java.lang.Object[] labels = this.realNameLabelList;

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

    public java.lang.Object[] getRealNameValueList()
    {
        return this.realNameValueList;
    }

    public void setRealNameValueList(java.lang.Object[] realNameValueList)
    {
        this.realNameValueList = realNameValueList;
    }

    public java.lang.Object[] getRealNameLabelList()
    {
        return this.realNameLabelList;
    }

    public void setRealNameLabelList(java.lang.Object[] realNameLabelList)
    {
        this.realNameLabelList = realNameLabelList;
    }

    public void setRealNameBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("UserManagerEditFormImpl.setRealNameBackingList requires non-null property arguments");
        }

        this.realNameValueList = null;
        this.realNameLabelList = null;

        if (items != null)
        {
            this.realNameValueList = new java.lang.Object[items.size()];
            this.realNameLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.realNameValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.realNameLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("UserManagerEditFormImpl.setRealNameBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * Resets the given <code>password</code>.
     */
    public void resetPassword()
    {
        this.password = null;
    }

    public void setPassword(java.lang.String password)
    {
        this.password = password;
    }

    /**
     * 
     */
    public java.lang.String getPassword()
    {
        return this.password;
    }
    
    public java.lang.Object[] getPasswordBackingList()
    {
        java.lang.Object[] values = this.passwordValueList;
        java.lang.Object[] labels = this.passwordLabelList;

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

    public java.lang.Object[] getPasswordValueList()
    {
        return this.passwordValueList;
    }

    public void setPasswordValueList(java.lang.Object[] passwordValueList)
    {
        this.passwordValueList = passwordValueList;
    }

    public java.lang.Object[] getPasswordLabelList()
    {
        return this.passwordLabelList;
    }

    public void setPasswordLabelList(java.lang.Object[] passwordLabelList)
    {
        this.passwordLabelList = passwordLabelList;
    }

    public void setPasswordBackingList(java.util.Collection items, java.lang.String valueProperty, java.lang.String labelProperty)
    {
        if (valueProperty == null || labelProperty == null)
        {
            throw new IllegalArgumentException("UserManagerEditFormImpl.setPasswordBackingList requires non-null property arguments");
        }

        this.passwordValueList = null;
        this.passwordLabelList = null;

        if (items != null)
        {
            this.passwordValueList = new java.lang.Object[items.size()];
            this.passwordLabelList = new java.lang.Object[items.size()];

            try
            {
                int i = 0;
                for (java.util.Iterator iterator = items.iterator(); iterator.hasNext(); i++)
                {
                    final java.lang.Object item = iterator.next();

                    this.passwordValueList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, valueProperty);
                    this.passwordLabelList[i] = org.apache.commons.beanutils.PropertyUtils.getProperty(item, labelProperty);
                }
            }
            catch (Exception ex)
            {
                throw new java.lang.RuntimeException("UserManagerEditFormImpl.setPasswordBackingList encountered an exception", ex);
            }
        }
    }

    /**
     * @see org.apache.struts.validator.ValidatorForm#reset(org.apache.struts.action.ActionMapping,javax.servlet.http.HttpServletRequest)
     */
    public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request)
    {
    }

    public java.lang.String toString()
    {
        org.apache.commons.lang.builder.ToStringBuilder builder =
            new org.apache.commons.lang.builder.ToStringBuilder(this);
        builder.append("username", this.username);
        builder.append("userId", this.userId);
        builder.append("realName", this.realName);
        builder.append("password", this.password);
        return builder.toString();
    }

    /**
     * Allows you to clean all values from this form. Objects will be set to <code>null</code>, numeric values will be
     * set to zero and boolean values will be set to <code>false</code>. Backinglists for selectable fields will
     * also be set to <code>null</code>.
     */
    public void clean()
    {
        this.username = null;
        this.usernameValueList = null;
        this.usernameLabelList = null;
        this.userId = null;
        this.userIdValueList = null;
        this.userIdLabelList = null;
        this.realName = null;
        this.realNameValueList = null;
        this.realNameLabelList = null;
        this.password = null;
        this.passwordValueList = null;
        this.passwordLabelList = null;
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