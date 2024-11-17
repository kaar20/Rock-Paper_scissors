package com.example.rockpaperscissors

fun main(){

 /*   var again = readln().toBoolean()
    while (playerChoiceByNumber in 1..3)
    {
        when(again)
        {
            true-> playerChoiceByNumber = readln().toInt()

        else ->
            again =false

    }
        */

//    }

    var again = true
    while (again){
        var computerChoice =""
        var playerChoice = ""
        println("Rock, Paper, Scissors? Enter your choice")
        var playerChoiceByNumber = readln().toInt()

        playerChoice = when(playerChoiceByNumber){
            1 -> {
                "Rock"
            }
            2 -> {
                "Paper"
            }
            3 -> {
                "Scissors"
            }
            else -> {
                "Naga-la Tag waxaa Wadid"
            }


        }

        val randomNumber = (1..3).random()


        computerChoice = when (randomNumber) {
            1 -> {
                "Rock"
            }
            2 -> {
                "Paper"
            }
            3 -> {
                "Scissors"
            }
            else -> {
                "Naga-la Tag waxaa Wadid"
            }
        }
        println(computerChoice)
        println(playerChoice)

        val winner = when {
            computerChoice == playerChoice ->"Tie"
            playerChoice =="Rock" && computerChoice =="Scissors" ->"Player"
            playerChoice =="Paper"&& computerChoice=="Rock" ->"Player"
            playerChoice == "Scissors"&& computerChoice =="Paper" ->"Player"
            else->"Computer"
        }
        when (winner){
            "Tie"-> println("its Draw")
            else-> println("$winner Won!")
        }
        println("Try again :true or false")
        again= readln().toBoolean()

    }
}
