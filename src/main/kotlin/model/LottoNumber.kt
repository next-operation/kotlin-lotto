package model

import view.OUT_OF_RANGE_LOTTO_NUMBER_MESSAGE

const val MIN = 1
const val MAX = 45
val LOTTO_NUMBER_RANGE = MIN..MAX

class LottoNumber private constructor(val number: Int) {
    companion object {
        fun of(number: Int): LottoNumber {
            validRange(number)
            return LottoNumber(number)
        }

        private fun validRange(number: Int) {
            if (number !in LOTTO_NUMBER_RANGE) {
                throw IllegalArgumentException(OUT_OF_RANGE_LOTTO_NUMBER_MESSAGE)
            }
        }
    }
}