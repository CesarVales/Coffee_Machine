class Car(val make: String, val year: Int,var speed: Int = 0) {
    fun accelerate(){
        this.speed += 5
    }
    fun decelerate() {
        this.speed -= 5
        if (speed < 0) speed = 0
    }

    // write the methods here
}