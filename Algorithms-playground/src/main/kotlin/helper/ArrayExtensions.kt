package helper

fun IntArray.showContent() {
    var text = "Array content is : "
    forEach {
        text += "$it | "
    }
    println("\n${text.dropLast(2)}")
}