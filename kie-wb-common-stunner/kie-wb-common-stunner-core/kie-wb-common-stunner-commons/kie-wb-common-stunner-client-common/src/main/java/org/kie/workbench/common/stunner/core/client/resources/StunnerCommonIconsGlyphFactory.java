/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
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
 */

package org.kie.workbench.common.stunner.core.client.resources;

import org.kie.workbench.common.stunner.core.client.shape.ImageStripGlyph;

public interface StunnerCommonIconsGlyphFactory {

    ImageStripGlyph DELETE = ImageStripGlyph.create(StunnerCommonIconsStrip.class, 0);

    ImageStripGlyph GEARS = ImageStripGlyph.create(StunnerCommonIconsStrip.class, 1);

    ImageStripGlyph FORM = ImageStripGlyph.create(StunnerCommonIconsStrip.class, 2);
}
