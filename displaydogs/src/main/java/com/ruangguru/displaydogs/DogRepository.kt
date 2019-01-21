package com.ruangguru.displaydogs

import com.ruangguru.displaydogs.model.Dog
import com.ruangguru.displaydogs.model.Size

class DogRepository private constructor(){

    companion object {
        val instance = DogRepository()
    }

    fun getDogList(): List<Dog> {
        return ArrayList<Dog>().apply {
            add(
                Dog(
                    name = "Carlito",
                    age = 3,
                    breed = "Schnauzer",
                    image = "carlito.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Linus",
                    age = 6,
                    breed = "Great Dane",
                    image = "linus.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Lily",
                    age = 1,
                    breed = "Cairn",
                    image = "lily.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Snoop",
                    age = 9,
                    breed = "Dachshund",
                    image = "snoop.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Troy",
                    age = 3,
                    breed = "Staffordshire Bull Terrier",
                    image = "troy.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Sassy",
                    age = 7,
                    breed = "Appenzeller",
                    image = "sassy.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Jupiter",
                    age = 3,
                    breed = "Bernese Mountain",
                    image = "jupiter.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Suki",
                    age = 10,
                    breed = "Chihuahua",
                    image = "suki.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Bubba",
                    age = 3,
                    breed = "Poodle",
                    image = "bubba.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Destiny",
                    age = 8,
                    breed = "Bullmastiff",
                    image = "destiny.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Trinity",
                    age = 4,
                    breed = "Italian Greyhound",
                    image = "trinity.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Sleepy",
                    age = 5,
                    breed = "Komondor",
                    image = "sleepy.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Snowflake",
                    age = 3,
                    breed = "Maltese",
                    image = "snowflake.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Pancake",
                    age = 12,
                    breed = "Puggle",
                    image = "pancake.jpg",
                    size = Size.SMALL
                )
            )
        }
    }
}