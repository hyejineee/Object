package chapter05

import java.time.LocalDateTime

class Screening {

    private val movie: Movie by lazy { Movie() }
    private val sequence: Int = 0
    private val whenScreened: LocalDateTime = LocalDateTime.now()

    fun reserve(customer: Customer, audienceCount: Int): Reservation {
        return Reservation(customer, this, calculateFee(audienceCount), audienceCount)
    }

    private fun calculateFee(audienceCount: Int) {
        return movie.calculateMovieFee(this).times(audienceCount)
    }
}