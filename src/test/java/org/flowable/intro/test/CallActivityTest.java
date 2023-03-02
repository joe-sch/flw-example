/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.flowable.intro.test;

import org.flowable.engine.impl.test.PluggableFlowableTestCase;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.engine.test.Deployment;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Joerg
 */
public class CallActivityTest extends PluggableFlowableTestCase {

    @Test
    @Deployment(resources = {"org/flowable/test/bpmn/callactivity/parentprocess.bpmn20.xml",
                    "org/flowable/test/bpmn/callactivity/subprocess.bpmn20.xml" })
    public void testCallSimpleSubProcess() {
        /*Map params = new HashMap<String, String>();
        params.put("key1", "key1 - value1");
        params.put("key2", "key2 - value2");*/

        // ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("parentprocess", params);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("parentprocess");

        assertProcessEnded(processInstance.getId());
    }
}
