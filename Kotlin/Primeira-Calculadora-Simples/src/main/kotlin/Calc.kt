class Calc(var n1:Double, var n2:Double) {

    companion object {
        var result = 0.0

        fun suM(n1: Double, n2: Double):Double {

            n1 + n2
            result = n1 + n2
            return result

        }

        fun suB(n1: Double, n2: Double):Double {

            n1 - n2
            result = n1 - n2
            return result

        }

        fun diV(n1: Double, n2: Double):Double {

            n1 / n2
            result = n1 / n2
            return result

        }

        fun mulT(n1: Double, n2: Double):Double {

            n1 * n2
            result = n1 * n2
            return result

        }

    }
}