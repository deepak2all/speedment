/*
 *
 * Copyright (c) 2006-2020, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.runtime.core.internal.component.sql.override.def.reference;

import static java.util.Objects.requireNonNull;

import com.speedment.runtime.core.component.sql.SqlStreamOptimizerInfo;
import com.speedment.runtime.core.component.sql.override.reference.NoneMatchTerminator;
import com.speedment.runtime.core.internal.manager.sql.SqlStreamTerminator;
import com.speedment.runtime.core.internal.stream.builder.pipeline.ReferencePipeline;

import java.util.function.Predicate;

/**
 *
 * @author Per Minborg
 * @param <ENTITY> the original stream entity source type 
 */
public final class DefaultNoneMatchTerminator<ENTITY> implements NoneMatchTerminator<ENTITY> {

    private DefaultNoneMatchTerminator() {
    }

    @Override
    public <T> boolean apply(
        final SqlStreamOptimizerInfo<ENTITY> info,
        final SqlStreamTerminator<ENTITY> sqlStreamTerminator,
        final ReferencePipeline<T> pipeline,
        final Predicate<? super T> predicate
    ) {
        requireNonNull(info);
        requireNonNull(sqlStreamTerminator);
        requireNonNull(pipeline);
        requireNonNull(predicate);

        final ReferencePipeline<T> optimizedPipeline = sqlStreamTerminator.optimize(pipeline);
        return sqlStreamTerminator
            .attachTraceData(optimizedPipeline)
            .getAsReferenceStream().noneMatch(predicate);
    }

    public static final NoneMatchTerminator<?> DEFAULT = new DefaultNoneMatchTerminator<>();

}
