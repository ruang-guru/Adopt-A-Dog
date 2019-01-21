package com.ruangguru.displaydogs.model

enum class Size {
    SMALL,
    BIG
}

data class Dog(
    val name: String = "",
    val age: Int = 0,
    val breed: String,
    val image: String,
    val size: Size
) {
    override fun toString(): String {
        return "Hi. My name is $name and I am $age years old. I am of $breed breed and generally, dogs of my " +
                "breed are ${size.name.toLowerCase()}. Please like me, woof!"
    }
}

