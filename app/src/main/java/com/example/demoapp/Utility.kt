package com.example.demoapp

class Utility{
    fun getQuestion() : ArrayList<Questions>
    {
        var list = ArrayList<Questions>()
        var q1 = Questions(1,"what is kotlin","programming language","modern language","scripting language","styling language",2)
        var q2 = Questions(2,"what is java","scripting language","modern language","programming language","styling language",3)
        var q3 = Questions(3,"kotlin developed by","Google","JetBrains","Microsoft","Adobe",2)
        var q4 = Questions(4,"which of following is used for null exception","Range","Sealed Class","Elvis Operator","Lambda function",3)
        var q5 = Questions(5,"which file extenstion is used to save kotli files",".java",".kot",".kt or .kts",".andriod",3)
        var q6 = Questions(6,"what is correct way to create array list in kotlin","val map = hashMapOf(1 to \"one\", 2 to \"two\", 3 to \"three\")","enum class Color {RED, GREEN, BLUE}","val list = arrayListOf(1, 2, 3)"," val set = hashSetOf(1, 2, 3)",3)
        var q7 = Questions(7,"what is immutable variable","A variable that cannot change, read-only","A variable that can be changed","A variable used for string interpolation","styling language",1)
        var q8 = Questions(8,"what of the following currently targets are not supported by kotlin","LLVM",".NET CLR","Javascript","html",2)
        var q9 = Questions(9,"how to make multi lined comment in kotlin","//","/* */","/ multi line comment /","#",3)
        var q10 = Questions(10,"which of the following constructors are available in kotlin","Primary constructor","Secondary constructor","Both 1 & 2","None of the above",3)
        list.add(q1)
        list.add(q2)
        list.add(q3)
        list.add(q4)
        list.add(q5)
        list.add(q6)
        list.add(q7)
        list.add(q8)
        list.add(q9)
        list.add(q10)
        return list
    }

}