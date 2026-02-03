import java.util.Scanner

class CreateNoteMenu(
    private val archive: Archive
) {

    private val scanner = Scanner(System.`in`)

    fun show() {
        print("Введите название заметки: ")
        val title = scanner.nextLine().trim()

        if (title.isEmpty()) {
            println("Название заметки не может быть пустым")
            return
        }

        print("Введите текст заметки: ")
        val text = scanner.nextLine().trim()

        if (text.isEmpty()) {
            println("Текст заметки не может быть пустым")
            return
        }

        archive.notes.add(Note(title, text))
        println("Заметка создана")
    }
}
