class MathWizard {

    /**
     *  This is a simple function in a class that will add two abstract Numbers. Convert to byte so we can take advantage of '+' op
     *  Then return back as a generic number. Just to test and see how Abstract number conversion is working
     */
    fun add(a: Number, b: Number): Number {
        return a.toDouble() + b.toDouble() // 64bit conversion for highest capacity
    }
}