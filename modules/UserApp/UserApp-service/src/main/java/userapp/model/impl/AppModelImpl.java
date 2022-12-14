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

package userapp.model.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

import userapp.model.App;
import userapp.model.AppModel;

/**
 * The base model implementation for the App service. Represents a row in the &quot;App_App&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AppModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AppImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AppImpl
 * @generated
 */
@JSON(strict = true)
public class AppModelImpl extends BaseModelImpl<App> implements AppModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a app model instance should use the <code>App</code> interface instead.
	 */
	public static final String TABLE_NAME = "App_App";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"appId", Types.VARCHAR},
		{"description", Types.VARCHAR}, {"link", Types.VARCHAR},
		{"logoUrl", Types.VARCHAR}, {"name", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("appId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("link", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("logoUrl", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table App_App (uuid_ VARCHAR(75) null,appId VARCHAR(75) not null primary key,description VARCHAR(75) null,link VARCHAR(75) null,logoUrl VARCHAR(75) null,name VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table App_App";

	public static final String ORDER_BY_JPQL = " ORDER BY app.appId ASC";

	public static final String ORDER_BY_SQL = " ORDER BY App_App.appId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long APPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public AppModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _appId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setAppId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _appId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return App.class;
	}

	@Override
	public String getModelClassName() {
		return App.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<App, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<App, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<App, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((App)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<App, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<App, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((App)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<App, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<App, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<App, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<App, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<App, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<App, Object>>();
		Map<String, BiConsumer<App, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<App, ?>>();

		attributeGetterFunctions.put("uuid", App::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<App, String>)App::setUuid);
		attributeGetterFunctions.put("appId", App::getAppId);
		attributeSetterBiConsumers.put(
			"appId", (BiConsumer<App, String>)App::setAppId);
		attributeGetterFunctions.put("description", App::getDescription);
		attributeSetterBiConsumers.put(
			"description", (BiConsumer<App, String>)App::setDescription);
		attributeGetterFunctions.put("link", App::getLink);
		attributeSetterBiConsumers.put(
			"link", (BiConsumer<App, String>)App::setLink);
		attributeGetterFunctions.put("logoUrl", App::getLogoUrl);
		attributeSetterBiConsumers.put(
			"logoUrl", (BiConsumer<App, String>)App::setLogoUrl);
		attributeGetterFunctions.put("name", App::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<App, String>)App::setName);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public String getAppId() {
		if (_appId == null) {
			return "";
		}
		else {
			return _appId;
		}
	}

	@Override
	public void setAppId(String appId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_appId = appId;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_description = description;
	}

	@JSON
	@Override
	public String getLink() {
		if (_link == null) {
			return "";
		}
		else {
			return _link;
		}
	}

	@Override
	public void setLink(String link) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_link = link;
	}

	@JSON
	@Override
	public String getLogoUrl() {
		if (_logoUrl == null) {
			return "";
		}
		else {
			return _logoUrl;
		}
	}

	@Override
	public void setLogoUrl(String logoUrl) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_logoUrl = logoUrl;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public App toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, App> escapedModelProxyProviderFunction =
				EscapedModelProxyProviderFunctionHolder.
					_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AppImpl appImpl = new AppImpl();

		appImpl.setUuid(getUuid());
		appImpl.setAppId(getAppId());
		appImpl.setDescription(getDescription());
		appImpl.setLink(getLink());
		appImpl.setLogoUrl(getLogoUrl());
		appImpl.setName(getName());

		appImpl.resetOriginalValues();

		return appImpl;
	}

	@Override
	public App cloneWithOriginalValues() {
		AppImpl appImpl = new AppImpl();

		appImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		appImpl.setAppId(this.<String>getColumnOriginalValue("appId"));
		appImpl.setDescription(
			this.<String>getColumnOriginalValue("description"));
		appImpl.setLink(this.<String>getColumnOriginalValue("link"));
		appImpl.setLogoUrl(this.<String>getColumnOriginalValue("logoUrl"));
		appImpl.setName(this.<String>getColumnOriginalValue("name"));

		return appImpl;
	}

	@Override
	public int compareTo(App app) {
		String primaryKey = app.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof App)) {
			return false;
		}

		App app = (App)object;

		String primaryKey = app.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<App> toCacheModel() {
		AppCacheModel appCacheModel = new AppCacheModel();

		appCacheModel.uuid = getUuid();

		String uuid = appCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			appCacheModel.uuid = null;
		}

		appCacheModel.appId = getAppId();

		String appId = appCacheModel.appId;

		if ((appId != null) && (appId.length() == 0)) {
			appCacheModel.appId = null;
		}

		appCacheModel.description = getDescription();

		String description = appCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			appCacheModel.description = null;
		}

		appCacheModel.link = getLink();

		String link = appCacheModel.link;

		if ((link != null) && (link.length() == 0)) {
			appCacheModel.link = null;
		}

		appCacheModel.logoUrl = getLogoUrl();

		String logoUrl = appCacheModel.logoUrl;

		if ((logoUrl != null) && (logoUrl.length() == 0)) {
			appCacheModel.logoUrl = null;
		}

		appCacheModel.name = getName();

		String name = appCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			appCacheModel.name = null;
		}

		return appCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<App, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<App, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<App, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((App)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<App, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<App, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<App, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((App)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, App>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					App.class, ModelWrapper.class);

	}

	private String _uuid;
	private String _appId;
	private String _description;
	private String _link;
	private String _logoUrl;
	private String _name;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<App, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((App)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("appId", _appId);
		_columnOriginalValues.put("description", _description);
		_columnOriginalValues.put("link", _link);
		_columnOriginalValues.put("logoUrl", _logoUrl);
		_columnOriginalValues.put("name", _name);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("appId", 2L);

		columnBitmasks.put("description", 4L);

		columnBitmasks.put("link", 8L);

		columnBitmasks.put("logoUrl", 16L);

		columnBitmasks.put("name", 32L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private App _escapedModel;

}