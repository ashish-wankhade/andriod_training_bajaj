package com.example.training_day4.data

import com.example.training_day4.R
import com.example.training_day4.model.Affirmation

class Datasource {
    fun loadAffirmation(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.aff1),
            Affirmation(R.string.aff2),
            Affirmation(R.string.aff3),
            Affirmation(R.string.aff4),
            Affirmation(R.string.aff5),
            Affirmation(R.string.aff6),

        )
    }
}