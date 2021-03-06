/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.coheigea.cxf.security.policy.common;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import org.apache.cxf.feature.Features;
import org.example.contract.doubleit.DoubleItPortType;
import org.example.schema.doubleit.DoubleIt;
import org.example.schema.doubleit.DoubleItResponse;

@WebService(targetNamespace = "http://www.example.org/contract/DoubleIt", 
            serviceName = "DoubleItService", 
            endpointInterface = "org.example.contract.doubleit.DoubleItPortType")
@Features(features = "org.apache.cxf.feature.LoggingFeature")              
public class DoubleItPortTypeImpl implements DoubleItPortType {
    
    @Resource
    WebServiceContext wsContext;

    public int doubleIt(int numberToDouble, String description) {
        return numberToDouble * 2;
    }
    
    public int doubleItSecured(int numberToDouble, String description) {
        return numberToDouble * 2;
    }
    
}
