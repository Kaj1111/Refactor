package GameRefactor
/*
Здесь мы создаем класс со строковыми полями, которые используем в дочерних классах
 */
open class Message {
    protected val outOfRangeInt = "Читать не умеешь?"
    protected val endGameMessage = "(¬_¬ )"
    protected val funnyFaceMessage = "(⌒‿⌒)"
    protected val happyFaceMessage = "╰(▔∀▔)╯"
    protected val sadFaceMessage = "(︶︹︺)"
    protected val deadFaceMessage = "(×﹏×)"
    protected val coldNumberMessage = "Холодно"
    protected val warmNumberMessage = "Тепло"
    protected val hotNumberMessage = "Жгётся!"
    protected val wrongNumberMessage = "Читать не умеешь?"
    protected val outOfRangeMessage = "$sadFaceMessage \nнепонятно, давай до свидания"
    protected val startMessage = "\nБудешь угадывать? (да/нет)"
    protected val beginGameMessage = "угадай число от 1 до 10"
}