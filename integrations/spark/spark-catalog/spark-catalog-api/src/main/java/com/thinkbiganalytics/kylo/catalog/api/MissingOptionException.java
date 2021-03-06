package com.thinkbiganalytics.kylo.catalog.api;

/*-
 * #%L
 * Kylo Catalog API
 * %%
 * Copyright (C) 2017 - 2018 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import javax.annotation.Nullable;

/**
 * Thrown to indicate that a required data set option was not defined.
 */
public class MissingOptionException extends KyloCatalogException {

    private static final long serialVersionUID = -453339716817390889L;

    /**
     * Construct a {@code MissingOptionException} with the specified message.
     */
    public MissingOptionException(@Nullable final String message) {
        super(message);
    }
}
