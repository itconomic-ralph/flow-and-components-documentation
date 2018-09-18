/*
 * Copyright 2000-2018 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.tutorial.advanced;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.shared.communication.PushMode;
import com.vaadin.flow.shared.ui.Transport;

// code for advanced/tutorial-push-configuration.asciidoc
public class PushConfiguration {
    @Push
    public class MyLayout extends Div implements RouterLayout {
    }

    // Dummy classes just to have somewhere to put the annotation variants
    @Push(PushMode.MANUAL)
    public class Dummy1 {

    }

    // Dummy classes just to have somewhere to put the annotation variants
    @Push(transport = Transport.LONG_POLLING)
    public class Dummy2 {

    }

}
