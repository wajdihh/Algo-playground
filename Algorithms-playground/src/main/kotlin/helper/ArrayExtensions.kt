package helper

fun IntArray.showContent() {
    var text = "Array content is : "
    forEach {
        text += "$it | "
    }
    println("\n${text.dropLast(2)}")
}

fun <T> List<T>.showContent() {
    var text = "Array content is : "
    forEach {
        text += "$it | "
    }
    println("\n${text.dropLast(2)}")
}