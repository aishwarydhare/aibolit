/*
 * Copyright (C) 2011 Alexey Danilov
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
package com.danikula.aibolit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import android.text.TextWatcher;
import android.widget.TextView;

import com.danikula.aibolit.Aibolit;

/**
 * Anotation is used for injecting {@link TextWatcher#onTextChanged(CharSequence, int, int, int)} method for specified
 * {@link TextView}. See docs for {@link Aibolit} for more information.
 * 
 * <p>
 * Usage:
 * 
 * <pre>
 * &#064;InjectOnTextChangedListener(R.id.editText)
 * private void onSearchTextChanged(CharSequence s, int start, int before, int count) {
 *     // process event
 * }
 * </pre>
 * 
 * </p>
 * 
 * @see Aibolit
 * @see TextWatcher
 * 
 * @author Alexey Danilov
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectOnTextChangedListener {

    /**
     * Returns identifier of view to be used for setting listener
     * 
     * @return int view id. View must be instance of {@link TextView} 
     */
    int value();

}
