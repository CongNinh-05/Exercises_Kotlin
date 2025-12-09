// BAO BÚA KÉO

import kotlin.random.Random

const val RETURN_WIN = "WIN"
const val RETURN_LOSE = "LOSE"
const val RETURN_DRAW = "DRAW"

const val TURN_PAPER = "PAPER"
const val TURN_ROCK = "ROCK"
const val TURN_SCISSORS = "SCISSORS"

fun main(){
    println("GAME BAO KEO BUA")
    println("Bat dau tran chien!")

    while (true){
        println("1.BAO")
        println("2.BUA")
        println("3.KEO")

        //player
        var player1Turn = 0
        while (player1Turn < 1 || player1Turn > 3){
            print("Nhap vao doan danh cua ban: ")
            player1Turn = readln().toInt() ?: 0
        }
        val playerHand = getHand(player1Turn)
        println("Ban da chon: $player1Turn = $playerHand")

        //Computer
        val computerTurnFactor = Random.nextInt(10)
        var computerTurn = generaComputerHand(computerTurnFactor)
        val computerHand = getHand(computerTurn)
        println("Computer da chon: $computerTurn = $computerHand")

        //Result
        val result = battle(playerHand, computerHand)
        println(getResultMessge(result ))

        //Lựa chọn
        var select = 0
        while (select < 1 || select >2){
            print("Nhan 1 de tiep tuc, nhan 2 de end:")
            select = readln().toInt() ?: 0
        }
        if (select == 1){
            println("Tiep tuc tro choi!")
        }
        else{
            break
        }
    }
}

//battle
fun battle(player1Hand : String, player2Hand: String) : String{
    var result =  RETURN_DRAW
    when(player1Hand){
        TURN_PAPER -> {
            result = when(player2Hand){
                TURN_ROCK -> RETURN_WIN
                TURN_SCISSORS -> RETURN_LOSE
                else -> RETURN_DRAW
            }
        }
        TURN_ROCK-> {
            result = when(player2Hand){
                TURN_ROCK -> RETURN_DRAW
                TURN_SCISSORS -> RETURN_WIN
                else -> RETURN_LOSE
            }
        }
        TURN_SCISSORS -> {
            result = when(player2Hand){
                TURN_ROCK -> RETURN_LOSE
                TURN_SCISSORS -> RETURN_DRAW
                else -> RETURN_WIN
            }
        }
    }
    return result
}

//
fun getHand(turn : Int) : String {
    return when(turn){
        1 -> TURN_PAPER
        2 -> TURN_ROCK
        else -> TURN_SCISSORS
    }
}

//
fun generaComputerHand(computerTurnFactor : Int) : Int{
    return if (computerTurnFactor < 3){
        1
    } else if (computerTurnFactor < 8){
        2
    } else {
        3
    }
}

fun getResultMessge(resultString : String) : String{
    return when(resultString){
        RETURN_WIN -> {
            "YOU WIN!"
        }
        RETURN_LOSE -> {
            "YOU LOSE!"
        }
        else -> {
            "YOU DRAW!"
        }
    }
}