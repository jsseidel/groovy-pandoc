package com.github.dfrommi.pandoc.types

import com.github.dfrommi.pandoc.types.annotation.Pandoc


/**
 * Small caps text
 *
 * @Example {@code Here are <span style="font-variant:small-caps;">smallcaps</span>}
 */
@Pandoc(callSuper = true, includeSuper = true)
class SmallCaps extends PandocTextElement implements Inline {

}
