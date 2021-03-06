package com.github.dfrommi.pandoc
/**
 * Static wrapper to simplify default access to common objects.
 */
class Pandoc {
  /**
   * The factory
   */
  static PandocFactory factory = new PandocFactory()

  /**
   * Static delegate to filter routine.
   *
   * @see PandocFilter#toJSONFilter(java.lang.Class, groovy.lang.Closure)
   */
  static toJSONFilter(Class conditionClass, Closure action) {
    factory.filter.toJSONFilter(conditionClass, action)
  }

  /**
   * Static delegate to filter routine.
   *
   * @see PandocFilter#toJSONFilter(groovy.lang.Closure)
   */
  static toJSONFilter(Closure action) {
    factory.filter.toJSONFilter(action)
  }

  /**
   * Static delegate to filter routine.
   *
   * @see PandocFilter#toJSONFilter(groovy.lang.Closure, groovy.lang.Closure)
   */
  static toJSONFilter(Closure<Boolean> condition, Closure action) {
    factory.filter.toJSONFilter(condition, action)
  }
}
