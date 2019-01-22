package com.ruangguru.displaydogs.di

import com.ruangguru.displaydogs.model.Dog
import com.ruangguru.displaydogs.model.Size
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun getDogList(): List<Dog> {
        return ArrayList<Dog>().apply {
            add(
                Dog(
                    name = "Carlito",
                    age = 3,
                    breed = "Schnauzer",
                    image = "https://i.imgur.com/G7XoZwn.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Linus",
                    age = 6,
                    breed = "Great Dane",
                    image = "https://i.imgur.com/Vk4J3C2.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Lily",
                    age = 1,
                    breed = "Cairn",
                    image = "https://i.imgur.com/ntPeGPA.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Snoop",
                    age = 9,
                    breed = "Dachshund",
                    image = "https://i.imgur.com/ntXNmmL.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Troy",
                    age = 3,
                    breed = "Staffordshire Bull Terrier",
                    image = "https://i.imgur.com/6H9gfdz.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Sassy",
                    age = 7,
                    breed = "Appenzeller",
                    image = "https://i.imgur.com/Wc0kbnt.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Jupiter",
                    age = 3,
                    breed = "Bernese Mountain",
                    image = "https://i.imgur.com/WXbVDce.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Suki",
                    age = 10,
                    breed = "Chihuahua",
                    image = "https://i.imgur.com/sSB2R91.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Bubba",
                    age = 3,
                    breed = "Poodle",
                    image = "https://i.imgur.com/PDnlWf8.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Destiny",
                    age = 8,
                    breed = "Bullmastiff",
                    image = "https://i.imgur.com/rtgtvII.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Trinity",
                    age = 4,
                    breed = "Italian Greyhound",
                    image = "https://i.imgur.com/AZCiWGU.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Sleepy",
                    age = 5,
                    breed = "Komondor",
                    image = "https://i.imgur.com/xXbeo2I.jpg",
                    size = Size.BIG
                )
            )
            add(
                Dog(
                    name = "Snowflake",
                    age = 3,
                    breed = "Maltese",
                    image = "https://i.imgur.com/JP8BqPS.jpg",
                    size = Size.SMALL
                )
            )
            add(
                Dog(
                    name = "Pancake",
                    age = 12,
                    breed = "Puggle",
                    image = "https://i.imgur.com/V83ign0.jpg",
                    size = Size.SMALL
                )
            )
        }
    }
}

