package net.frommknecht.pandoc.util

import net.frommknecht.pandoc.types.annotation.Child

/**
 * Walkable objects. 
 */
trait Walkable {
	/**
	 * Map of child objects
	 * @return Map with property name as key and child value list as value
	 */
	def getChildren() {
		def children = [:]
		AnnotationHelper.findAllFieldsWithAnnotation(this.class, Child).each { AnnotatedFieldInfo<Child> afi ->
			children << [(afi.name): afi.getFieldValue(this)]
		}
		children
	}
}