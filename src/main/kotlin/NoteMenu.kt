class NoteMenu(
    private val archive: Archive
) {

    fun show() {
        var back = false

        while (!back) {
            val items = mutableListOf<MenuItem>()

            items.add(
                MenuItem("Создать заметку") {
                    CreateNoteMenu(archive).show()
                }
            )

            for (note in archive.notes) {
                items.add(
                    MenuItem(note.title) {
                        NoteView(note).show()
                    }
                )
            }

            items.add(
                MenuItem("Назад") {
                    back = true
                }
            )

            Menu(
                title = "Архив: ${archive.title}",
                items = items
            ).show()
        }
    }
}
