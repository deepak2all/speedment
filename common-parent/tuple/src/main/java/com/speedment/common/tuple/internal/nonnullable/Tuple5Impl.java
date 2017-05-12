/**
 * 
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
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
package com.speedment.common.tuple.internal.nonnullable;

import com.speedment.common.tuple.Tuple5;
import com.speedment.common.tuple.Tuple;
import com.speedment.common.tuple.internal.AbstractTuple;

/**
 * An implementation class of a {@link Tuple5 }
 * 
 * @param <T0> type of element 0
 * @param <T1> type of element 1
 * @param <T2> type of element 2
 * @param <T3> type of element 3
 * @param <T4> type of element 4
 * 
 * @author Per Minborg
 */
public final class Tuple5Impl<T0, T1, T2, T3, T4> extends AbstractTuple implements Tuple5<T0, T1, T2, T3, T4> {
    
    /**
     * Constructs a {@link Tuple } of type {@link Tuple5 }.
     * 
     * @param e0 element 0
     * @param e1 element 1
     * @param e2 element 2
     * @param e3 element 3
     * @param e4 element 4
     */
    public Tuple5Impl(
            T0 e0,
            T1 e1,
            T2 e2,
            T3 e3,
            T4 e4) {
        super(Tuple5Impl.class, e0, e1, e2, e3, e4);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public T0 get0() {
        return ((T0) values[0]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public T1 get1() {
        return ((T1) values[1]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public T2 get2() {
        return ((T2) values[2]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public T3 get3() {
        return ((T3) values[3]);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public T4 get4() {
        return ((T4) values[4]);
    }
}