package nl.joery.demo.animatedbottombar.playground.properties

abstract class Property(val name: String) {
    companion object {
        const val TYPE_INTEGER = 1
        const val TYPE_COLOR = 2
        const val TYPE_ENUM = 3
        const val TYPE_BOOLEAN = 4
        const val TYPE_CATEGORY = 5
    }
}