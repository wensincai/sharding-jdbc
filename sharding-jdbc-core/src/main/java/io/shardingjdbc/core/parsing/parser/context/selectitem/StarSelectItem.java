/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package io.shardingjdbc.core.parsing.parser.context.selectitem;

import io.shardingjdbc.core.parsing.lexer.token.Symbol;
import com.google.common.base.Optional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Select all item.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
@Getter
@ToString
public final class StarSelectItem implements SelectItem {
    
    private final Optional<String> owner;
    
    @Override
    public String getExpression() {
        return owner.isPresent() ? owner.get() + "." + Symbol.STAR.getLiterals() : Symbol.STAR.getLiterals();
    }
    
    @Override
    public Optional<String> getAlias() {
        return Optional.absent();
    }
}
