data class Person(var name: String, var age: Int, var gender: String) {


}

fun main(args: Array<String>) {
    var Chioma = Person("Chioma", 20, "Female")
    group(Chioma)
    var Ifeanyi = Person("Ifeanyi", 22, "Male")
    group(Ifeanyi)
    displayGroup(Ifeanyi)
    var Chibuzor = Person("Chibuzor", 25, "Male")
    group(Chibuzor)
    displayGroup(Chioma)
    displayGroup(Chibuzor)
    displayAllGroups()
}


val males: ArrayList<String> = arrayListOf()
val females: ArrayList<String> = arrayListOf()

fun group(person: Person) {
    when (person.gender) {
        "Male" -> uploadToDatabase(person)
        "Female" -> uploadToDatabase(person)
    }
}

fun uploadToDatabase(person: Person) {
    when (person.gender) {
        "Male" -> males.add(person.name)
        "Female" -> females.add(person.name)
    }
}

fun displayGroup(person: Person) {
    if (person.gender == "Male") {
        println("${person.name} -> Male")
    } else if (person.gender == "Female") {
        println("${person.name} -> Female")
    }

}

fun displayAllGroups() {
    println("All;")
    println("Males:")
    for (value in males) {
        println(value)
    }
    println(">>>>")
    println("Females:")
    for (value in females) {
        println(value)
    }
    println(">>>>")
}
