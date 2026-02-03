import java.util.Scanner

class CreateArchiveMenu(
    private val archives: MutableList<Archive>
) {

    private val scanner = Scanner(System.`in`)

    fun show() {
        print("Введите название архива: ")
        val title = scanner.nextLine().trim()

        if (title.isEmpty()) {
            println("Название архива не может быть пустым")
            return
        }

        archives.add(Archive(title))
        println("Архив создан")
    }
}
