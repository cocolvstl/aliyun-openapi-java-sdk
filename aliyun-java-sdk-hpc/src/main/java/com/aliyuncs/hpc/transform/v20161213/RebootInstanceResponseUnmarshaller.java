/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.hpc.transform.v20161213;

import com.aliyuncs.hpc.model.v20161213.RebootInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RebootInstanceResponseUnmarshaller {

	public static RebootInstanceResponse unmarshall(RebootInstanceResponse rebootInstanceResponse, UnmarshallerContext context) {
		
		rebootInstanceResponse.setRequestId(context.stringValue("RebootInstanceResponse.RequestId"));
	 
	 	return rebootInstanceResponse;
	}
}