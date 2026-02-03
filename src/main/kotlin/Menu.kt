import java.util.Scanner

class Menu(
    private val title: String,
    private val items: List<MenuItem>
) {

    private val scanner = Scanner(System.`in`)
    var exitRequested = false
        private set

    fun show() {
        while (true) {
            println()
            println(title)

            items.forEachIndexed { index, item ->
                println("$index. ${item.title}")
            }

            print("Введите номер пункта: ")
            val input = scanner.nextLine()

            val number = input.toIntOrNull()
            if (number == null) {
                println("Ошибка: нужно ввести число")
                continue
            }

            val item = items.getOrNull(number)
            if (item == null) {
                println("Ошибка: такого пункта нет")
                continue
            }

            item.action()
            return
        }
    }
}
