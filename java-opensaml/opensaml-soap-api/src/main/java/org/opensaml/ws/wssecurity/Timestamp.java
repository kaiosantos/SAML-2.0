/*
 * Copyright 2008 Members of the EGEE Collaboration.
 * Copyright 2008 University Corporation for Advanced Internet Development, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opensaml.ws.wssecurity;

import javax.xml.namespace.QName;

import org.opensaml.xml.AttributeExtensibleXMLObject;
import org.opensaml.xml.ElementExtensibleXMLObject;

/**
 * The &lt;wsu:Timestamp&gt; element.
 * 
 * @see Created
 * @see Expires
 * 
 */
public interface Timestamp extends IdBearing, AttributeExtensibleXMLObject,
        ElementExtensibleXMLObject, WSSecurityObject {

    /** Element local name. */
    public static final String ELEMENT_LOCAL_NAME = "Timestamp";

    /** Qualified element name. */
    public static final QName ELEMENT_NAME =
        new QName(WSSecurityConstants.WSU_NS, ELEMENT_LOCAL_NAME, WSSecurityConstants.WSU_PREFIX);

    /**
     * Returns the &lt;wsu:Created&lt; child element.
     * 
     * @return the {@link Created} child element or <code>null</code>.
     */
    public Created getCreated();

    /**
     * Sets the &lt;wsu:Created&gt; child element.
     * 
     * @param created
     *            the {@link Created} child element to set.
     */
    public void setCreated(Created created);

    /**
     * Returns the &lt;wsu:Expires&gt; child element.
     * 
     * @return the {@link Expires} child element or <code>null</code>.
     */
    public Expires getExpires();

    /**
     * Sets the &lt;wsu:Expires&gt; child element.
     * 
     * @param expires
     *            the {@link Expires} child element or <code>null</code>.
     */
    public void setExpires(Expires expires);

}
