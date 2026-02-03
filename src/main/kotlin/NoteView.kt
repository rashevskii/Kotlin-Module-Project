class NoteView(
    private val note: Note
) {

    fun show() {
        println()
        println(note.title)
        println("----------")
        println(note.text)
        println()
        println("Нажмите Enter для возврата")
        readLine()
    }
}
