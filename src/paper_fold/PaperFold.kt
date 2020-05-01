package paper_fold

import java.util.function.IntSupplier

class PaperFold : IntSupplier {

    private var currInd: Int = 0
    private var sequence = ArrayList<Int>()
    private var paddingNum: Int = 1 // it can be only zero or one

    init {
        sequence.add(1)
    }

    override fun getAsInt(): Int {
        var currValue: Int
        if (currInd >= sequence.size) {
            doubleSequence()
            currValue = getIntFromSequence()
        } else {
            currValue = getIntFromSequence()
        }
        return currValue
    }

    private fun getIntFromSequence() : Int {
        var currValue: Int = sequence.get(currInd)
        incrementCurrInd()
        return currValue
    }

    private fun incrementCurrInd() {
        currInd++
    }

    private fun doubleSequence() {
        var temporaryList = ArrayList<Int>()
        for (num in sequence) {
            temporaryList.add(getPaddingNum())
            temporaryList.add(num)
            changePaddingNum()
        }
        temporaryList.add(getPaddingNum()) // maybe it should be set to zero
        revertPadNumToInitialState()
        sequence = temporaryList
    }

    private fun getPaddingNum():Int {
        return paddingNum
    }

    private fun changePaddingNum() {
        if (paddingNum == 0) {
            paddingNum = 1
        } else if (paddingNum == 1) {
            paddingNum = 0
        }
    }

    private fun revertPadNumToInitialState() {
        paddingNum = 1
    }


}