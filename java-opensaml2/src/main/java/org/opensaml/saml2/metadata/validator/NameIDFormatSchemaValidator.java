/*
 * Copyright [2005] [University Corporation for Advanced Internet Development, Inc.]
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

/**
 * 
 */

package org.opensaml.saml2.metadata.validator;

import org.opensaml.saml2.metadata.NameIDFormat;
import org.opensaml.xml.util.DatatypeHelper;
import org.opensaml.xml.validation.ValidationException;
import org.opensaml.xml.validation.Validator;

/**
 * Checks {@link org.opensaml.saml2.metadata.NameIDFormat} for Schema compliance.
 */
public class NameIDFormatSchemaValidator implements Validator<NameIDFormat> {

    /** Constructor */
    public NameIDFormatSchemaValidator() {

    }

    /** {@inheritDoc} */
    public void validate(NameIDFormat nameIDFormat) throws ValidationException {
        validateFormat(nameIDFormat);
    }

    /**
     * Checks that Format is present.
     * 
     * @param nameIDFormat
     * @throws ValidationException
     */
    protected void validateFormat(NameIDFormat nameIDFormat) throws ValidationException {
        if (DatatypeHelper.isEmpty(nameIDFormat.getFormat())) {
            throw new ValidationException("Format required");
        }
    }
}