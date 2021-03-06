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

package org.opensaml.ws.wstrust.impl;

import java.util.List;

import org.opensaml.ws.wstrust.BinarySecret;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.schema.impl.XSBase64BinaryImpl;
import org.opensaml.xml.util.AttributeMap;

/**
 * BinarySecretImpl.
 * 
 */
public class BinarySecretImpl extends XSBase64BinaryImpl implements BinarySecret {

    /** The Type attribute value. */
    private String type;

    /** Wildcard attributes. */
    private AttributeMap unknownChildren;

    /**
     * Constructor.
     * 
     * @param namespaceURI namespace of the element
     * @param elementLocalName name of the element
     * @param namespacePrefix namespace prefix of the element
     */
    public BinarySecretImpl(String namespaceURI, String elementLocalName, String namespacePrefix) {
        super(namespaceURI, elementLocalName, namespacePrefix);
        unknownChildren = new AttributeMap(this);
    }

    /** {@inheritDoc} */
    public String getType() {
        return type;
    }

    /** {@inheritDoc} */
    public void setType(String newType) {
        type = prepareForAssignment(type, newType);
    }

    /** {@inheritDoc} */
    public AttributeMap getUnknownAttributes() {
        return unknownChildren;
    }

    /** {@inheritDoc} */
    public List<XMLObject> getOrderedChildren() {
        return null;
    }
    
}
