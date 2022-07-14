/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.configuration2.event;

import org.apache.commons.configuration2.AbstractConfiguration;
import org.apache.commons.configuration2.DatabaseConfigurationTestHelper;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.junit.After;
import org.junit.Before;

/**
 * A test class for the events generated by DatabaseConfiguration.
 *
 */
public class TestDatabaseConfigurationEvents extends AbstractTestConfigurationEvents {
    /** The test helper. */
    private DatabaseConfigurationTestHelper helper;

    @Override
    protected AbstractConfiguration createConfiguration() {
        try {
            return helper.setUpConfig();
        } catch (final ConfigurationException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    @Before
    public void setUp() throws Exception {
        helper = new DatabaseConfigurationTestHelper();
        helper.setUp();

        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        helper.tearDown();
    }
}
