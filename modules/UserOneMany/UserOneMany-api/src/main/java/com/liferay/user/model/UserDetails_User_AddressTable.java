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

package com.liferay.user.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;UserDetails_User_Address&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see User
 * @see Address
 * @generated
 */
public class UserDetails_User_AddressTable
	extends BaseTable<UserDetails_User_AddressTable> {

	public static final UserDetails_User_AddressTable INSTANCE =
		new UserDetails_User_AddressTable();

	public final Column<UserDetails_User_AddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<UserDetails_User_AddressTable, Long> usId =
		createColumn("usId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<UserDetails_User_AddressTable, Long> addressId =
		createColumn(
			"addressId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);

	private UserDetails_User_AddressTable() {
		super("UserDetails_User_Address", UserDetails_User_AddressTable::new);
	}

}