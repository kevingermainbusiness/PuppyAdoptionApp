package com.kevincodes.puppyadoptionapp.ext

import com.kevincodes.puppyadoptionapp.R
import com.kevincodes.puppyadoptionapp.data.Puppy

object DataSets {

    fun createPuppyList(): List<Puppy> {
        val puppyList = mutableListOf<Puppy>()
        puppyList.apply {
            add(
                Puppy(
                    0,
                    R.drawable.pauline_loroy_unsplash,
                    "Kinzo",
                    "Female",
                    true,
                    "Likes to party",
                    200.56F
                )
            )
            add(
                Puppy(
                    1,
                    R.drawable.karsten_winegeart_unsplash,
                    "Milou",
                    "Male",
                    false,
                    "Tickling every now and then",
                    230.67F
                )
            )
            add(
                Puppy(
                    2,
                    R.drawable.karsten_winegeart_1_unsplash,
                    "Medor",
                    "Male",
                    false,
                    "Very affectionate",
                    190.77F
                )
            )
            add(
                Puppy(
                    3,
                    R.drawable.sergiosouza_unsplash,
                    "Souza",
                    "Male",
                    false,
                    "Likes to cuddle",
                    210.00F
                )
            )
            add(
                Puppy(
                    4,
                    R.drawable.erin_minuskin_unsplash,
                    "Erin",
                    "Female",
                    false,
                    "Very playful",
                    205.00F
                )
            )
        }
        return puppyList
    }
}