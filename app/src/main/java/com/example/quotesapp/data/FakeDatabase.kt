package com.example.quotesapp.data

class FakeDatabase private constructor() {

    val quoteDao = FakeQuoteDao()

    // singleton
    companion object {
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also { instance = it }
            }
    }
}