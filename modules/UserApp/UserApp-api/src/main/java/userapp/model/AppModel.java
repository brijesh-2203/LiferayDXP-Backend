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

package userapp.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the App service. Represents a row in the &quot;App_App&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>userapp.model.impl.AppModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>userapp.model.impl.AppImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see App
 * @generated
 */
@ProviderType
public interface AppModel extends BaseModel<App> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a app model instance should use the {@link App} interface instead.
	 */

	/**
	 * Returns the primary key of this app.
	 *
	 * @return the primary key of this app
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this app.
	 *
	 * @param primaryKey the primary key of this app
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the uuid of this app.
	 *
	 * @return the uuid of this app
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this app.
	 *
	 * @param uuid the uuid of this app
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the app ID of this app.
	 *
	 * @return the app ID of this app
	 */
	@AutoEscape
	public String getAppId();

	/**
	 * Sets the app ID of this app.
	 *
	 * @param appId the app ID of this app
	 */
	public void setAppId(String appId);

	/**
	 * Returns the description of this app.
	 *
	 * @return the description of this app
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this app.
	 *
	 * @param description the description of this app
	 */
	public void setDescription(String description);

	/**
	 * Returns the link of this app.
	 *
	 * @return the link of this app
	 */
	@AutoEscape
	public String getLink();

	/**
	 * Sets the link of this app.
	 *
	 * @param link the link of this app
	 */
	public void setLink(String link);

	/**
	 * Returns the logo url of this app.
	 *
	 * @return the logo url of this app
	 */
	@AutoEscape
	public String getLogoUrl();

	/**
	 * Sets the logo url of this app.
	 *
	 * @param logoUrl the logo url of this app
	 */
	public void setLogoUrl(String logoUrl);

	/**
	 * Returns the name of this app.
	 *
	 * @return the name of this app
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this app.
	 *
	 * @param name the name of this app
	 */
	public void setName(String name);

	@Override
	public App cloneWithOriginalValues();

}