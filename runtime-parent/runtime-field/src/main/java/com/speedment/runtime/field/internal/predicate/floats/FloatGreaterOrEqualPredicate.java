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
package com.speedment.runtime.field.internal.predicate.floats;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple1;
import com.speedment.runtime.field.internal.predicate.AbstractFieldPredicate;
import com.speedment.runtime.field.predicate.PredicateType;
import com.speedment.runtime.field.trait.HasFloatValue;

/**
 * A predicate that evaluates if a value is {@code >=} a specified {@code
 * float}.
 * 
 * @param <ENTITY> entity type
 * @param <D>      database type
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@GeneratedCode(value = "Speedment")
public final class FloatGreaterOrEqualPredicate<ENTITY, D> 
extends AbstractFieldPredicate<ENTITY, HasFloatValue<ENTITY, D>> 
implements Tuple1<Float> {
    
    private final float value;
    
    public FloatGreaterOrEqualPredicate(HasFloatValue<ENTITY, D> field, float value) {
        super(PredicateType.GREATER_OR_EQUAL, field, entity -> field.getAsFloat(entity) >= value);
        this.value = value;
    }
    
    @Override
    public Float get0() {
        return value;
    }
    
    @Override
    public FloatLessThanPredicate<ENTITY, D> negate() {
        return new FloatLessThanPredicate<>(getField(), value);
    }
}