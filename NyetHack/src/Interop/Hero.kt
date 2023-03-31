package Interop

fun main(args: Array<String>) {

    val adversary = Jhava()
    println(adversary.utterGreeting())

    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.toLowerCase() ?: "It's complicated")

    val adversaryHitPoints = adversary.hitPoints
    println(adversaryHitPoints.dec())
}