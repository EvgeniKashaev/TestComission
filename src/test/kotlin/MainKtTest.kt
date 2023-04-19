import org.junit.Test
import org.junit.Assert.*

class MainKtTest {
    @Test
    fun testCommissionVKPlay() {

        val transferAmount = 1


        val result = commission(
            transferAmount = transferAmount
        )

        assertEquals(0, result)
    }

    @Test
    fun testCommissionVKPlayMistake() {
        val name = "VK Play"
        val transferAmount = 1000000
        val transferAmountMonth = 2

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(-1, result)
    }
    @Test
    fun testCommissionVKPlayMistake2() {
        val name = "VK Play"
        val transferAmount = 1000000
        val transferAmountMonth = 50000000

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(-1, result)
    }

    @Test
    fun testCommissionMasterCart() {

        val name = "MasterCart"
        val transferAmount = 10000000
        val transferAmountMonth = 20000000

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(-1, result)
    }
    @Test
    fun testCommissionMasterCart2() {

        val name = "MasterCart"
        val transferAmount = 350


        val result = commission(
            name = name, transferAmount = transferAmount
        )

        assertEquals(0, result)
    }
    @Test
    fun testCommissionMasterCart1() {

        val name = "MasterCart"
        val transferAmount = 10000000
        val transferAmountMonth = 0

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(-1, result)
    }

    @Test
    fun testCommissionMasterCartMistake() {

        val name = "MasterCart"
        val transferAmount = 2
        val transferAmountMonth = 2

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(20, result)
    }

    @Test
    fun testCommissionMaestro() {

        val name = "MasterCart"
        val transferAmount = 2
        val transferAmountMonth = 2

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(20, result)
    }
    @Test
    fun testCommissionMaestroMistake() {

        val name = "Maestro"
        val transferAmount = 10000000
        val transferAmountMonth = 20000000

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(-1, result)
    }

    @Test
    fun testCommissionVisa() {

        val name = "Visa"
        val transferAmount = 2
        val transferAmountMonth = 2

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(35, result)
    }

    @Test
    fun testCommissionVisaMistake() {

        val name = "Visa"
        val transferAmount = 10000000
        val transferAmountMonth = 20000000

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(-1, result)
    }

    @Test
    fun testCommissionMir() {

        val name = "Mir"
        val transferAmount = 2
        val transferAmountMonth = 2

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(35, result)
    }

    @Test
    fun testCommissionMirMistake() {

        val name = "Mir"
        val transferAmount = 10000000
        val transferAmountMonth = 20000000

        val result = commission(
            name = name, transferAmount = transferAmount, transferAmountMonth = transferAmountMonth
        )

        assertEquals(-1, result)
    }
    @Test
    fun testCommissionMistake() {

        val name = "Pay"
        val transferAmount = 0


        val result = commission(
            name = name, transferAmount = transferAmount
        )

        assertEquals(-1, result)
    }


}
