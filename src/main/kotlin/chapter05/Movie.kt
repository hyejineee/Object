package chapter05

class Movie(
        private val titlle: String = "",
        private val runningTime: Duration = Duration(),
        private val fee: Money = Money(),
        private val discountConditions: List<DiscountCondition> = listOf()
) {


    fun calculateMovieFee(screening: Screening): Money {

    }

    private fun isDiscountable(screenging: Screening): Money {

    }

    private fun calculateDiscountAmount() {}


}
