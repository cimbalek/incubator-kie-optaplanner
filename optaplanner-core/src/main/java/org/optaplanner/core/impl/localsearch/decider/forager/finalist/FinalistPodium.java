/*
 * Copyright 2014 JBoss Inc
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

package org.optaplanner.core.impl.localsearch.decider.forager.finalist;

import org.optaplanner.core.impl.localsearch.decider.forager.Forager;
import org.optaplanner.core.impl.localsearch.event.LocalSearchPhaseLifecycleListener;
import org.optaplanner.core.impl.localsearch.scope.LocalSearchMoveScope;
import org.optaplanner.core.impl.localsearch.scope.LocalSearchStepScope;

/**
 * @see AbstractFinalistPodium
 * @see DefaultFinalistPodium
 */
public interface FinalistPodium extends LocalSearchPhaseLifecycleListener {

    /**
     * See {@link Forager#addMove(LocalSearchMoveScope)}.
     * @param moveScope never null
     */
    void addMove(LocalSearchMoveScope moveScope);

    /**
     * See {@link Forager#pickMove(LocalSearchStepScope)}.
     * @param stepScope never null
     * @return sometimes null, for example if no move is selected
     */
    LocalSearchMoveScope pickMove(LocalSearchStepScope stepScope);

}
