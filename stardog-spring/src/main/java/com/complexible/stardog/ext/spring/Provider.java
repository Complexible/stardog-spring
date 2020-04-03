/*
* Copyright (c) the original authors
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
package com.complexible.stardog.ext.spring;

import java.util.function.Supplier;

import com.complexible.stardog.api.ConnectionCredentials;

/**
 * Provider Interface
 *
 * Callback used in the DataSourceFactoryBean, used for providing a custom
 * Stardog factory, i.e. for an embedded environment
 *
 * @author Al Baker
 * @since 2.1.2
 */
public interface Provider {

    public void execute (String to, String url, Supplier<ConnectionCredentials> supplier);
    public void execute (String to, String url, String user, String pass);
}
