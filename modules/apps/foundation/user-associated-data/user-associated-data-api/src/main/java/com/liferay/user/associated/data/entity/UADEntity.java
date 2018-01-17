/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.user.associated.data.entity;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author William Newbury
 */
public interface UADEntity {

	public default Map<String, Object> getEntityNonAnonymizableFieldNames(
			List<String> fieldNames)
		throws PortalException {

		return new HashMap<>();
	}

	public String getUADEntityId();

	public String getUADRegistryKey();

	public long getUserId();

}