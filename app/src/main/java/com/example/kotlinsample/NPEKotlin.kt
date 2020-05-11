package com.example.kotlinsample

fun strLenNonNull(str : String): Int{
    return str.length
}

fun strLenNullable(str : String?): Int{
    if(str != null){
        return str.length
    } else {
        return 0
    }

}

fun strLastCharNullable(str: String?) : Char?{
    return str?.get(str.length -1)?: "".single()
}