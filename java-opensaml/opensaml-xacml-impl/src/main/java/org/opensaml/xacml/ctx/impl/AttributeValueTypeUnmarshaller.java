/*
 * Copyright 2008 Members of the EGEE Collaboration.
 * Copyright 2008 University Corporation for Advanced Internet Development, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensaml.xacml.ctx.impl;

import javax.xml.namespace.QName;

import org.opensaml.xacml.ctx.AttributeValueType;
import org.opensaml.xacml.impl.AbstractXACMLObjectUnmarshaller;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.io.UnmarshallingException;
import org.opensaml.xml.util.DatatypeHelper;
import org.opensaml.xml.util.XMLHelper;
import org.w3c.dom.Attr;

/** Unmarshaller for {@link AttributeValueType} objects. */
public class AttributeValueTypeUnmarshaller extends AbstractXACMLObjectUnmarshaller {
    
    /** Constructor. */
    public AttributeValueTypeUnmarshaller() {
        super();
    }
    
    /**
     * Constructor.
     * 
     * @param targetNamespaceURI the namespace URI of either the schema type QName or element QName of the elements this
     *            marshaller operates on
     * @param targetLocalName the local name of either the schema type QName or element QName of the elements this
     *            marshaller operates on
     */
    protected AttributeValueTypeUnmarshaller(String targetNamespaceURI, String targetLocalName) {
        super(targetNamespaceURI, targetLocalName);
    }

    /** {@inheritDoc} */
    protected void processAttribute(XMLObject xmlObject, Attr attribute) throws UnmarshallingException {
        AttributeValueType attributeValue = (AttributeValueType) xmlObject;

        QName attribQName = XMLHelper.getNodeQName(attribute);
        if (attribute.isId()) {
            attributeValue.getUnknownAttributes().registerID(attribQName);
        }
        attributeValue.getUnknownAttributes().put(attribQName, attribute.getValue());
    }

    /** {@inheritDoc} */
    protected void processChildElement(XMLObject parentXMLObject, XMLObject childXMLObject)
            throws UnmarshallingException {
       
        AttributeValueType attributeValue = (AttributeValueType) parentXMLObject;
        attributeValue.getUnknownXMLObjects().add(childXMLObject);  
   }

    /** {@inheritDoc} */
    protected void processElementContent(XMLObject xmlObject, String elementContent) {
        AttributeValueType attributeValue = (AttributeValueType) xmlObject;
        attributeValue.setValue(DatatypeHelper.safeTrimOrNullString(elementContent));
    }
}