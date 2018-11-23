/*
 * Copyright (c) 2008-2018 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.addon.saml.security.config;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;
import com.haulmont.cuba.core.config.defaults.Default;
import com.haulmont.cuba.core.config.defaults.DefaultBoolean;
import com.haulmont.cuba.core.config.defaults.DefaultInteger;
import com.haulmont.cuba.core.config.defaults.DefaultString;

/**
 * @author kuchmin
 */
@Source(type = SourceType.APP)
public interface SamlConfig extends Config {

    @Property("cuba.addon.saml.ssoLogout")
    @DefaultBoolean(false)
    Boolean getSsoLogout();

    @Property("cuba.addon.saml.loginUrl")
    @DefaultString("http://localhost:8080/app/saml/login")
    String getSamlLoginUrl();

    @Property("cuba.addon.saml.logoutUrl")
    @DefaultString("http://localhost:8080/app/saml/logout")
    String getSamlLogoutUrl();

    @Property("cuba.addon.saml.metadataUrl")
    @DefaultString("http://localhost:8080/app/saml/metadata")
    String getSamlMetadataUrl();

    @Property("cuba.addon.saml.proxy.enabled")
    @DefaultBoolean(false)
    Boolean getProxyEnabled();

    @Property("cuba.addon.saml.proxy.scheme")
    @Default("http")
    String getProxyScheme();

    @Property("cuba.addon.saml.proxy.serverName")
    @Default("localhost")
    String getProxyServerName();

    @Property("cuba.addon.saml.proxy.serverPort")
    @DefaultInteger(80)
    Integer getProxyServerPort();

    @Property("cuba.addon.saml.proxy.includePort")
    @DefaultBoolean(false)
    Boolean getProxyIncludePort();

    @Property("cuba.addon.saml.proxy.contextPath")
    @Default("/")
    String getProxyContextPath();
}
