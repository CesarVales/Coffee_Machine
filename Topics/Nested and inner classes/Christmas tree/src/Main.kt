class ChristmasTree(var color: String) {

    // create function putTreeTopper()
    fun putTreeTopper(color: String) {
        var treeTopper = TreeTopper(color)
        treeTopper.sparkle()
    }
    inner class TreeTopper(var color: String) {
        fun sparkle() {

            println("The sparkling ${this.color} tree topper looks stunning on the ${this@ChristmasTree.color}" +
                    " Christmas tree!")
        }
        // create function sparkle()
    }
}

