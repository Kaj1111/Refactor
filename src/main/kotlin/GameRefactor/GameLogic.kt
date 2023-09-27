package GameRefactor

import kotlin.random.Random
import kotlin.math.abs

/*
    Здесь мы реализуем логику работы программы,
    описываем ее поведение в зависимости от действий игрока, т.е. функция класса - создание логики работы программы
 */


open class GameLogic: Message(), gameInterface{

    open var random_number: Int? = null //К сожалению котлин не позволяет задавать int,
                                   // double и boolean как lateinit, по крайней мере обходных путей я не знаю
                                   // поэтому начальное значение задано как null
    open lateinit var UserAnswer: String
    open var CheckActiveGame = true
    open lateinit var USER_NUMBER: String
    open var difference = 0


    private fun GetRandomInit() {
        random_number = Random.nextInt(1, 11)
        CheckUserNumber()
    }



    override fun startGame() {
        UserAnswer = readln()
        if (UserAnswer == "да") {
            CheckActiveGame = true
            GetRandomInit()
        }
        else {
            if (UserAnswer != "нет") CheckActiveGame = false
            stopGame()
            }
        }


    open fun CheckUserNumber() {
        USER_NUMBER = readln()
        while(USER_NUMBER.toInt() != random_number){
            if (USER_NUMBER.toInt() > 10 || USER_NUMBER.toInt() < 1) OutOfRangeIntNum()
            else CheckNumberDifference()
            USER_NUMBER = readln()
        }
    }

    open fun CheckNumberDifference() {
    difference =  abs(USER_NUMBER.toInt() - random_number!!)
    }


    override fun stopGame() {
    }

    open fun OutOfRangeIntNum() {
    }

}