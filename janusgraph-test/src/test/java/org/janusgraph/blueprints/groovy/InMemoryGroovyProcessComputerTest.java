// Copyright 2017 JanusGraph Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.janusgraph.blueprints.groovy;

import org.janusgraph.blueprints.InMemoryGraphComputerProvider;
import org.janusgraph.core.JanusGraph;
import org.apache.tinkerpop.gremlin.GraphProviderClass;
import org.apache.tinkerpop.gremlin.process.GroovyProcessComputerSuite;
import org.junit.runner.RunWith;

/**
 * @author Bryn Cooke
 */
@RunWith(GroovyProcessComputerSuite.class)
@GraphProviderClass(provider = InMemoryGraphComputerProvider.class, graph = JanusGraph.class)
public class InMemoryGroovyProcessComputerTest {
}
