package GameRefactor
/*
 Тут мы добавляем к родительскому классу вывод текста в консоль, т.е. функция класса - оповещение о статусе игры
 */
 class GameStatus : GameLogic() {


    override fun startGame() {
        do {
            println(startMessage)
            super.startGame()
        } while (CheckActiveGame)
    }

    override fun CheckNumberDifference() {
        super.CheckNumberDifference()
        if (difference > 5) println("Холодно")
        else if (difference > 2) println("Тепло")
        else println("Жгётся!")
    }

    override fun stopGame() {
        if (CheckActiveGame == true) println(endGameMessage)
        else println(outOfRangeMessage)
        CheckActiveGame = false
    }

    override fun CheckUserNumber() {
        println("Угадай число от 1 до 10: ")
        super.CheckUserNumber()
        print(happyFaceMessage)
    }

     override fun OutOfRangeIntNum() {
         super.OutOfRangeIntNum()
         println(outOfRangeInt)
     }
}