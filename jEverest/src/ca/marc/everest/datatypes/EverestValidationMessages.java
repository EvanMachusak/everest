/* 
 * Copyright 2008-2011 Mohawk College of Applied Arts and Technology
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. You may 
 * obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations under 
 * the License.
 * 
 * User: Justin Fyfe
 * Date: 09-26-2012
 */
package ca.marc.everest.datatypes;

/**
 * A class which contains validation messages
 */
public final class EverestValidationMessages {
	
    public final static String MSG_NULLFLAVOR_WITH_VALUE = "Data type cannot carry a value when NullFlavor is present";
    public final static String MSG_NULLFLAVOR_MISSING = "Data type must carry a NullFlavor when no value is present";
    public final static String MSG_CODE_REQUIRES_CODESYSTEM = "When Code is present, CodeSystem must also be present";
    public final static String MSG_PROPERTY_NOT_PERMITTED = "%1 is not permitted on property %2";
    public final static String MSG_PROPERTY_NOT_POPULATED = "%1 must be populated and must contain a valid instance of %2";
    public final static String MSG_INVALID_VALUE = "'%1' is not a valid value for %2";
    public final static String MSG_DEPENDENT_VALUE_MISSING = "%1 cannot be populated unless %2 is populated";
    public final static String MSG_INSUFFICIENT_TERMS = "Collection does not contain sufficient number of terms";
    public final static String MSG_INDEPENDENT_VALUE = "When %1 is populated, %2 must not be populated";
    public final static String MSG_NULL_COLLECTION_VALUE = "Collection item cannot be null or null-flavored";
    public final static String MSG_PROPERTY_SCHEMA_ONLY = "%1 is only provided for compatibility with schemas and should not be used directly";
}
